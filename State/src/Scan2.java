import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String f = e.next();
		// System.out.println(d);
		if (f.equals("kim") || f.equals("hong")) {
			// 문자열 형태는 Scanner이용시 equals라는 함수를 사용합니다.
			System.out.println("회원이 확인 되었습니다.");
		} else {
			System.out.println("확인되지 않습니다.");
		}
		e.close();
	}

}
