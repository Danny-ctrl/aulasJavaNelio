package cursoNelio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		Scanner scd = new Scanner(System.in);
		Scanner scf = new Scanner(System.in);
		
//		String x;
//		x= sc.next();
//		System.out.println("Você digitou " + x);
//		
//		int y;
//		y= scn.nextInt();
//		System.out.println("Você digitou " + y);
//		
//		double d;
//		d= scd.nextDouble();
//		System.out.printf("Você digitou: %.2f%n" , d);
//		
//		char f;
//		f= scf.next().charAt(0);
//		System.out.println("Você digitou " + f);
		
		
		String h;
		int i;
		double j;
		
		h= sc.next();
		i= sc.nextInt();
		j= sc.nextDouble();
		System.out.println("Dados digitados ");
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		sc.close();
		scn.close();
		scd.close();
		scf.close();
		
	}

}
