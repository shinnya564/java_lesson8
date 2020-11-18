package lesson8;

public class Question8_5 {
	public static void main(String[] args) {
		String[] x = getYourName();
		System.out.println("苗字は" + x[0]);
		System.out.println("名前は" + x[1]);
	}
	public static String[] getYourName() {
		String[] name = {"tanaka","taro"};
		return name;
	}
}
