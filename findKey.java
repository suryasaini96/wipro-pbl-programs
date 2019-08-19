import java.util.*;

public class findKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {-744,52,15,71,92,23};
		int input2=6; //no of elements of array
		ArrayList<Integer> keys = new ArrayList<Integer>();
		ArrayList<Integer>[] digits = new ArrayList[input2];
		for (int i = 0; i < input2; i++) { 
            digits[i] = new ArrayList<Integer>(); 
        }
		boolean negFlag = false;
		int negPos=-1;
		int max = input1[0];
		int output=0;
		for(int i=0;i<input2;i++) {
			if(input1[i]<0) {
				int x = -input1[i];
				int d;
				negFlag = true;
				negPos = i;
				while(x>0) {
					d = x%10;
					digits[i].add(d);
					x=x/10;
				}
			}
			else {
				int x = input1[i];
				int d;
				while(x>0) {
					d = x%10;
					digits[i].add(d);
					x=x/10;
				}
			}	
		}
		if(!negFlag){
			for(int i=1; i<input1.length; i++) {
				if(input1[i]>max) {
					max = input1[i];
				}
			}
			System.out.println("No negative, hence max:" + max);
		}
		/*
		ArrayList = { 	A  K 
						4  7
						6  5
						5  1
						1  7
						2  9
						3  2 }		
		*/
		else {
			int next=digits[0].get(0);
			keys.add(digits[0].get(1));
			while(next!=negPos){ //returns keys till negative values
				keys.add(digits[next].get(1));
				next = digits[next].get(0);
			}
			keys.add(digits[negPos].get(1)); //also need key of negative
			for(int i=0; i<keys.size(); i++) {
				System.out.print(keys.get(i) + " ");
				if(i%2==0) {
					output+= keys.get(i);
				}
				else if(i%2==1) {
					output-= keys.get(i);
				}
			}
			System.out.println();
			System.out.println("Negative number, hence output:" + output);
		}
		
	}
}