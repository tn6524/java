
public class For2 {

	public static void main(String[] args) {

		/*int a;// for문 초기값
		int b = 3; // 연산에 사용할 변수
		int c; // 연산한 결과값 사용
		for (a = 1; a < 10; a++) {
			c = b * a; // 산술연산 작업
			// System.out.print(c + ","); // 연산된 결과값을 출력함
		}
		/*
		 * 응용문제 다음 결과값을 보고 코드를 작성하시오. 
		 * 45,40,35,30,25,20
		 *
		 */
		int e;
		int t = 5;
		int y;
		for (e = 9; e > 3; e--) {
			y = e * t;
			System.out.print(y + ",");
		}
		/*응용문제
		   다음 결과 값을 확인 후 코드를 제작하여 출력하시오
		   11,22,33,44,55,66,77,88,99
		  */ 
		 
		int aa;
		int bb = 11;
		int cc;
		for (aa = 1; aa<10; aa++) {
			cc= aa*bb;
			System.out.print(cc+",");
			
			int z; //for
			int x; //결과값
			
			for(z=1;z<10;z++) {
				x=11*z;
				
				System.out.print(x+",");
			}
		}

	}

}
