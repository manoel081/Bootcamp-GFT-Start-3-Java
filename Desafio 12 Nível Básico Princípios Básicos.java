/**
DESAFIO
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou 
a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).
 

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada 
com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

|----------------------------------------|
|Exemplos de Entrada |	Exemplos de Saída|
|--------------------|-------------------|
|S                   | 12.6              | 
|1.0                 |                   |
|0.0                 |                   |
|-3.5                |                   |
|2.5                 |                   | 
|4.1                 |                   |
|...                 |                   |
------------------------------------------
*/

//Scripts:

import java.util.Scanner;


public class URI {
	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 String letras;
		 float soma = 0;
		 int qnt = 0;
		 float media;
		 
		 
		//789456123 753
		 
		 
		 System.out.println("Digite sua operação: (S = soma, M = media)");
		 letras =  leitor.next().toUpperCase();
		 
		 float M [][]  = new  float[12] [12];
		 for(int i = 0; i <  12; i++ ) {
			 for(int j =0; j < 12; j++) {
				 M[i][j] = leitor.nextFloat();
			
			 }
		 }
		 for(int i = 0; i <  12; i++ ) {
			 for(int j =0; j < 12; j++) {
				 if(j > i) {
					// System.out.println("O numero: "+M[i][j]+"está acima da linha diagonal");
					 soma = soma + M[i][j];
					 qnt ++;
				 }if(i == j) {
					// System.out.println("O numero: "+M[i][j]+"está ena linha diagonal?");
				 }
			
			 }
		 }
		
		if(letras.equals("S")) {
			//somar
				 
			System.out.println(soma);
				 
				 
		}else if(letras.equals("M")) {
			//media
			 media = soma/qnt;
			 System.out.printf("%.1f",media);
		 }
		 
		 
	}
}
