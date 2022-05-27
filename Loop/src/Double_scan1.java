import java.util.Scanner;

public class Double_scan1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 총 3번의 숫자를 입력합니다 3개 숫자를 모두 곱하여 총 합계 수를 출력하시오
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b;
		/* long */double total = 1;// long을 입력시 최종결과에서 -음수 발생함
		do {
			System.out.println("숫자를 입력해주세요");
			b = sc.nextInt();
			total *= b;
			a++;
		} while (a < 4);

		System.out.println("총 합계는" + total + "입니다.");
		sc.close();
	}

}
