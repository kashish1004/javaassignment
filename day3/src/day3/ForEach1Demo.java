/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = new double[5];
		arr[0] = 12487.21;
		arr[1] = 47851.59;
		arr[2] = 87945.26;
		System.out.println("Array using new keyword");
		for(double a:arr)
			System.out.print(a + "\t");
		float arr1[] = {10.3f,1.02f,21.0f,14.6f,31.0f};
		System.out.println();
		System.out.println("Array without using new keyword");
		for(float i:arr1)
			System.out.print(i + "\t");
		String flower[] = {"Rose","Lily","Sunflower","Lotus"};
		System.out.println();
		System.out.println("Flower:");
		for(String i:flower)
			System.out.print(i+"\t");
		String country[] = {"India","USA","UK","Russia"};
		System.out.println();
		System.out.println("Country:");
		for(String i:country)
			System.out.print(i+ "\t");
	}

}
