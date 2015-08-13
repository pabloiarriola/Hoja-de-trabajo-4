/*
Universidad del Valle de Guatemala
Seccion: 10
Yasmin Valdez , 14079
Bryan Chan, 14469
*/

//Se importa la excepcion para cuando no se encuentra el archivo
import java.io.FileNotFoundException;

//Interfaz que se implementara en la clase Calculadora
public interface ADTCalculadora<P> {
	
	//Metodo que leera el archivo
	public void readFile(String file) throws FileNotFoundException, Exception;
	
	//Metodo que calcula el resultado de la operacion en formato postfix
	public P calcular() throws Exception;
	
}