/* Problem 6 - Sum Square Difference

Solved.

The sum of the squares of the first ten natural numbers is,
1**2 + 2**2 + ... + 10**2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)**2 = 55**2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */

class Problem_006 {
	public static void main(String[] args) {
		
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for(int i = 1; i <= 100; i++){
			sumOfSquares += i*i;
			squareOfSum += i;
		}
		squareOfSum = squareOfSum * squareOfSum;
		System.out.println(squareOfSum - sumOfSquares);
	}
}
