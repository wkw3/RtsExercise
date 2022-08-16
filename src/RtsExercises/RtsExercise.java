package RtsExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Please write a class in the language of your choice that contains the
 * following two public methods: aboveBelow stringRotation
 * 
 * @author William Warren
 *
 */
public class RtsExercise {

	/**
	 * aboveBelow
	 * 
	 * accepts two arguments An unsorted collection of integers (the list) an
	 * integer (the comparison value) returns a hash/object/map/etc. with the keys
	 * "above" and "below" with the corresponding count of integers from the list
	 * that are above or below the comparison value
	 * 
	 * Example usage:
	 * 
	 * input: [1, 5, 2, 1, 10], 6
	 * 
	 * output: { "above": 1, "below": 4 }
	 * 
	 * @param numList         array of unsorted integers
	 * @param comparisonValue the number that determines which array elements are
	 *                        above and below
	 * @return a HashMap containing they keys "above" and "below" and values
	 *         counting each
	 */
	static public HashMap<String, Integer> aboveBelow(int[] numList, int comparisonValue) {
		int aboveCount = 0;
		int belowCount = 0;
		HashMap<String, Integer> aboveBelowMap = new HashMap<String, Integer>();
		for (Integer num : numList) {
			if (num > comparisonValue) {
				aboveCount++;
			} else if (num < comparisonValue) {
				belowCount++;
			}
			aboveBelowMap.put("above", aboveCount);
			aboveBelowMap.put("below", belowCount);
		}

		return aboveBelowMap;

	}

	/**
	 * stringRotation
	 * 
	 * accepts two arguments a string (the original string) a positive integer (the
	 * rotation amount) returns a new string, rotating the characters in the
	 * original string to the right by the rotation amount and have the overflow
	 * appear at the beginning
	 * 
	 * Example usage:
	 * 
	 * input: "MyString", 2
	 * 
	 * output: "ngMyStri"
	 * 
	 * @param s string to rotate
	 * @param rotation number of letters to rotate incoming string by
	 */
	public static String stringRotation(String s, int rotation) {
		String resultString = new String();
		return s.substring(s.length() - rotation % s.length(), s.length()) + s.substring(0, s.length() - rotation % s.length());
	}
}
