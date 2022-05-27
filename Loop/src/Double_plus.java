
public class Double_plus {

	public static void main(String[] args) {
		/* 응용문제 do~while : 30~35까지 합계치를 출력하시오 */
		int a = 30;
		int t = 0;
		do {
			t += a;
			a++;
		} while (a < 36);
		System.out.println("합계:" + t);

		/* 응용문제 합계숫자 189가 있습니다. 단 1~10까지 합계치와 
		 * 현재 189를 뺀 총합계를 출력하시오. 
		 */
		int w =1;
		int total = 189;
		do {
			total-=w;
			w++;
		} while(w<11);
		System.out.println(total);
		
	}

}
