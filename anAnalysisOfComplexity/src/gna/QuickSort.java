package gna;

/**
 * Performs sort by using the Quick Sort algorithm.
 *
 */
public class QuickSort extends SortingAlgorithm{
	private int comparisons;
	/**
	 * Sorts the given array using quick sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		int n = array.length;
		if (n <= 1) {return 0;}
		int subN;
		if (n % 2 == 0) {
			Comparable[] links = new Comparable[n/2];
			Comparable[] rechts = new Comparable[n/2];
		}
		if (n % 2 != 0) {
			Comparable[] links = new Comparable[n/2];
			Comparable[] rechts = new Comparable[n/2 + 1];
		}
		if (even) {subN = n / 2;}
		
		
		Comparable[] links, rechts;
		for (int i = 0; i < array.length; i++) {
			if (less(array[0], array[i])
		}
	}

	/**
	 * Constructor.
	 */
	public QuickSort() {
	}
}
