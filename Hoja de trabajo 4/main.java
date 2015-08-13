/*
Universidad del Valle de Guatemala
Seccion: 10
Yasmin Valdez , 14079
Bryan Chan, 14469
*/

import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Se crea el objeto calculadora
        Calculadora calculadora = new Calculadora();
        //Se lee el archivo a operar
        calculadora.readFile("/Users/bchangip/Documents/workspace/Hoja de trabajo 2/src/datos.txt");
        //Se encierra el metodo calcular ya que puede devolver la excepcion de que el formato postfix es incorrecto
        try{
        	double resultado = (double) calculadora.calcular();
        	//Se imprime el resultado
        	System.out.println("El resultado es: "+resultado);
        } catch(Exception e){
        	//En caso de tener un formato postfix incorrecto se le notifica al usuario
        	System.out.println("La notacion postfix en el archivo es incorrecta");
        }
	}
}