
public class While2 {

	public static void main(String[] args) {
		
		  int a = 1; int b = 4; int c; while (a < 10) { c = a * b;// 산술연산
		  System.out.print(c + ",");
		  
		  a++;// 위로 올릴경우 전혀 다른 값 출력
		  
		  } /* 응용문제 56,49,42,35,28,21, 해당 결과값을 확인하여 반복문으로 코드를 작성하시오*/
		 
		int d = 8;
		int e = 7;
		int h;
		while (d > 2) {
			h = e * d;
			 System.out.print(h + ",");

			d--;

		}
		/*
		 * 응용문제2 다음 결과 값을 확인 한 후 해당 결과 값에 맞는 코드를 작성하시오 4,7,10,13,16,19,22
		 */
		int p = 1;
		int q = 3;
		int u;
		while (p < 8) {
			u = p * q + 1;
			System.out.println(u);

			p++;
		}

	}

}
