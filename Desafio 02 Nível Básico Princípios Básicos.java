/**Desafio
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

|----------------------------------------|
|Exemplos de Entrada |	Exemplos de Saída|
|--------------------|-------------------|
|                    |         2         |
|                    |         15        |
|        13          |         28        |
|                    |         41        |
|                    |                   |
|----------------------------------------| 

*/

// Script :



import java.util.Scanner;

public class resto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, PROD;

		A = sc.nextInt();
		B = sc.nextInt();

		PROD = A * B;
		System.out.println("PROD = " + PROD);

		sc.close();

	}

}
