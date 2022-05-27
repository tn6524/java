
public class If_for2 {

	public static void main(String[] args) {
		// 1~100까지 숫자 중 80이상의 숫자만 출력
		int f;
		for (f = 1; f < 101; f++) {
			if (f > 79) {
				// System.out.println(f+" ");
			}
		}

		/*
		 * 200~300까지 숫자 중 240 이하의 숫자만 출력하시오
		 * 
		 */
		int sc;
		for (sc = 200; sc < 301; sc++) {
			if (sc < 241) {
				System.out.println(sc + " ");
			}
		}

		final int a = 6;
		int w;
		for (w = 1; w < 11; w++) {
			if (w % a == 0) {
				// System.out.println(w+" ");
			}

		}

		// 응용문제 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자만 출력합니다
		final int b = 2;
		int t;
		int c;
		for (t = 1; t < 10; t++) {

			c = b * t;
			if (c > 9) {
				// System.out.println(""+c);
			}
		}
		/*
		 * 응용문제 다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오 18 36 54 72 
		 */
		final int g = 18;
		int q;
		int p=0;
		for (q = 1; q < 5; q++) {
			p = q * g;
			// System.out.println(p+" ");
		}

		// 응용문제 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오 1~20사이의 숫자 입니다. 6 14 17 19
		int aa;
		for (aa = 1; aa < 21; aa++) {
			if (aa == 6 || aa == 14 || aa == 17 || aa == 19) {
				System.out.println(aa + " ");

			}
		}
	}
}