package by.tc.jb24.task4;

import java.util.Scanner;

public class findZero {

	public static void main(String[] args) {
		int[] mas = new int[5];
		
		enterArrayFromConsole(mas);
		int zeroValues=countZeroValues(mas);
		int[] withZero = findIndexesWithZeroValues(mas, zeroValues);
		
		if (zeroValues!=0){
			printResult(withZero);
		} else {
			printNoResult();
		}	
	}
		
	public static void enterArrayFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<mas.length; i++){
			System.out.print("ar[" + i + "]=>" );
			mas[i]=sc.nextInt();
		}
	}
	
	public static int countZeroValues(int[] mas) {
		int zeroValues = 0;
		
		for(int i=0; i<mas.length; i++){
			if (mas[i]==0){
				zeroValues++; 
			}
		}
		return zeroValues;
	}
	
	public static int[] findIndexesWithZeroValues(int[] mas, int zeroValues) {
		int[] withZero = new int [zeroValues];
		int j=0;

		for(int i=0; i<mas.length; i++){
			if (mas[i]==0){
				withZero[j] = i;
				j++;
			}
		}
		return withZero;
	}
	
	public static void printResult(int[] withZero){
		System.out.println("There are indexes with 0 value ");
		
		for (int j=0;j<withZero.length; j++){
			System.out.print("withZero["+ j +"]=" + withZero[j] + "; ");
		}
	}
	
	public static void printNoResult(){
		System.out.println("There are No indexes with 0 value ");
	}
}
