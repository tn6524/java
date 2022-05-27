import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 2 사용자가 입력한 숫자에 맞춰서 구구단이 작용되며, 구구단 결과를 계산하여 짝수 인지 홀수 인지를 출력하세요
		 * "구구단에 대한 숫자를 입력하세요?" 라고 메세지가 출력되면 해당 숫자에 맞춰서 모든 결과를 더하며, 더한 값에 따라 짝수 인지 홀수
		 * 인지를 출력하시면 됩니다. 단, 해당 반복문은 for~ do while문까지 한가지를 선택하여 작성하시오
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("원하는 단을 입력해주세요"); int
		 * a = sc.nextInt(); int b; int total = 0; sc.close();
		 * 
		 * for (b = 1; b < 10; b++) { System.out.println(a + "x" + b + "=" + a * b);
		 * total += a * b; } System.out.println(total);
		 * 
		 * if (total % 2 == 0) { System.out.println("짝수입니다."); } else {
		 * System.out.println("홀수입니다."); }
		 */
		/*풀이*/Scanner sc = new Scanner(System.in);
		String msg = "구구단에 대한 숫자를 입력하세요";
		String msg2; // 메세지 구분
		System.out.println(msg);
		int user = sc.nextInt();
		int f = 1;
		int t = 0;
		do {
			t += user * f;
			f++;
		} while (f < 10);
		// System.out.println(t);
		if (t % 2 == 0) {
			msg2 = "짝수";
			System.out.println(msg2 + "입니다.");
		} else {
			msg2 = "홀수";
			System.out.println(msg2 + "입니다.");
		}
		sc.close();
	}
}
