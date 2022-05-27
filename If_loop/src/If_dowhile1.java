
public class If_dowhile1 {

	public static void main(String[] args) {

		/*
		 * 응용문제 구구단 6단 중에서 35이상 결과 숫자만 출력하시오
		 */
		int a = 1;
		int b = 6;
		int c= 0;
		do {
			c = 6 * a;
			if (c > 34)
				System.out.println(c);
				a++;
		} while (a < 10);
		
			

//응용문제 14~27까지 숫자중 짝수값만 모두 더하여 최종 결과값을 출력하시오
		/*
		 * int c = 14; 
		 * int d= 0;
		 * do { 
		 * if(c%2==0) {
		 *  d+=c;
		 * } c++;
		 *  }while(c<28); {
		 * 
		 * } System.out.println(d);
		 */
	}

}
