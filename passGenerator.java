import java.util.*;

public class passGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 963;
		int input2 = 582;
		int input3 = 175;
		int nums[] = {input1,input2,input3};
		ArrayList<Integer> digits = new ArrayList<Integer>(9);
		
		int password;
		
		int ones[] = new int[3];
		int tens[] = new int[3];
		int huns[] = new int[3];
		
		int o,t,h,th;
		
		for(int i=0; i<3; i++) {
			ones[i] = nums[i]%10;
			digits.add(ones[i]);
			nums[i] = nums[i]/10;
			
			tens[i] = nums[i]%10;
			digits.add(tens[i]);
			nums[i] = nums[i]/10;
			
			huns[i] = nums[i]%10;
			digits.add(huns[i]);
			nums[i] = nums[i]/10;
		}
		
		Arrays.sort(ones);
		Arrays.sort(tens);
		Arrays.sort(huns);
		Collections.sort(digits); //Sorting the digits to find max
		o = ones[0]; //min of ones
		t = tens[0]; //min of tens
		h = huns[0]; //min of huns
		th = digits.get(8);
	
		password = 1000*th + h*100 + t*10 + o*1;
		
		System.out.println("Password:" + password);
		
		
	}

}
