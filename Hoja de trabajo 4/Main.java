/*
Universidad del Valle de Guatemala
Seccion: 10
Yasmin Valdez , 14079
Bryan Chan, 14469
*/

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void Main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Se le pregunta al usuario que tipo de listas quiere utilizar
		System.out.println("1.ArrayList\n2.Vector\n3.Lista simplemente enlazada\n4.Lista doblemente enlazada\n5.Lista circular");
		int seleccion = entrada.nextInt();

		
		//Se crea el objeto calculadora
        Calculadora calculadora = new Calculadora(seleccion);
        
        
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