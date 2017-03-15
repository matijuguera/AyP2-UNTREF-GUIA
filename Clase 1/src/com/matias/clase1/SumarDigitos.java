package com.matias.clase1;

public class SumarDigitos {

	public static int Sumar(int i) {
		int total = 0; 
		int aux = i;
		if(aux < 0){
			aux = aux*-1;
		}
		while( aux > 0 ){
			total += aux%10;
			aux = aux/10;
		}
		return total;
	}

}
