import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		byte a = 10;
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");

		} else if (a >= 10 || a <= 22) { // 조건문에 범위를 설정하여 적용됌
			System.out.println("당첨 입니다.");

		} else {
			System.out.println("범위 밖의 숫자 입니다.");
		}
		/*
		 * 응용문제 Q. 1~45까지 숫자 하나를 입력하세요 
		 * error문구 
		 * 0을 입력 : 숫자 입력이 잘못 되었습니다. 
		 * 45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
		 * 7, 12, 14 세가지 숫자가 입력시 당첨입니다. 라고 출력
		 * 그 외에 숫자시 다음기회에 참여하세요 라고 출력
		 */

		Scanner c = new Scanner(System.in);
		System.out.println();
		int f = c.nextInt();
		if (1 <= f && f <= 6&& f<=11&&f==13&&f<=45) {
			System.out.println("Q. 1~45까지 숫자 하나를 입력하세요");
		} else if (f == 0) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		else if (f==7||f==12||f==14) {
			System.out.println("당첨입니다.");
		}else if(f<1||45<f) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		} else {
			System.out.println("다음기회에 참여하세요");
		}
		c.close();
	}
}





/*풀이
 * Scanner c = new Scanner(System.in);
 
System.out.println("Q. 1~45까지 숫자 하나를 입력하세요");
int f = c.nextInt();
if ( f == 0) {
	System.out.println("숫자 입력이 잘못 되었습니다.");
}
else if (f>45) {
	System.out.println("숫자는 1~45까지만 입력 가능합니다.");
}
else if (f == 7 || f == 12 || f == 14) {
	System.out.println("당첨입니다.");
}
else if(f==41) {
	System.out.println("50% 쿠폰 당첨입니다.");
}
else {
	System.out.println("다음기회에 참여하세요");
}

}
}
*/