package exercicios;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite o comprimento do lado 1: ");
		    double lado1 = scanner.nextDouble();

		    System.out.print("Digite o comprimento do lado 2: ");
		    double lado2 = scanner.nextDouble();

		    System.out.print("Digite o comprimento do lado 3: ");
		    double lado3 = scanner.nextDouble();

		    if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
		      if (lado1 == lado2 && lado2 == lado3) {
		        System.out.println("O triângulo é equilátero.");
		      } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
		        System.out.println("O triângulo é isósceles.");
		      } else {
		        System.out.println("O triângulo é escaleno.");
		      }
		    } else {
		      System.out.println("Os lados não formam um triângulo.");
		    }

		    scanner.close();
		  }
		}

	


