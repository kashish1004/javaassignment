/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println("Array using new keyword: ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int arr1[] = {10,20,30,40,50}; 
		System.out.println("Array without using new keyword: ");
		for(int i = 0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		String city[] = new String[5];
		city[0] = "Ahmedabad";
		city[1] = "Delhi";
		city[2] = "Mumbai";
		city[3] = "Pune";
		city[4] = "Bangalore";
		System.out.println();
		System.out.println("City names array: ");
		for(int i = 0;i<city.length;i++)
			System.out.print(city[i]+"  ");
		String hobby[] = {"Music","Reading","Chess"};
		System.out.println();
		System.out.println("Hobby array: ");
		for(int i = 0;i<hobby.length;i++) 
			System.out.print(hobby[i]+"  ");
	}

}
