package gna;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 */
public class SelectionSort extends SortingAlgorithm {
	/**
	 * Sorts the given array using selection sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");}
		long nmbrComparisons = 0;
		if (array.length == 1) {
			return nmbrComparisons;}

	}

	/**
	 * Constructor.
	 */
	public SelectionSort() {
	}
}
