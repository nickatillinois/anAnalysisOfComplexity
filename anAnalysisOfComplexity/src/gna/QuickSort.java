//Grotendeels overgenomen van Algorithms, Sedgewick & Wayne, 2019.
package gna;

import java.util.Arrays;
import java.util.Random;

/**
 * Performs sort by using the Quick Sort algorithm.
 *
 */
public class QuickSort extends SortingAlgorithm{
	/**
	 * Sorts the given array using quick sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		comparisons = 0;
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		sort(array, 0, array.length - 1);
		return comparisons;
	}
	private static void sort(Comparable[] array, int links, int rechts) {	
		if (rechts <= links) {return;}
		int j = partition(array, links, rechts);
		// Sorteer linkerdeel, van links tot en met j-1
		sort(array, links, j-1);
		// Sorteer rechterdeel, van j+1 tot en met rechts
		sort(array, j+1, rechts);
	}
	// Zet alle elementen kleiner dan de pivot links, groter dan rechts. returnt pivot index
	private static int partition(Comparable[] array, int links, int rechts) {
		// initialiseer de indexes die gaan opschuiven
		int i = links;
		int j = rechts + 1;
		Comparable pivot = array[links];
		while(true)
		{ // schuif de twee indexen i en j op tot ze elkaar voorbij steken, wissel elk keer
			while (less(array[++i], pivot)) if ( i == rechts) break;
			while (less(pivot, array[--j])) if ( j == links) break;
			if (i >= j) break;
			exchange(array, i, j);
		}
		// Zet pivot in array[j]
		exchange(array, links, j);
		return j;
	}



	/**
	 * Constructor.
	 */
	public QuickSort() {
	}
}
