import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		// for문 + Scanner

		Scanner a = new Scanner(System.in); // 입력엔진 로드
		System.out.println("원하시는 구구단 숫자를 입력하세요");// 질문사항
		int b = a.nextInt();// 사용자가 입력한 내용
		int c;// 반복문에 사용하는 변수
		int d; // 반복문의 산술연산 결과 값
		for (c = 1; c < 10; c++) {
			d = b * c;// 산술연산
			System.out.println(d);// 출력
			a.close();// 종료
		}
	}
}