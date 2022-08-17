package com.hackerrank.ds.basic.easy.arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IBasicEasyArraysTest {

	IBasicEasyArrays ibea;

	@Before
	public void init() {
		ibea = new BasicEasyArraysImpl();
	}

	/* Arrays - DS */
	@Test
	public void reverseArrayTest() {

		List<Integer> ls = List.of(1, 2, 3, 4, 5, 6, 7);
		List<Integer> rs = ibea.reverseArray(List.of(7, 6, 5, 4, 3, 2, 1));
		for (int i = 0; i < ls.size(); i++)
			Assert.assertTrue(ls.get(i) == rs.get(i));
	}

	/* 2D Array - DS */
	@Test
	public void hourglassSum() {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();

		int a[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		for (int i = 0; i < 6; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < 6; j++) {
				list.add(a[i][j]);
			}
			arr.add(list);
		}
		Assert.assertTrue(ibea.hourglassSum(arr) == 19);
	}

	/* Dynamic Array */
	@Test
	public void dynamicArrayTest() {
		List<List<Integer>> queries = new ArrayList<>();
		queries.add(List.of(1, 0, 5));
		queries.add(List.of(1, 1, 7));
		queries.add(List.of(1, 0, 3));
		queries.add(List.of(2, 1, 0));
		queries.add(List.of(2, 1, 1));

		List<Integer> result = ibea.dynamicArray(queries.size(), queries);
		Assert.assertTrue(result.get(0) == 7);
		Assert.assertTrue(result.get(1) == 7);
	}

	/* Left Rotation */
	@Test
	public void rotateLeftTest() {
		List<Integer> result = ibea.rotateLeft(2, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(result);
	}
}
