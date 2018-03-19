package by.tc.jb24.task2;

import java.util.Random;
import java.util.Scanner;

public class MasAN {

	public static void main(String[] args) {
		int[] mas = new int[10];
		
		enterArrayWithRandom(mas);
		int k=readIntFromConsole("k=");
		int sum = calculateSum(k,mas);
		printResult(mas);
	}
	
	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for(int i=0; i<mas.length; i++){
			mas[i]=rand.nextInt(300);
		}
	}
	
	public static int readIntFromConsole(String variable) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter " + variable + ":");
		return sc.nextInt();
	}
	
	public static int calculateSum(int k, int[] mas) { 
		int sum = 0;
		
		for (int i=0; i<mas.length; i++){
			if (mas[i] % k == 0){
				sum=mas[i]+sum;
			}
		}
		return sum;
	}	
	
	public static void printResult(int mas){
		System.out.println("There are indexes with 0 value: " + mas);
	}
}
