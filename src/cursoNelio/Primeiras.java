package cursoNelio;

import java.util.Locale;

public class Primeiras {

	public static void main(String[] args) {
//		double x = 10.35784;
//		String nome = "Maria";
//		int idade =31;
//		double renda = 4000.0;
//		System.out.println(x);
//		System.out.printf("%.2f%n",x);
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.2f%n",x);
//		System.out.println("RESULTADO " + x + " METROS");
//		System.out.printf("RESULTADO " +"%.2f METROS%n",x);
//		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s custa R$ %.2f reais%n ",product1,price1);
		System.out.printf("%s custa R$ %.2f reais%n",product2,price2);
		System.out.printf("Registrada %d anos , codigo %d e genero %s %n ",age,code,gender);
		System.out.println(measure);
		System.out.printf("%.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n",measure);
		
	}

}
