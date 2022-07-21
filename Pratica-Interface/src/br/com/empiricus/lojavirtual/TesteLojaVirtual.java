package br.com.empiricus.lojavirtual;

import java.util.Scanner;

public class TesteLojaVirtual {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Notebook note = new Notebook("Notebook", "Lenovo", 3150, 25, "21.5",
				"i5 5th Generation", "8 GB");

		Console xboxSS = new Console("Console", "Xbox Series S", 2050, 100);

		System.out.println(note.toString());
		System.out.println(xboxSS.toString());
		System.out.println("Desconto de 10% no Xbox Series S: "
				+ xboxSS.aplicarDesconto(10));
		System.out.println("Cashback de 5% no Xbox Series S: "
				+ xboxSS.aplicarCashback(5));

		input.close();
	}

}
