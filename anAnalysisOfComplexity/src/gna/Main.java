package gna;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.ThreeSum;

public class Main {
	/**
	 * Example main function.
	 * 
	 * You can replace this.
	 */
	public static void main(String[] args)
	{ // Print table of running times.
		double prev = timeTrial(125);
		for (int n = 250; true; n *= 2)
		{
			double time = timeTrial(n);
			StdOut.printf("%7d %7.1f", n, time);
			StdOut.printf("%5.1f\n",  time/prev);
			prev = time;
		}
	}
	public static double timeTrial(int n)
	{
		SelectionSort selectionSort_object = new SelectionSort();
		InsertionSort insertionSort_object = new InsertionSort();
		QuickSort quickSort_object = new QuickSort();
		int MAX = 1000000;
		Comparable [] a = new Comparable[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		Stopwatch timer = new Stopwatch();
		long count = insertionSort_object.sort(a);
		return timer.elapsedTime();
		
	}
}
