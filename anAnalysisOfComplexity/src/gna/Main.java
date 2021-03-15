//Grotendeels overgenomen van Algorithms, Sedgewick & Wayne, 2019.
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
	
	private static Stopwatch timer = new Stopwatch();
	private static SelectionSort selectionSort_object = new SelectionSort();
	private static InsertionSort insertionSort_object = new InsertionSort();
	private static QuickSort quickSort_object = new QuickSort();
	public static long count;
	public static void main(String[] args)
	{ // Print table of running times.
		double prev = timeTrial(125);
		for (int n = 250; true; n += n)
		{
			double time = timeTrial(n);
			StdOut.printf("%7d %7.1f", n, time);
			StdOut.printf("%5.1f\n",  time/prev);
			prev = time;
		}
	}
	public static double timeTrial(int n)
	{

		
		int MAX = 999999;
		Comparable [] a = new Comparable[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX + 1);
		Stopwatch timer = new Stopwatch();
		count = insertionSort_object.sort(a);
		return timer.elapsedTime();
		
	}
}
