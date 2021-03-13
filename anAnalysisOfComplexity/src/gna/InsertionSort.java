package gna;

/**
 * Performs sort by using the Insertion Sort algorithm.
 * 
 */
public class InsertionSort extends SortingAlgorithm {
	/**
	 * Sorts the given array using insertion sort.
	 * 
	 * @see super
	 */

	public long sort(Comparable[] array) throws IllegalArgumentException {
		exchanges = 0;
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		int n = array.length;
		for(int i = 1; i < n; i++) {
			for (int j = i; j>0 && less(array[j], array[j - 1]); j--){
				exchange(array, j, j-1);
			}
		}
		return exchanges;
	}

	/**
	 * Constructor.
	 */
	public InsertionSort() {
	}
}
