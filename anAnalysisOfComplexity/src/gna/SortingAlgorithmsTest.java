package gna;

import static org.junit.Assert.*;
import libpract.SortingAlgorithm;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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
		Comparable[] a = new Comparable[n];
		int i;
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		Comparable[] empty_array = new Comparable[0];
		test_if_sorted(empty_array);
		Comparable[] one_element_array = new Comparable[1];
		one_element_array[0] = 1;
		test_if_sorted(one_element_array);
		Comparable[] already_sorted_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		test_if_sorted(already_sorted_array);
		Comparable[] boring_array = {0, 0, 0, 1, 1, 1, 2, 2, 1, -1, 55555555, 6, 6, 6, 555, 555, 555, 7, 7, 7, 7, 7, 7, 7, 1000000000, 31, 31, 31, 3, 31, 31};
		test_if_sorted(boring_array);
		//Comparable[] fractionArray = {0.1, 0.2, 0.569, 0.995, 0.58, 0.2, 0.0002, 0.999, 0};
		//test_if_sorted(fractionArray);
		n = 1000;
		a = new Comparable[n];
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 5000;
		a = new Comparable[n];
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		n = 10000;
		a = new Comparable[n];
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		test_if_sorted(a);
		Comparable[] letter_rij = {"a", "g", "r", "h", "i", "k", "p", "z", "b"};
		test_if_sorted(letter_rij);
		Comparable[] b = new Comparable[500];
		float generatedFloat = -MAX + new Random().nextFloat() * (MAX - -MAX);
		for (int p = 0; p < 500; p++) {
			generatedFloat = -MAX + new Random().nextFloat() * (MAX - -MAX);
			b[p] = generatedFloat;}
		test_if_sorted(b);
		//https://stackoverflow.com/questions/4951997/generating-random-words-in-java
		Comparable[] randomStrings = new String[100];
	    Random random = new Random();
	    for(i = 0; i < 100; i++)
	    {
	        char[] word = new char[random.nextInt(8)+3];
	        for(int j = 0; j < word.length; j++)
	        {
	            word[j] = (char)('a' + random.nextInt(26));
	        }
	        randomStrings[i] = new String(word);
	    }
	    test_if_sorted(randomStrings);
	}
	public void test_if_sorted(Comparable[] unsorted_array) {
		Comparable[] copy1 = unsorted_array.clone();
		Comparable[] copy2 = unsorted_array.clone();
		Comparable[] copy3 = unsorted_array.clone();
		//InsertionSort insertionSort_object = new InsertionSort();
		SelectionSort selectionSort_object = new SelectionSort();
		//QuickSort quickSort_object = new QuickSort();
		//insertionSort_object.sort(copy1);
		//for (int i = 0; i < copy1.length - 1; i++) {
		//	assert (copy1[i].compareTo(copy1[i + 1]) <= 0) == true;}
		selectionSort_object.sort(copy2);
		selectionSort_object.show(copy2);
		for (int i = 0; i < copy2.length - 1; i++) {
			assert (copy2[i].compareTo(copy2[i + 1]) <= 0) == true;}
		//quickSort_object.sort(copy3);
		//for (int i = 0; i < copy3.length - 1; i++) {
		//	assert (copy3[i].compareTo(copy3[i + 1]) <= 0) == true;}
	}
}
