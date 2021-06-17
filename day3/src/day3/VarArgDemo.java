/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class VarArgDemo {
	public static double average(int...b) {
		double result,sum = 0;
		int x = b.length;
		for(int i:b)
			sum+=i;
		result = sum/x;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,4,6};
		System.out.println("Average is: "+ average(arr));
		System.out.println("Average is: "+ average(114,235,568,644,752,913));
	}

}
