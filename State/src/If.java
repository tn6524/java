
public class If {

	public static void main(String[] args) {

		int a = 100;
		int b = 100;
		// 조건문(if-else)
		if (a > b) {// if문
			System.out.println("a값이 더 큽니다.");
		} else if (a < b) { // else if 문
			System.out.println("b값이 더 큽니다.");
		} else { // else문
			System.out.println("두 값이 같습니다.");
		}

		if (a > b)

		{
			System.out.println("a 값이 더 큽니다.");
		} else if (a < b) {
			System.out.println("b 값이 더 큽니다.");
		} else if (a == b) {
			System.out.println("두 값이 같습니다.");
		}
	}
}
/* 부등호기호 : <, > ,<=, >=, == */