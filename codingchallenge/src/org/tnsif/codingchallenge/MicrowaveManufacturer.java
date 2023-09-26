/*ques2: a microwave oven manufacturer recommends that when heating two items add 50% to the heating time, & when 
 * the heating 3 items  double the heating time. Heating more than 3 items at once is not recommended. 
 * write a prog to find out the recommended heating time.INPUT: total no of items=2 , heating time = 5.0 (50%+5.0)
 *  ans 7.5 
*/
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MicrowaveManufacturer {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of items: ");
		
		
		int items = sc.nextInt();
		System.out.print("Enter the heating time for one item : ");
        double time = sc.nextDouble();
		
        double heatingTime=0;
        
		switch(items) {
		case 1: 
			
	        heatingTime = time;
			break;
		
		case 2:
		
			heatingTime = (time*0.5)+time;
            break;
		case 3:
			
			heatingTime = 2*(time);
            break;
        default:
        	System.out.println("Heating more than 3 items are not recommended.");
        	System.exit(1);
        }
		
		System.out.println("Recommended Heating time: " + heatingTime);
		

	}

}
