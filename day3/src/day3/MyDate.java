/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day3;

public class MyDate {
	private int day,month,year;
	public MyDate() {
		day = 10;
		month = 6;
		year = 2021;
	}
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void printDate() {
		System.out.println("Date is :"+day+"/"+month+"/"+year+"/");
	}
	public String toString() {
		return "Day: " + day +" Month: "+month+" Year: "+year;
	}
}
