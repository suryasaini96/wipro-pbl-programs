import java.util.*;

public class remove1DigitforPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10101;
		int numCpy = num;
		boolean palindrome = false;
		int digit=0;
		int r;
		ArrayList<Integer> rev = new ArrayList<Integer>();
		ArrayList<Integer> org = new ArrayList<Integer>();
		ArrayList<Integer> orgCpy = new ArrayList<Integer>();
		ArrayList<Integer> revCpy = new ArrayList<Integer>();

		while(num>0){
			r = num%10;
			rev.add(r);
			revCpy.add(r);
			num/=10;
		}

		for(int i=rev.size()-1; i>=0; i--){
			org.add(rev.get(i));
			orgCpy.add(rev.get(i));
		}
		
		//Algorithm: try by removing 1 number at a time and check palindrome if not
		
		//first check already existing palindrome
		for(int i=0; i<org.size(); i++){
			if(org.get(i)==rev.get(i)){
				palindrome = true;
			}
			else{
				palindrome = false;
				break;
			}
		}
		if(palindrome)
				digit = -1;
		
		else if(!palindrome){
			int k = org.size()-1;
			while(k>=0){
				digit = org.get(k);
				org.remove(k);
				rev.remove(rev.size()-k-1);
				for(int j=0; j<org.size(); j++){
					if(org.get(j)==rev.get(j)){
						palindrome = true;
					}
					else{
						palindrome = false;
						org.clear();
						rev.clear();
						for(int i=0; i<orgCpy.size(); i++) {
							org.add(orgCpy.get(i));
							rev.add(revCpy.get(i));
						}
						break;
					}
				}
				if(palindrome)
					break;
				k--;	
			}	
		}
		System.out.println(numCpy);
		System.out.println(digit);
		
	}
}
