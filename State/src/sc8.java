import java.util.Scanner;

public class sc8 {

	public static void main(String[] args) {
		/*응용문제
		 * 사용자가 입력하여 조건에 맞는 메세지를 출력하시오
		 * 첫번째 숫자값을 입력하세요?
		 * 두번째 숫자값을 입력하세요?
		 * 첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하시오
		 * 단, 해당 결과값이 100 이하일 경우 출력메시지"100이하의 결과값입니다"라고 설정하시고 100 이상일 경우"해당 값은 100이상 결과값입니다."라고 출력하세요
		 */

  Scanner a1 = new Scanner(System.in);
  System.out.println("첫번째 숫자 값을 입력하세요?");
  int b = a1.nextInt();
  System.out.println("두번째 숫자 값을 입력하세요?");
  int c = a1.nextInt();
  int d = b*c;
  if(d<100) {
	  System.out.println("100이하의 결과값입니다.");
  }
  else if(d>100){
		  System.out.println("해당 값은 100이상 결과 값입니다.");
	  }
  a1.close();
  }

	}

