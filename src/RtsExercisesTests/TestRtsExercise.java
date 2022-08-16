package RtsExercisesTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import RtsExercises.RtsExercise;

class TestRtsExercise {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAboveBelow() {
		int[] testInts = new int[] {1,5,2,1,10};
		int comparisonValue = 6;
		int numAbove = 0;
		int numBelow = 0;
		int expectedAbove = 1;
		int expectedBelow = 4;
		HashMap<String,Integer> resultMap = RtsExercise.aboveBelow(testInts, comparisonValue);
		numAbove = resultMap.get("above");
		numBelow = resultMap.get("below");
		assertEquals(numAbove, expectedAbove);
		assertEquals(numBelow, expectedBelow);
	}

	@Test
	void testStringRotation() {
		String testString = "MyString";
		int testRotation = 2;
		String expectedString = "ngMyStri";
		String resultString = RtsExercise.stringRotation(testString, testRotation);
		assertEquals(resultString,expectedString);
	}

}
