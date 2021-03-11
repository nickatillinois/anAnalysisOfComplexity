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
		throw new RuntimeException("not implemented"); // TODO
	}

	/**
	 * Constructor.
	 */
	public QuickSort() {
	}
}
