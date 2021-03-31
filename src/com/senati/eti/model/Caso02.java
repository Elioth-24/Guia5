package com.senati.eti.model;
import java.util.Scanner;
public class Caso02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número 1: ");
		float n1 = sc.nextFloat();

		System.out.print("Número 2: ");
		float n2 = sc.nextFloat();

		Calculadora2 calc = new Calculadora2(n1,n2);

		System.out.println("\nNÚMEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("Primer número: " + calc.getNumero1());
		System.out.println("Segundo número: " + calc.getNumero2());

		System.out.println("\nRESULTADOS");
		System.out.println("----------");

		System.out.println("1. Suma...................: " + calc.Operar(1));
        System.out.println("2. Resta..................: " + calc.Operar(2));


	}
}
