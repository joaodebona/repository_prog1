package pack1;


import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		 	Scanner valor = new Scanner(System.in);
	        System.out.println("Informe o valor A:");
	        int a = valor.nextInt();
	        System.out.println("Informe o valor B:");
	        int b = valor.nextInt();
	        int X = a + b;
	        System.out.format("A soma de %d + %d = %d", a, b, X);
		
		/*
		public class Teste {
			public static void main(String[] args) {
				int n = 2;
				System.out.println(testar(n));
			}

			public static String testar(int mes) {
				return switch(mes) {
				case 1 -> "Domingo";
				case 2 -> "Segunda";
				default -> "Dia inválido";
				};
			}
		}

		
		Calendar calendario = Calendar.getInstance();
		int din = calendario.get(Calendar.DAY OF MONTH);
		System.out.printf("Dia = %id")*/
		
		/*
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor da altura:");
		float h = valor.nextFloat();
		System.out.println("Digite o valor da base MENOR");
		float b = valor.nextFloat();
		System.out.println("Digite o valor da base MAIOR");
		float B = valor.nextFloat();
		float area = h*(b + B)/2;
		System.out.format("O total da sua área é: %.2f", area);
		*/
		
		
		/* Scanner valorHora = new Scanner(System.in);
		System.out.println("Informe o valor da sua hora:");
		float valor = valorHora.nextFloat();
		System.out.println("Quantas horas você trabalhou em um projeto?");
		float total = valorHora.nextFloat();
		float n = valor * total;
		System.out.format("O valor equivalente a suas horas trabalhadas é: %.2f", n);
		*/
		
		
		
		
		
		
		
		
		
		
		/*Scanner mouse = new Scanner(System.in);
		int n = mouse.nextInt();
		float f = mouse.nextFloat();
		double d = mouse.nextDouble();
		char letra = mouse.nextLine()charAt(0);
		mouse.close();
		*/
				
	}

}
