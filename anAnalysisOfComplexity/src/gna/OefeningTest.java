package gna;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OefeningTest {

	@Test
	void test() {
		Comparable [] array = {1.154, 1.516, 2.151, 8};
		Comparable [] array2 = {"a", "n" , "y", "b", "z"};
		Oefening myplay = new Oefening();
		myplay.setanArray(array);
		myplay.sorter(array);
		myplay.sorter(array2);
	}
}