package gna;

import static org.junit.Assert.*;
import libpract.SortingAlgorithm;
import java.util.Scanner;
import org.junit.Test;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Tests that test whether the implementations of the sorting algorithms do sort.
 */
// Pak een stuk of 5 timings van lijsten tussen 0 en 100. Vergelijk tijden met tijdscomplexiteit
public class SortingAlgorithmsTest {
	@Test
	// Maak verschillende rijen met verschillende lengtes, geef die aan testfunctie.
	public void initialize_array_Int() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = s.nextInt();
		int MAX = 1000000;
		int [] a = new int[n];
		int i;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		int[] empty_array = new int[0];
		test_if_sorted(empty_array);
		int[] one_element_array = new int[1];
		one_element_array[0] = 1;
		test_if_sorted(one_element_array);
		int [] already_sorted_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		test_if_sorted(already_sorted_array);
		int [] boring_array = {0, 0, 0, 1, 1, 1, 2, 2, 1, -1, 55555555, 6, 6, 6, 555, 555, 555, 7, 7, 7, 7, 7, 7, 7, 1000000000, 31, 31, 31, 3, 31, 31};
		test_if_sorted(boring_array);
		n = 1000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 5000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 10000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 50000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 75000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 100000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 500000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 1000000;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
	}
	@Test
	public void test_if_sorted(int [] unsorted_array) {
		int [] copy = unsorted_array.clone();
		Arrays.sort(copy);
		assert copy.equals(insertionSort(unsorted_array));
		assert copy.equals(selectionSort(unsorted_array));
		assert copy.equals(quickSort(unsorted_array));
	}
}
