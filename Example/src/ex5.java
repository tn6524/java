import java.util.Arrays;

public class ex5 {
/*[TEST1]
다음 해당 값이 있습니다. 해당 값에 대해 배열로 각각 저장 되도록 합니다.
honggildong

결과 h,o,n,g,g,i,d,o,n,g 로 배열이 저장 되어야 합니다. 해당 처리는 외부 class에서 처리가 되도록 합니다.*/
	public static void main(String[] args) {
		String name = "honggildong";
		arr ar = new arr();
		ar.array(name);
	}

}
class arr {
	char[] nm = null;
	String sk = null;
	public void array(String a) {
		this.sk=a;
		   nm = new char[sk.length()];
		for(int w= 0;w<nm.length;w++) {
			nm[w] = this.sk.charAt(w);
		}
		System.out.println(Arrays.toString(nm));
	}
	
}