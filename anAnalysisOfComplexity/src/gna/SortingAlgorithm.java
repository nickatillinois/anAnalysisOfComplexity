package gna;

import edu.princeton.cs.algs4.StdOut;

// Do not remove the "implements libpract.SortingAlgorithm".
public abstract class SortingAlgorithm implements libpract.SortingAlgorithm{
	private static boolean less (Comparable v, Comparable w)
	{return v.compareTo(w) < 0;}
	private static void exchange(Comparable[] a, int i, int j)
	{Comparable t = a[i]; a[i] = a[j]; a[j] = t;}
	private static void show(Comparable[] a)
	{ for (int i = 0; i < a.length; i++)
		StdOut.print(a[i] + " ");
		StdOut.println();
	}
	public static boolean isSorted(Comparable [] a)
	{
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1])) return false;
		int small
		return true;
	}
	/**
	 * Sorts the given array.
	 * 
	 * Note: to know whether "array[i] < array[j]", one writes "array[i].compareTo(array[j]) < 0".
	 * 
	 * @throws IllegalArgumentException
	 * 	array == null
	 * @post
	 * 	After execution of this method, array is sorted. That means:
	 *  - any element of the original array has the same amount of occurrences in the new array,
	 *    e.g. if the original array has twice the element x, the resulting element has twice the element x.
	 *  - any elements of the resulting array has the same amount of occurrences in the original array
	 *  - for any elements x and y in the resulting array, x occurs before y if and only if x is
	 *    less than or equal to y, according to the compareTo method.
	 * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
	 */
	public abstract long sort(Comparable[] array) throws IllegalArgumentException;
}
