
public class CompareString {

	public static void main(String[] args) {
		String s1 = "I am using HackerRank to improve programming";
		String s2 = "am HackerRank to improve xyz xyz xyz xyz xyz xyz xyz xyz xyz";

		System.out.println(compareStrings(s1, s2));

	}

	private static String[] compareStrings(String s1, String s2) {
		String[] firstInput = s1.split(" ");
		String[] secondInput = s2.split(" ");
		String[] resultArray;
		int i = 0;
		int removedCount = 0;

		for (String firstVal : firstInput) {
			if (i > firstInput.length)
				break;
			for (String secondValue : secondInput) {
				if ((firstVal.equals(secondValue))) {
					firstInput[i] = null;
					removedCount++;
				}
			}
			i++;
		}
		int resultLength = firstInput.length - removedCount;
		resultArray = new String[resultLength];
		int j = 0;
		for (String firstValue : firstInput) {
			if (j >= resultLength)
				break;
			if (firstValue != null) {
				resultArray[j] = firstValue;
				j++;
			}
		}

		return resultArray;
	}

}
