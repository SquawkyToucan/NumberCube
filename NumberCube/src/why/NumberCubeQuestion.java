package why;

public class NumberCubeQuestion {
	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		int[] results = new int[numTosses];
		System.out.println(cube.getValues());
		for(int i = 0; i < numTosses; i++) {
			results[i] = cube.getValues()[i];
		}
		System.out.println(results.toString());
		return results;
	}
	public static int getLongestRun(int[] values) {
		int current = 0;
		int currentRun = 0;
		int longestRun = 0;
		int currentIndex = 0;
		int longestIndex = 0;
		for(int i = 0; i < values.length; i++) {
			if(current != values[i]) {
				System.out.println("");
				// The streak is broken
				System.out.println("Streak of " + current + " broken by " + values[i]);
				System.out.println("current run length = " + currentRun + " while the long run is " + longestRun);
				if(currentRun >= longestRun) {
					// That run was larger
					longestRun = currentRun;
					longestIndex = currentIndex;
					System.out.println("Streak index replaced with " + longestIndex);
				}
				// Set all of the variables to zero
				currentRun = 0;
				currentIndex = i;
			}
			else {
				// They are equal
				System.out.println("Streak of " + current + " continued");
				currentRun++;
			}
			// Sets the current value to the value
			current = values[i];
		}
		return longestIndex;
	}
}
