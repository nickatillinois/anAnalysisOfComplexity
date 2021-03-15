package gna;

import java.util.Scanner;

import org.junit.Test;

import java.util.Random;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.text.*;
/**
 * Tests that test whether the implementations of the sorting algorithms do sort.
 */
// Pak een stuk of 5 timings van lijsten tussen 0 en 100. Vergelijk tijden met tijdscomplexiteit
public class SortingAlgorithmsTest {
	@Test
	// Maak verschillende rijen met verschillende lengtes, geef die aan testfunctie.
	public void initialize_array_Int() throws IOException {
		// 1. Intarray met gekozen lengte
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = s.nextInt();
		int MAX = 1000000;
		Comparable[] a = new Comparable[n];
		int i;
		n = 0; */
		// 2. de lege rij
		int n;
		int MAX = 1000000;
		int i;
		Comparable[] a = new Comparable[0];
		assert test_selectionSort(a);
		assert test_insertionSort(a);
		assert test_quickSort(a);
		// 3. rij met herhalingen
		Comparable[] herhalingen = {0, 0, 0, 1, 1, 1, 2, 2, 1, -1, 55555555, 6, 6, 6, 555, 555, 555, 7, 7, 7, 7, 7, 7, 7, 1000000000, 31, 31, 31, 3, 31, 31};
		assert test_selectionSort(herhalingen);
		assert test_insertionSort(herhalingen);
		assert test_quickSort(herhalingen);
		// 4. grote rijen
		n = 5000;
		a = new Comparable[n];
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		assert test_selectionSort(a);
		assert test_insertionSort(a);
		assert test_quickSort(a);
		n = 10000;
		a = new Comparable[n];
		for (i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		assert test_selectionSort(a);
		assert test_insertionSort(a);
		assert test_quickSort(a);
		// 5. letters
		Comparable[] letters = {"a", "g", "r", "h", "i", "k", "p", "z", "b"};
		assert test_selectionSort(letters);
		assert test_insertionSort(letters);
		assert test_quickSort(letters);
		// 6. komma-getallen
		a = new Comparable[500];
		float generatedFloat = -MAX + new Random().nextFloat() * (MAX - -MAX);
		for (int p = 0; p < 500; p++) {
			generatedFloat = -MAX + new Random().nextFloat() * (MAX - -MAX);
			a[p] = generatedFloat;}
		assert test_selectionSort(a);
		assert test_insertionSort(a);
		assert test_quickSort(a);
		// 7. woorden
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
		assert test_selectionSort(randomStrings);
		assert test_insertionSort(randomStrings);
		assert test_quickSort(randomStrings);
		System.out.println("Alle sorteeralgoritmes sorteren!");
		
		// Hieronder volgt de code die gebruikt werd om de tijd, 
		//aantal vergelijkingen, en opbouwende arraygrootte te meten.
		SelectionSort selectionSort_object = new SelectionSort();
		InsertionSort insertionSort_object = new InsertionSort();
		QuickSort quickSort_object = new QuickSort();
		n = 250;
		String string;
	    try {
	        File myObj = new File("filename.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    Comparable[] inversely = new Comparable[3000];
	    int k = 0;
	    i = 0;
	    while (i < 3000) {
	    inversely[i] = k;
	    k++;
	    i++;}
		//insertionSort_object.show(inversely);
	    FileWriter myWriter = new FileWriter("filename.txt");
	    double prev = 0.1;
	    for (n = 0; n < 4000; n++) {
			a = new Comparable[n];
			for (i = 0; i < n; i++) {
				a[i] = StdRandom.uniform(-MAX, MAX);
			}
			//Stopwatch timer = new Stopwatch();
			;
			//double time = timer.elapsedTime();
			//string = String.valueOf(insertionSort_object.sort(a));
			string = String.valueOf(quickSort_object.sort(a));
			//insertionSort_object.sort(a);
			//StdOut.printf("%7d %7.1f ",  n, time);
			//StdOut.printf("%5.1f\n",  time/prev);
			//prev = time;
			//System.out.println(string);
			//System.out.printf("\n");
		    try {
		        
		       myWriter.write(string);
		        myWriter.write("\n");
		        
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
			//assert test_insertionSort(a);
			//assert test_quickSort(a);
		}
		myWriter.close();
	}

	public boolean test_selectionSort(Comparable[] unsorted_array) {
		Comparable[] copy = unsorted_array.clone();
		SelectionSort selectionSort_object = new SelectionSort();
		selectionSort_object.sort(copy);
		assert (selectionSort_object.isSorted(copy)) == true;
		for (int i = 0; i < copy.length - 1; i++) {
			assert (copy[i].compareTo(copy[i + 1]) <= 0) == true;}
		return true;
	}
	public boolean test_insertionSort(Comparable[] unsorted_array) {
		Comparable[] copy = unsorted_array.clone();
		InsertionSort insertionSort_object = new InsertionSort();
		insertionSort_object.sort(copy);
		assert (insertionSort_object.isSorted(copy)) == true;
		for (int i = 0; i < copy.length - 1; i++) {
			assert (copy[i].compareTo(copy[i + 1]) <= 0) == true;}
		return true;
	}
	public boolean test_quickSort(Comparable[] unsorted_array) {
		Comparable[] copy = unsorted_array.clone();
		QuickSort quickSort_object = new QuickSort();
		quickSort_object.sort(copy);
		assert (quickSort_object.isSorted(copy)) == true;
		for (int i = 0; i < copy.length - 1; i++) {
			assert (copy[i].compareTo(copy[i + 1]) <= 0) == true;}
		return true;
	}
}

