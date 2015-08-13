
/*
Universidad del Valle de Guatemala
Seccion: 10
Yasmin Valdez , 14079
Bryan Chan, 14469
*/

//Se importan las librerias a utilizar
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

	
public class Calculadora implements ADTCalculadora<Object>{
	    
		//Variable que almacena el resultado de la operacion postfix
		private Double total;
	    //Variable en donde se carga el String que contiene la operacion postfix
	    private String data;
	    
	    
	    public Calculadora(int tipo){
	    	if(tipo==1){
	    		private AbstractPila<Double> ingreso = new AbstractPila<Double>();
	    	}
	    	if(tipo==2){
	    		private Stack<Double> ingreso = new Stack<Double>();
	    	}
	    	if(tipo==3){
	    		private SimplementeEnlazada<Double> ingreso = new SimplementeEnlazada<Double>();
	    	}
	    	if(tipo==4){
	    		private DoblementeEnlazada<Double> ingreso = new DoblementeEnlazada<Double>();
	    	}
	    	if(tipo==5){
	    		private Circular<Double> ingreso = new Circular<Double>();
	    	}
	    	
	    }
	    
	    
	    
	  //Metodo que leera el archivo
	    public void readFile(String file) throws FileNotFoundException {
	       
	        FileReader Lector_fila = new FileReader(file);
	        BufferedReader Lector_buffered = new BufferedReader(Lector_fila);
	        try {
	                data = Lector_buffered.readLine();
	    	        Lector_buffered.close();
	        } catch (IOException e) {
	                e.printStackTrace();
	        }		
		
	    }
	    
	    //Metodo que calcula el resultado de la operacion en formato postfix
	    public Object calcular() throws Exception{
	    	char[] caracteres = data.toCharArray();

	    	//Se lee caracter por caracter
			for (int i = 0; i < data.length(); i++){
				//Caso en el que se encuentra el signo +
				if (caracteres[i]== '+'){
							//Se hace push al resultado con los dos operandos obtenidos de pops a la pila
		                    ingreso.push(ingreso.pop()+ingreso.pop());
				}
				//Caso en el que se encuentra el signo -
		                else if (caracteres[i]== '-'){
		                	//Se extraen los valores de la pila hacia variables temporales, para poder realizar la resta en el sentido correcto
		                	double temp1 = ingreso.pop();
		                	double temp2 = ingreso.pop();
							//Se hace push al resultado con los dos operandos obtenidos de pops a la pila
		                    ingreso.push(temp2-temp1);
				}
				//Caso en el que se encuentra el signo *
		                else if (caracteres[i]== '*'){
							//Se hace push al resultado con los dos operandos obtenidos de pops a la pila
		                    ingreso.push(ingreso.pop()*ingreso.pop());
				}            
				//Caso en el que se encuentra el signo /
		                else if (caracteres[i]== '/'){
							//Se hace push al resultado con los dos operandos obtenidos de pops a la pila
		                	//Se extraen los valores de la pila hacia variables temporales, para poder realizar la division en el sentido correcto
		                    double char1 =ingreso.pop();
		                    double char2 =ingreso.pop();
		                    ingreso.push(char2/char1);
				}
				//Caso en el que se encuentra un espacio vacio
		                else if (caracteres[i]== ' '){
		                    ;
				}else {
		                    ingreso.push(Double.parseDouble(""+caracteres[i]));
		                            }
			}          
	        total = ingreso.pop();
	        
	        return total;
	        
	    }
	
}