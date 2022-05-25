import java.util.Scanner;

public class sc9 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 조건문 코드를 작성 하시오. 고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다. 고객의 기본 자산금액은 :
		 * 100000 "1번 입력시 입금, 2번 입력시 출금 입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다. 
		 * 1번을 입력시"해당 금액을 입력하세요" 사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산금액을 출력하시면 됩니다. 
		 * 2번을 입력시"출금할 금액을 입력하세요" 기본자산 금액-사용자가 입력한 금액을 계산하여 출력하면 됩니다.
		 * 
		 */
		Scanner a = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다.");
		int b = a.nextInt();
		if (b == 1) {
			System.out.println("해당 금액을 입력하세요");
		} else if (b == 2) {
			System.out.println("출금할 금액을 입력하세요");
		}
		else {
			System.out.println("번호를 확인 후 다시 눌러주세요");
		}
		Scanner e = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금"
				+ " 입니다.");
		int y = e.nextInt();
		if (y == 1) {
			System.out.println("해당 금액을 입력하세요");
		} else if (y == 2) {
			System.out.println("출금할 금액을 입력하세요");
		}
		Scanner r = new Scanner(System.in);
		int t = r.nextInt();
		if (y == 1) {
			System.out.println(10000 + t + "원입니다.");
		} else if (y == 2) {
			System.out.println(10000 - t + "원입니다.");
		}
		
		
			a.close();
			e.close();
			r.close();
			
		}
	}


