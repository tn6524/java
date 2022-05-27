
public class If3 {

	public static void main(String[] args) {

		// boolean : true, false 로 구분하게 됩니다.
	/*	boolean od = true;
		if (od = true) {
			System.out.println("회원가입이 진행 됩니다.");
		}
		else {
			System.out.println("이용약관에 동의하셔야만 진행 됩니다.");
		}*/

		String id = "park";
		String pass = "a1234";

		// && : 한가지 조건 이상 모두 맞을 경우
		// || : 한가지 조건 이상에서 한개라도 맞을 경우

		if (id == "park" && pass == "a1234") {
			System.out.println("로그인 하셨습니다.");
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요");
		}
		if (id == "Lee" || id == "kim") {
			//if(id=="park"||id=="kim" 두 조건중에 한가지라도 맞을 경우 )
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("확인된 아이디가 없습니다.");
		}
	}

}




