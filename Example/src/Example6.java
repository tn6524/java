
public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 6 1~10까지 순차적으로 적용하는 반복문이 있습니다. 단, 1~5까지는 모든 값을 곱하고, 6~10까지는 모든 값을 더합니다.
		 * 해당 두개의 값을 비교하여 더한값이 큰지, 곱한 값이 큰지를 결과로 출력하시오
		 */
		// for문
		int a;
		int b = 1;
		int c = 0;
		for (a = 1; a < 11; a++) {
			if (a < 6) {
				b *= a;
			} else
				c += a;
		}
		if (b > c) {
			System.out.println("1~5까지 곱한 값이 더 큽니다.");
		} else if (b<c) {
			System.out.println("6~10까지 더한 값이 더 큽니다.");
		} else {
			System.out.println("두 값이 같습니다.");
		}
		// while문
		int p = 1;
		int q = 1;
		int o = 0;
		while (p < 11) {
			if (p < 6) {
				q *= p;
			} else
				o += p;
			p++;
		}
		if (q > o) {
			System.out.println("1~5까지 곱한 값이 더 큽니다.");
		} else if(q<o){
			System.out.println("6~10까지 더한 값이 더 큽니다.");
		}else {
			System.out.println("두 값이 같습니다.");
		}
// do while문
		int aa = 1;
		int bb = 1;
		int cc = 0;
		do {
			if (aa < 6) {
				bb *= aa;
			} else
				cc += aa;

			aa++;
		} while (aa < 11);
		if (bb > cc) {
			System.out.println("1~5까지 곱한 값이 더 큽니다.");
		}  else if(bb<cc){
			System.out.println("6~10까지 더한 값이 더 큽니다.");
		}else {
			System.out.println("두 값이 같습니다.");
		}
	}
}