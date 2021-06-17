/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate m[] = new MyDate[4];
		System.out.println("With new keyword");
		for(int i = 0;i<m.length;i++) {
			m[i] = new MyDate(10+i,6,2021);
			System.out.println(m[i]);
		}
		
		  MyDate md1[] = {new MyDate(),new MyDate(9,6,2021)};
		  System.out.println("Without new keyword");
		  for(MyDate i:md1) 
			  System.out.println(i);
		 
	}

}
