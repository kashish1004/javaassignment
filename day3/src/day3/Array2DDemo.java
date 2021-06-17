/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int[3][4];
		System.out.println("Array using new keyword");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = (i*j)+1;
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		int arr1[][] = {{2,3,6,1},{9,8,5,7}};
		System.out.println("Array without using new keyword");
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0;j<arr1[i].length;j++)
				System.out.print(arr1[i][j]+"  ");
			System.out.println();
		}
	}

}
