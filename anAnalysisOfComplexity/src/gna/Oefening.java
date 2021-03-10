package gna;
import java.util.Comparator;
import java.util.*;
public abstract class Oefening implements Comparable<Oefening> {
	private Comparable[] anArray;
	
	public static void sorter(Comparable[] anArray) {
    Collections.sort(anArray);
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
	
	public Comparable[] getAnArray() {
		return anArray;
	}
	public void setAnArray(Comparable[] anArray) {
		this.anArray = anArray;
	}
	@Override
	public int compare(Oefening oef1, Oefening oef2) {
		// this > oef1 = +
		// this < oef1 = -
		// this == oef1 = 0
		int difference = oef1.getAnArray() - oef2.getAnArray();
		
		if (this.getAnArray() > oef1.getAnArray())
	}

}