package com.hackerrank.problem.solving.comman;

public class ArraysUtil {

	public static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
