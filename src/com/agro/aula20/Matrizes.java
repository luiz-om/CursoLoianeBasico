package com.agro.aula20;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0]=10;
		notasAlunos[0][1]=7;
		notasAlunos[0][2]=10;
		notasAlunos[0][3]=13;
		
		notasAlunos[1][0]=10;
		notasAlunos[1][1]=4;
		notasAlunos[1][2]=9;
		notasAlunos[1][3]=9.9;
		
		notasAlunos[2][0]=10;
		notasAlunos[2][1]=10;
		notasAlunos[2][2]=10;
		notasAlunos[2][3]=10;
		System.out.println();
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
