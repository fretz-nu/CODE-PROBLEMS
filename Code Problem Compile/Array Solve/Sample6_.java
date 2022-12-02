public class Sample6 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5 }, { 9, 1, 3 } };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += matrix[i][0]

			;
		}
		System.out.println("Sum of all first element are: " + sum1);
		for (int j = 0; j < 3; j++) {
			if ((j == 0) || (j == 2)) {
				sum2 += matrix[j][2];
			} else {
				sum2 += matrix[j][1];
			}
		}
		System.out.println("Sum of all last element are: " + sum2);

		// QUESTION: SUM all first element = 14
		// QUESTION: SUM all last element. = 11
	}
}