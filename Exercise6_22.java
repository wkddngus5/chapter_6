package chapter_6;

public class Exercise6_22 {

	static boolean isNumber(String str) {
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) > '9') {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));

		str = "123ㅇ";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));

	}

}
