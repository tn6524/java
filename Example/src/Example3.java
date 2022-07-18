import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {
 
	public static void main(String[] args) {
		
		/*
		  다음 숫자배열값을 짝수, 홀수 각각 값을 가져와서 배열로 처리합니다.
		  결과 : 짝수 [2,6,10,22,42,50]
		  홀수 [1,7,11,15,43,51]

		 */

		Integer[] numberList = { 1, 2, 6, 7, 10, 11, 15, 22, 42, 43, 50, 51 };
        
        calculation ca = new calculation(numberList,true);
        calculation ca2 = new calculation(numberList, false);
        
        ca.start();
        ca2.start();
  
  
}
}
class calculation extends Thread{
List<Integer>numberList = new ArrayList<>();
List<Integer>collector = new ArrayList<>();
boolean isEven;

public calculation(Integer[] number, boolean isEven) {
  
  this.isEven = isEven;
  this.numberList.addAll(Arrays.asList(number));
}
@Override
public void run() {
  for(int i = 0; i < numberList.size(); i++) {
     if(isEven && this.numberList.get(i)%2 == 0) {
        this.collector.add(this.numberList.get(i));
     }
     if(!isEven && this.numberList.get(i)%2 != 0) {
        this.collector.add(this.numberList.get(i));
     }
  }
  System.out.println(this.collector);
}
}

