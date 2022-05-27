
public class If_while1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 while문으로 10~30까지 숫자 중에서 홀수값만 출력하시오 홀수값 중 20이상의 홀수 값만 출력하시오
		 */
		int a = 10;
		while (a < 31) {
			if (a % 2 == 1 && a > 19) {
				System.out.println(a + " ");
			}
			a++;

		}
		// 카운터 값으로 갯수 파악하기
		
		/*
		 * 1~10까지 숫자 중에 짝수값이 몇개 있는지 갯수를 출력하세요
		 */
		int b = 1;
		int count = 0;//카운터 변수 값 
		while (b<11) {
			if (b%2==0) {//짝수일 경우
				count++;//해당 조건이 맞을 경우 +1씩 증가함
			}
			b++;
		}
		//반복문 종료시 최종 카운터 값을 출력하게 됩니다.
		System.out.println("1~10까지 숫중 짝수 갯누는 :"+count);

	}

}