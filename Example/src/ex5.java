import java.util.Arrays;

public class ex5 {
/*[TEST1]
���� �ش� ���� �ֽ��ϴ�. �ش� ���� ���� �迭�� ���� ���� �ǵ��� �մϴ�.
honggildong

��� h,o,n,g,g,i,d,o,n,g �� �迭�� ���� �Ǿ�� �մϴ�. �ش� ó���� �ܺ� class���� ó���� �ǵ��� �մϴ�.*/
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