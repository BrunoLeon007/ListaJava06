package exercicios;

import java.util.Scanner;

public class EstacoesAno {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite um número de 1 a 4: ");
		    int estacao = scanner.nextInt();

		    switch (estacao) {
		      case 1:
		        System.out.println("Primavera");
		        break;
		      case 2:
		        System.out.println("Verão");
		        break;
		      case 3:
		        System.out.println("Outono");
		        break;
		      case 4:
		        System.out.println("Inverno");
		        break;
		      default:
		        System.out.println("Número inválido");
		    }

		    scanner.close();
		  }
		}

	


