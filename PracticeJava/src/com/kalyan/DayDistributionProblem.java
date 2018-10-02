package com.kalyan;

import java.util.Scanner;

public class DayDistributionProblem {

	public static void main(String[] args) throws DayFormatException, WeeklySumException {

		System.out.println("Enter the day String in seven char size :");
		Scanner sc = new Scanner(System.in);
		String dayString = sc.next();
		System.out.println("Enter Sum of total weekly hours:");
		int weeklySum = sc.nextInt();
		sc.close();
		char[] individualDayEffort = dayString.toCharArray();
		int knownDaysEffort = getKnownDaysEffort(individualDayEffort);
		int noOfUnknownDays = findUnknownDays(individualDayEffort);
		exceptionHandler(dayString, weeklySum, noOfUnknownDays, knownDaysEffort);

		findPossibleDistribution(dayString, weeklySum, individualDayEffort, noOfUnknownDays, knownDaysEffort);

	}

	private static void findPossibleDistribution(String dayString, int weeklySum, char[] individualDayEffort,
			int noOfUnknownDays, int knownDaysEffort) {
		int effortToBeUsed = weeklySum - knownDaysEffort;

		char[] possiblePositions = getPossiblePositions(dayString, weeklySum, individualDayEffort, noOfUnknownDays,
				knownDaysEffort, effortToBeUsed);

		for (int i = 0; i < noOfUnknownDays; i++) {

		}

	}

	private static char[] getPossiblePositions(String dayString, int weeklySum, char[] individualDayEffort,
			int noOfUnknownDays, int knownDaysEffort, int effortToBeUsed) {
			char[] temp = null ;


		
		
		
		
		
		return null;
	}

	private static int getKnownDaysEffort(char[] individualDayEffort) {
		int temp = 0;
		for (char c : individualDayEffort) {

			if (Character.isDigit(c)) {
				temp += Character.getNumericValue(c);
			}
		}
		return temp;
	}

	private static int findUnknownDays(char[] individualDayEffort) {
		int tempCount = 0;
		for (char c : individualDayEffort) {
			if (c == '?') {
				tempCount += 1;
			}
		}
		return tempCount;
	}

	private static void exceptionHandler(String dayString, int weeklySum, int noOfUnknownDays, int knownDaysEffort)
			throws DayFormatException, WeeklySumException {

		if (!dayString.contains(".*\\d+.*") && !dayString.contains("?") || dayString.length() > 7
				|| dayString.length() < 7) {
			throw new DayFormatException();
		}

		if (!validateWeeklySum(weeklySum, noOfUnknownDays, knownDaysEffort)) {
			throw new WeeklySumException();
		}
	}

	private static boolean validateWeeklySum(int weeklySum, int noOfUnknownDays, int knownDaysEffort) {
		boolean result = false;
		if ((weeklySum - knownDaysEffort) <= noOfUnknownDays * 8) {
			result = true;
		}
		return result;
	}

}
