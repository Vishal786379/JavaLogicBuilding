package com.vishal.programming.logic.building;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	
	//Buffered Reader is class
	//So we need to create object of it.
	//To use any class we need to create object of it
	
	

	public static void main(String args[]) throws IOException {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferReader = new BufferedReader(streamReader);
		
		String inputString = bufferReader.readLine();
		System.out.println(inputString);
		
		int n = Integer.parseInt(inputString);
		System.out.println(n);
		
		double d= Double.parseDouble(inputString);
		System.out.println(d);
	}
}
