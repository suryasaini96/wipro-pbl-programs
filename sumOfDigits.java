
public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -99999;
		int r;
		int sum = 0;
		boolean neg = false;
		if (num<0) {
			neg = true;
			num = Math.abs(num);
		}
		do{
			while(num>0) {
				r = num%10;
				sum+= r;
				num/= 10;
			}
			if(sum>9) {
				num = sum;
				sum = 0;
			}
		}while(num>9);
		
		if(neg) {
			System.out.println(-sum);
		}
		else
			System.out.println(sum);
		
		
		
			
	}

}
