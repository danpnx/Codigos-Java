package br.com.empiricus.cinema;
import java.util.Scanner;

public class TesteCinema {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] cinema = new int[n][m];
        int contador;
        int fila = -1;
        boolean verify = false;
        
        for (int i = 0; i < cinema.length; i++) {
        	for (int j = 0; j < cinema[i].length; j++) {
        		cinema[i][j] = scanner.nextInt();
        		}
        }
        
        int k = scanner.nextInt();
        if (k > m) {
        	fila = 0;
        }
        
        for (int i = 0; i < cinema.length; i++) {
        	contador = 0;
        	for (int j = 0; j < cinema[i].length; j++) {
        		if (cinema[i][j] == 0) {
        			contador++;
        			if (contador >= k) {
        				verify = true;
        			}
        		} else {
        			contador = 0;
        			fila = 0;
        		}
        	}
        	if (verify) {
        		fila = i + 1;
				break;
			}
        }
        
        System.out.println("fila: " + fila);
	}
}