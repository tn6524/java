import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * 응용문제8 사용자 패스워드는 a1234입니다. 사용자가 패스워드를 입력합니다. 단, 3회이상 실패시 다음과 같이 출력 되도록 합니다.
		 * "패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다." 단, 패스워드가 맞을 경우 " 로그인 하셨습니다" 라고 출력되야합니다.
		 */
		String a = "a1234";
		Scanner b = new Scanner(System.in);
		int c;
		int g=3;
		System.out.println("패스워드를 입력하세요");
		for (c = 1; c < 4; c++) {
			String pass = b.next();
			if (pass.equals(a)) {
				System.out.println("로그인 하셨습니다.");
				break;
				
			} else {
				System.out.println("패스워드를 다시 입력하세요");

			}
			g--;
			if(g==0) {
				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
			}b.close();

		}
		/*/final String pw = "a1234";
		int q = 3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "패스워드를 입력해주세요";
		while(w<4) {
			System.out.println(msg);
			String userpw =sc.next();
			if(pw.equals(userpw))
			System.out.println("로그인 되었습니다.");
			break;
		}
		else {
			msg = "올바른 패스워드를 넣어주세요";
			q--;
			if(q==0) {
				System.out.println("패스워드 횟수제한으로 가까운 지점에 방문하셔야 합니다.");
		}
		w++;
	}*/
	}
}
