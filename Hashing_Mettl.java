import java.util.Arrays;

public class Hashing_Mettl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,4,8,25,38,23,19,49,21,44}; 
		int hashOut[] = new int[10];
		int j,r;
		int newNum;
		boolean notFilled = false;
		/* Let N be the integer to be inserted
		 * 
		 * Compute location j where N is to be inserted as j = N mod 10
		 * if j is empty then insert, otherwise Recompute as
		 * 
		 * Recompute
		 * 
		 * 1. remove rightmost digit of N
		 * 2. now j = (new value of N) mod 10
		 * 3. if removed digit is odd then move j locations forward
		 *    from current location.
		 * 4. Else if removed digit is even then move j locations backwards
		 *    from current location. (assume 0 as even).
		 *    All this will wrap around at either end of table.
		 * 5. Keep doing this till free location is found or all digits 
		 * 	  of N are removed.
		 * 6. If all digits are removed and still no empty place,
		 * 	  keep moving forward (with wrapping) till finding a free 
		 * 	  location then insert there.
		 */
		 //hash_and_store(arr);
		for(int n=0; n<10;n++) {
			j = arr[n]%10; //current location
			if(hashOut[j] == 0) { //if j is empty
				hashOut[j] = arr[n]; // insert the N element at j
			}
			else { // recompute if full
				newNum = arr[n];
				while(newNum>=0) {
					
					if(hashOut[j] == 0) { // if j is free then insert
						hashOut[j] = arr[n]; 
						break; //then break out of loop
					}
					else {
						j = newNum%10; //removed right digit = 1 (curr loc)
						newNum/=10; // continue dividing the number = 2
						r = newNum%10; // r = 2 (move)
						// current location becomes j and move r locations
						if(j%2 == 1) {
							j = j + r; //move right
							if(j>9) { //wrap around
								j = j - 10;
							}
						}
						else if (j%2 == 0) {
							j = j - r; //move left
							if(j<0) { //wrap around
								j = 10 + j;
							}
						}
					}
					
					if(newNum == 0) { //if number becomes 0
						for(int i=j+1; i<10; i++) { //loop till end
							if (hashOut[i] == 0) {  // if next loc is free
								hashOut[i] = arr[n]; // fill and break
								notFilled = false;
								break;
							}
							else
								notFilled = true;
						}
						if(notFilled) {
							for(int i=0; i<j; i++) { //loop from start(wrapping)
								if (hashOut[i] == 0) {  // if next loc is free
									hashOut[i] = arr[n]; // fill and break
									notFilled = false;
									break;
								}
								else
									notFilled = true;
							}
							notFilled = false;
						}
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(hashOut));
		
		
	}

}
