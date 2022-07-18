import java.util.ArrayList;

import java.util.Collections;

import java.util.Random;

 

public class ex7 {

	

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();

		num n = new num();

		n.ran(number);

		ArrayList<Integer> num =n.getter();

		System.out.println(num);

		

	

	

	

	}

}

class num{

	ArrayList<Integer> number = null;

	public void ran(ArrayList<Integer> number) {

		this.number=number;

		 int a[] = new int[5];

	     Random r = new Random();

 

	     for(int i=0;i<=4;i++)

	     {

	         a[i] = r.nextInt(10)+1; 

	         for(int j=0;j<i;j++) 

	         {

	             if(a[i]==a[j])

	             {

	                 i--;

	             }

	         }

	     }

 

	     for (int value : a) {

	         this.number.add(value);

	     }

	     Collections.sort(this.number);	//오름차순 정렬

	    

	}

public ArrayList<Integer> getter() {

	return this.number;

}

    

	}

 

	