import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * 응용문제9 a학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다. "점수를 입력하세요?" 라는 문구는 총 5번이 나오게
		 * 되며, 모든 점수는 합산한 후 5개의 점수에 대한 평균값을 출력하세요 출력 메세지는"해당점수의 평점은?"출력 단, 평점 점수가 40점 이하
		 * "재시험입니다" 출력 후 프로세서 종료 40점 이상 일 경우 "합격" 출력 (추가) "입력하실 과목 수를 적어주세요"라고 제일 먼저 출력
		 * 후 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용 되어야 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요");
		int c = sc.nextInt();
		int b;
		double score = 0;
		for (b = 1; b < 6; b++) {
			System.out.println("점수를 입력하세요?");
			int a = sc.nextInt();
			score += a;
			if (c == b) {
				break;
			}

		}
		double point = score / c;
		System.out.println("a 학생의 평점은 " + point);
		if (point <= 40) {
			System.out.println("재시험");
		} else {
			System.out.println("합격");
		}
		sc.close();
		//while문 
		/*Scanner sc1 = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요:");
		int subject = sc1.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while (w <= subject) {
			System.out.println("점수를 입력해주세요:");
			user = sc1.nextInt();
			total += user;
			w++;
		}
		double avg = total / subject;
		String msg;
		if (avg < 40) {
			msg = "재시험입니다.";
		} else {
			msg = "합격입니다";
		}
		System.out.println("최종 평균 점수는" + avg + msg);*/
	}

}
