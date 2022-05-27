import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		// 1~100까지 모두 더하는 반복문을 만드시오
		/*
		 * int a; int total=0; for(a=1;a<101;a++) { total+=a; }
		 * System.out.println(total); 1~100까지 곱한 결과값
		 */
		int c;
		// BigInteger : java에서 모든 무한의 값을 저장 할 수 있는 유일한 자료형
		BigInteger f = new BigInteger("1");// 합계에 사용할 자료형 변수 1을 최초값으로 설정 단, "를 무조건 적용해야함
		for (c = 1; c < 101; c++) {
			/*multiply :사칙연산 곱하기를 담당함
			 * add : 사칙연산 더하기를 담당함
			 * subtract : 사칙연산 빼기를 담당함
			 * diyide : 사칙연산 나누기를 담당함
			 */
			f = f.multiply(BigInteger.valueOf(c));
		}
		System.out.println(f);
	}

}
