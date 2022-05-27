import java.math.BigInteger;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * 응용문제7 사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 표출하는 프로세서 제작합니다. "첫번째 입력값 단(1~10까지)
		 * 입니다. "두번째 입력값 단(1~10까지) 입니다. "세번째 입력값 단(1~10까지) 입니다.
		 * "마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 적으시오:" +,-,*,/, 해당 산술기호에 맞게 산술식을 적용하여 최종값을
		 * 출력시키시오
		 */
		int total = 0;
		double total3=0;
		int total1 = 1;
		BigInteger total2 = new BigInteger("1");
		Scanner a = new Scanner(System.in);
		System.out.println("첫번째 입력값을 적어주세요(1~10까지)");
		int b = a.nextInt();
		System.out.println("두번째 입력값을 적어주세요(1~10까지)");
		int c = a.nextInt();
		System.out.println("세번째 입력값을 적어주세요(1~10까지)");
		int d = a.nextInt();
		System.out.println("해당 세가지 값에 대한 산술기호를 적어주세요");
		/*String ms =a.next();
		 * if(ms.eq){
		 */
		
		String e = a.next();
		if (e.equals("+")) {
			total += b + c + d;
			System.out.println("산술기호를 적용한 최종값은:" + total);
		} else if (e.equals("-")) {
			total3 -= b - c - d;
			System.out.println("산술기호를 적용한 최종값은:" + total3);
		} else if (e.equals("*")) {
			total1 *= b * c * d;
			System.out.println("산술기호를 적용한 최종값은:" + total1);
		} else if (e.equals("/")) {
			total2 = total2.multiply(BigInteger.valueOf(c));
			System.out.println("산술기호를 적용한 최종값은:" + total2);
		}a.close();
	}
}
