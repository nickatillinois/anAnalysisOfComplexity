package gna;
import java.util.Arrays;
public class Oefening {
	private Comparable[] anArray;
	
	public static void sorter(Comparable[] anArray) {
    Arrays.sort(anArray);
    for (int i = 0; i < anArray.length; i++)
	System.out.printf(anArray[i] + " ");
	System.out.printf("");
	}
	public Oefening() {
		anArray = new Comparable[0];
	}
	public void setanArray(Comparable[] given_array) {
		this.anArray = given_array;
	}
}