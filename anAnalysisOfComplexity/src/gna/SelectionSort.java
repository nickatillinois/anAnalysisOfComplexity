package gna;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 */
public class SelectionSort extends SortingAlgorithm {
	private long comparisons;
	/**
	 * Sorts the given array using selection sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");}
		for (int i = 0; i < array.length; i++) {
			int j = i + 1;
			int smallest = i;
			while (j<array.length) {
				if (less(array[j], array[smallest])) {
					smallest = j; 
				}
				comparisons++;
				j++;
			}
			exchange(array, smallest, i);
		}
		return comparisons;
	}

	public long getComparisons() {
		return comparisons;
	}

	public void setComparisons(long comparisons) {
		this.comparisons = comparisons;
	}

	/**
	 * Constructor.
	 */
	public SelectionSort() {
	}
}
