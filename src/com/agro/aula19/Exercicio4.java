package com.agro.aula19;

public class Exercicio4 {

	public static void main(String[] args) {
		// F_{n}=F_{n-1}+F_{n-2}
		
		int f1=0;
		int f2=1;
	
		
	for (int i = 1; f1 < 1000; i++) {
		System.out.print(f1+",");
		f2 +=f1;
		f1=f2-f1;
		
		
	}
	System.out.println("\n");
	for(int a=0,b=1;a<=1000;b+=a,a=b-a){
		System.out.print(a+",");
	}
	}

}
