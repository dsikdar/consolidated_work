package tempcodebyte;

import java.util.*;
import java.io.*;

class A {

	public static void FindIntersection(String[] strArr) {
		// code goes here
		String theFirstStringSet = strArr[0];

		String theSecondStringSet = strArr[1];

		int minimumLentgthOfTwoSets = theFirstStringSet.length() < theSecondStringSet.length()
				? theFirstStringSet.length()
				: theSecondStringSet.length();

		int maximumLentgthOfTwoSets = theFirstStringSet.length() >= theSecondStringSet.length()
				? theFirstStringSet.length()
				: theSecondStringSet.length();

		int[] smallerIntSet = new int[minimumLentgthOfTwoSets - minimumLentgthOfTwoSets / 2];
		int[] biggerIntSet = new int[maximumLentgthOfTwoSets - maximumLentgthOfTwoSets / 2];
		List<Integer> intersectedSet = new ArrayList<Integer>();

		if (strArr[0].length() <= strArr[1].length()) {
			for (int i = 0, j = 0; i < minimumLentgthOfTwoSets && j < minimumLentgthOfTwoSets; i++) {
				smallerIntSet[i] = strArr[0].charAt(j) - 48;
				j = j + 2;
				}
			for (int i = 0, j = 0; i < maximumLentgthOfTwoSets && j <= maximumLentgthOfTwoSets; i++) {
				biggerIntSet[i] = strArr[1].charAt(j) - 48;
				j = j + 2;
			}
			
		}
		else {
			for (int i = 0, j = 0; i < maximumLentgthOfTwoSets && j <= maximumLentgthOfTwoSets; i++) {
				biggerIntSet[i] = strArr[0].charAt(j) - 48;
				j = j + 2;
			}
			for (int i = 0, j = 0; i < minimumLentgthOfTwoSets && j < minimumLentgthOfTwoSets; i++) {
				smallerIntSet[i] = strArr[1].charAt(j) - 48;
				j = j + 2;
				}
			// }
		} // bigger integer set is not populated

		for (int i = 0; i < (minimumLentgthOfTwoSets - minimumLentgthOfTwoSets / 2); i++) {
			for (int j = 0; j < (maximumLentgthOfTwoSets - maximumLentgthOfTwoSets / 2); j++) {
				if (smallerIntSet[i] == biggerIntSet[j]) {
					intersectedSet.add(smallerIntSet[i]);
					
					
				}
				
			}
		}
		
		for ( int i=0; i< intersectedSet.size();i++) {
			
			System.out.print(intersectedSet.get(i));

		}
	}

	public static void main(String[] args) {
		// keep this function call here

		FindIntersection(new String[] { "2,1,8", "1,8,9,89" });

	}

}