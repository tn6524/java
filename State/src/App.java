
public class App {

	public static void main(String[] args) {
		// 공식 1 25+31*4+12
		// 공식 2 15*3+9+14
//합산 계산 공식 중 작은 값을 출력하시오

		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;
		if (a < b) {
			System.out.println("a의 값은" + a + "로 b의 값인" + b + "의 값 보다 더 작습니다.");
		}
		else if (a > b)
			System.out.println("b의 값은" + b + "로 a의 값인" + a + "의 값 보다 더 작습니다.");
		else {
			System.out.println("두 값이 같습니다.");
		}

		/* 해당 값을 2진수로 짝수 , 홀수로 확인하기 */
		int c = b % 2; // %기호로 사용시 0또는 1로 나머지 값이 출력이 됩니다.
		if (c == 0) {
			System.out.println("짝수 입니다.");
		} 
		else {
			System.out.println("홀수 입니다.");
		}
	}

}
