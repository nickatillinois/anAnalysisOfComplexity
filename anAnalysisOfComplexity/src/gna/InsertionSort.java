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
	private long comparisons;
	public long getComparisons() {
		return comparisons;
	}

	public void setComparisons(long comparisons) {
		this.comparisons = comparisons;
	}

	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		int n = array.length;
		for(int i = 0; i < n; i++) {
			for (int j = i; j>0 && less(array[j], array[j - 1]); j--){
				comparisons++;
				exchange(array, j-1, j);
			}
		}
		return comparisons + 1;
	}

	/**
	 * Constructor.
	 */
	public InsertionSort() {
	}
}
