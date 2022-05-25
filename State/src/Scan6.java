import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		
		Scanner mid = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요");
		String m = mid.next();// 사용자가 아이디 입력
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");
		String p = mpass.next(); //사용자가 패스워드 입력
		
		if (m.equals("jung")||m.equals("j1234")) {
			if (m.equals("su")&&p.equals("ssh"))
		System.out.println("로그인 되셨습니다");
		}
		else if(m.equals("su")&&p.equals("ssh"))
				System.out.println("로그인 되셨습니다");
		{
				
		}
		  
				System.out.println("회원정보를 다시 확인하세요");
				{	
						System.out.println("가입되지않은 사용자입니다.");
				}
				}
				{
}
		
	}


// System.out.printf("아이디%s,패스워드%s",m,p);

/*
 * 로그인 프로그램 회원가입 아이디는 jung,su 패스워드 jung : j1234 su : ssh 해당 아이디 외에 나머지는
 * "가입되지 않은 사용자 입니다." 라고 출력합니다 또한 패스워드가 틀릴경우 "회원정보를 다시 확인하세요"라고 출력합니다 아이디 및
 * 패스워드가 모두 맞을경우 "로그인 되셨습니다" 라고 출력하십시오
 */
