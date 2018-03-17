package why;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCubeTest {

	// READ QUESTION 1: http://apcentral.collegeboard.com/apc/public/repository/ap09_frq_computer_science_a.pdf Try to answer on paper.
	@Test
	public void testPartA() {
		// I do not see the purpose of this test.
		// While the getCubeTosses method was instructed to toss (or return a random number each time), this is automatically assuming that
		// it will return a certain set of numbers. However, when randomized, the odds of it returning the exact numbers are 1/7776.
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCubeQuestion.getCubeTosses(numberCube, testValues.length));
	}

	@Test
	public void testPartB() throws Exception {
		int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5};
		assertEquals(3, NumberCubeQuestion.getLongestRun(testValues));
		System.out.println("");
		int[] testValues2 = { 1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5 };
		assertEquals(6, NumberCubeQuestion.getLongestRun(testValues2));
	}
}

