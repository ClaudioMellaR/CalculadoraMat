/* 
 * Programa que calcula operaciones matemáticas
 */
package Calculadora;
import java.util.Scanner;

public class calculos {
static Scanner sc = new Scanner(System.in);
static int num1=0;
static int num2=0;

public static void main(String[] args) {
	int op = 0;
		// TODO Auto-generated method stub
		do{
			System.out.println("--------------------");
			System.out.println("----------Menú------");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Salir");
			System.out.println("---------------");
			System.out.println("Seleccione una opción");
			op = sc.nextInt();
			
				switch (op) { 
					case 1:
						ingreso();
						sumar();
					    break;
					case 2:
						ingreso();
						restar();
						break;
		    	    case 3 :
		    	    	ingreso();
						multiplicar();
						break;
		    	    case 4 :
		    	    	ingreso();
						dividir();
						break;
		    	    case 5 :
		    	    	break;
		    	    default:
		    	    	System.out.println("Opción no es valida");
		  }
		} while (op!=5) ;

			
	}
		static void ingreso() {
			System.out.println("Ingrese número 1");
			num1= sc.nextInt();
			System.out.println("Ingrese número 2");
			num2= sc.nextInt();
		}
		static void sumar() {
			System.out.println("El resultado de la suma es "+(num1+num2));
		}
		static void restar() {
			System.out.println("El resultado de la resta es "+(num1-num2));
		}
		static void multiplicar() {
			System.out.println("El resultado de la multiplicación es "+(num1*num2));
		}
		static void dividir() {
			System.out.println("El resultado de la división es "+(num1/num2));
		}
}
