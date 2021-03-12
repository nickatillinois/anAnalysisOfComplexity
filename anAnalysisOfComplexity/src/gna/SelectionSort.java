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
		comparisons = 0;
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");}
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (less(array[j], array[min])) {
					min = j;}
			}
			exchange(array, i, min);
		}
		return comparisons;
	}
	/**
	 * Constructor.
	 */
	public SelectionSort() {
	}
}
