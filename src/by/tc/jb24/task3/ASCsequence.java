package by.tc.jb24.task3;

import java.util.Scanner;

public class ASCsequence {

	public static void main(String[] args) {
		int[] mas = new int[10];
		
		enterArrayFromConsole(mas);

	    if (isSequenceASC(mas)){
			printResult();
		} else {
			System.out.println("Sequence is not ASC");
		}
	}
	
	public static void enterArrayFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<mas.length; i++){
			System.out.print("ar[ " + i + "]=>" );
			mas[i]=sc.nextInt();
		}
	}
	
	public static boolean isSequenceASC(int[] mas) { 
		for (int i=0;i<mas.length - 1;i++){
		    if (mas[i+1] < mas[i]) {
		    	return false;
		    }
		}
		return true;
	}	

	public static void printResult(){
		System.out.println("Sequence is ASC");
	}
}
