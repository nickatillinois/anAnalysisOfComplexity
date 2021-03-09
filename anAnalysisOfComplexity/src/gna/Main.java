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
		for (int n = 250; true; n *= 2)
		{
			double time = timeTrial(n);
			StdOut.printf("%7d %7.1f\n", n, time);
		}
	}
	public static double timeTrial(int n)
	{
		int MAX = 1000000;
		int [] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		Stopwatch timer = new Stopwatch();
		int count = ThreeSum.count(a);
		return timer.elapsedTime();
		
	}
}
