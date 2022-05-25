import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 * 인정번호 발송에 대한 번호 비교코드 Q. 인증받은 번호를 입력하세요? 숫자 220524
		 * 
		 * 사용자가 숫자 220524를 외에 입력시 "인증번호가 틀립니다" 라고 출력하시고 동일한 인증번호 숫자를 입력시 "인증확인 되셨습니다" 라고
		 * 출력합니다. 단, 220524는 java실행 시 가장 먼저 실행되는 변수로 처리 하세요
		 */
		int sc = 220524;
		//System.out.println("인증번호는"+sc+"입니다.");
		Scanner mail = new Scanner(System.in);
		System.out.println("인증받은 번호를 입력하세요");
		int t = mail.nextInt();
		if (t == sc) {
			System.out.println("인증확인 되셨습니다.");
		} else {
			System.out.println("인증번호가 틀립니다.");
		}
		mail.close();
	}

}


/*if(조건)
 * 해당 조건이 맞을경우 실행되는 코드
 * else if(if 외에 다른조건)
 * 해당 조건이 맞을경우 실행되는 코드
 * else
 * if의 반대 또는 조건이 하나만 남아있는 경우
 * boolean a =true, false ("사용 금지)
 * Scanner a = new Scanner(System.in); 
 * System.out.println("성적을 입력해 주세요?);
 * int aa = a.nextInt();
 * 
 */


