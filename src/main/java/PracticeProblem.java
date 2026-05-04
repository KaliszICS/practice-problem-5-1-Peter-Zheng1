/**

        * File: Lesson 5.1

        * Author: Peter

        * Date Created: May 4, 2026

        * Date Last Modified: May 4, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray(){
		int[] numbers = {0, 0, 0, 0, 0};
		for (int i = 0; i < 5; i++){
			numbers[i] = i + 1;
		}
		return numbers;
		
	}

	public static String[] createArray(String word1, String word2, String word3, String word4){
		String[] strings = {word1, word2, word3, word4};
		return strings;
	}

	public static String getElement(int num, String[] array){
		return array[num];
	}

	public static void replaceElement(int n, double value, double[] array ){
		array[n] = value;
	}
}
