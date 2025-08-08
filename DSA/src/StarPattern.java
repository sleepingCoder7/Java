
public class StarPattern {

	public static void main(String[] args) {
		printSolidRectangle(4,5);
		System.out.println("--------------------------------");
		printHollowRectangle(4,5);
		System.out.println("--------------------------------");
		printHalfPyramid(4);
		System.out.println("--------------------------------");
		printInvertedHalfPyramid(4);
		
	}

	private static void printInvertedHalfPyramid(int height) {
		for(int i = height;i > 0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void printHalfPyramid(int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void printHollowRectangle(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}

	private static void printSolidRectangle(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
