package com.hackerrank.ds.basic.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class BasicEasyArraysImpl implements IBasicEasyArrays {

	/* Arrays - DS */
	// @Idea just swap 1st with last,2nd with last-1..so on
	@Override
	public List<Integer> reverseArray(List<Integer> a) {
		Integer[] ar = a.toArray(new Integer[a.size()]);

		int i = 0, j = ar.length, temp;

		while (i < j) {
			temp = ar[i];
			ar[i] = ar[j - 1];
			ar[j - 1] = temp;
			i++;
			j--;
		}
		return Arrays.asList(ar);
	}

	/* 2D Array - DS */
	private int hourglass(int[][] a, int i, int j) {
		int sum = 0;
		for (int x = i, y = j; y <= j + 2; y++) {
			if (a[x][y] != 0)
				sum += a[x][y];

			if (a[x + 2][y] != 0)
				sum += a[x + 2][y];
		}
		sum += a[i + 1][j + 1];
		return sum;
	}

	// @Idea collect each hourglass collect the sum in list finallly sort it
	@Override
	public int hourglassSum(List<List<Integer>> arr) {
		int N = arr.size();
		int a[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				a[i][j] = arr.get(i).get(j);
		}
		List<Integer> hgs = new ArrayList<>();

		for (int i = 0; i < N - 2; i++) {
			for (int j = 0; j < N - 2; j++) {
				hgs.add(hourglass(a, i, j));
			}
		}
		System.out.println(hgs.size());
		return hgs.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
	}

	/* Dynamic Array */
	@Override
	public List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		List<List<Integer>> computation = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			computation.add(new ArrayList<>());
		}

		int lastAnswer = 0;
		for (int i = 0; i < queries.size(); i++) {
			List<Integer> q = queries.get(i);
			int k = (q.get(1) ^ lastAnswer) % n;
			if (q.get(0) == 1) {
				computation.get(k).add(q.get(2));
			} else {
				List<Integer> seq = computation.get(k);
				lastAnswer = seq.get(q.get(2) % seq.size());
				result.add(lastAnswer);
			}
		}

		return result;
	}

	/* Left Rotation */
	public List<Integer> rotateLeft(int d, List<Integer> arr) {
		Integer a[] = arr.toArray(new Integer[arr.size()]);
		int n = a.length;
		d = d % n;
		int k = 0;
		for (int i = 0; i < n - d; i++) {
			a[k++] = arr.get(d + i);
		}
		for (int i = 0; i < d; i++) {
			a[k++] = arr.get(i);
		}

		return Arrays.asList(a);
	}
}
