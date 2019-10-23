package com.Ex24Assertion.app;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {

		int edad=0;
		Scanner input =new Scanner(System.in);		
				System.out.println("eres mayor de edad? introduce tu edad");
		edad=input.nextInt();
		assert edad>0: "edad no vailda";
		
		if (edad<18)
		{
			System.out.println("menor");
			
		}
		if(edad>=18)
		{
			System.out.println("chavoruco");
		System.out.println(isMayorEdad(edad));
		}

	
	}
	public static String isMayorEdad(int edad)
	{
		String cad="";
	
	assert edad>0: "edad no vailda, el metodo solo acepta valores positivos";
	
	if (edad<18)
	{
		cad="menor";
		
	}
	if(edad>=18)
	{
		cad="chavoruco";
	
	}
	{
		return cad;
	}
	}
	

}
