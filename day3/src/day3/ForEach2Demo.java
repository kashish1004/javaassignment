/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int[3][4];
		System.out.println("Array using new keyword");
		arr[0][0] = 1;
		arr[0][1] = 4;
		arr[1][3] = 7;
		arr[2][0] = 6;
		arr[2][3] = 9;
		for(int[] i:arr) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
		int arr1[][] = {{2,3,6,1},{9,8,5,7}};
		System.out.println("Array without using new keyword");
		for(int[]i:arr1) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}

	}

}
