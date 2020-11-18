package lesson8;

public class Question8_2 {
	public static void main(String[] args) {
		for(int i = -8; i <= 8; i++) {
			printGrach(i * i);
		}
	}
	public static void printGrach(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
			}
		System.out.println();
	}
}
