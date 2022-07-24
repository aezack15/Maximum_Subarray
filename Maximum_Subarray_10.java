//Grind 75 problem # 10
//Maximum subarray

/*
input = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
output = 6
explanantion [4, -1, 2, 1] = 6
*/

import java.util.*;

class Maximum_Subarray_10{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the list [x,y,z] > ");
		String s = in.nextLine();
		s = s.substring(1, s.indexOf("]"));
		String[] t = s.split(",");
		int greatestSum = 0;
		
		int[] values = new int[t.length];
		for(int i=0; i<values.length; i++){
			values[i] = Integer.valueOf(t[i].trim());
		}
		
		
		for(int i=0; i<values.length; i++){
			int runningSum = values[i];
			for(int j=i; j<values.length; j++){
				if(j != i){
					runningSum = runningSum + values[j];
				}
				if(runningSum > greatestSum){
					greatestSum = runningSum;
				}
			}
		}
		System.out.println("Greatest sum: " + greatestSum);
	}
}
