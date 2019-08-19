
public class EncodingThreeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {args[0], args[1], args[2]};
		String[] front = new String[3];
		String[] middle = new String[3];
		String[] end = new String[3];
		String output1,output2,tempoutput3 = new String();
		StringBuffer output3 = new StringBuffer();

		int len;

		//algo string/3 + remainder;

		for (int i=0; i<3; i++) {
			len = strings[i].length();
			if(len%3 == 1){  // John - middle will get 1 more i.e. front end will have 1
				front[i] = strings[i].substring(0,len/3); // 'J' 'oh' 'n'
				middle[i] = strings[i].substring(len/3, len/3 + 1 + 1); // as end is exclusive
				end[i]  = strings[i].substring(len/3 + 1 + 1 , len); // as end is exclusive

			}
			else if(len%3 == 2){ // Johny - front n end will get 1 extra
				front[i] = strings[i].substring(0,len/3 + 1); //Jo h ny
				middle[i] = strings[i].substring(len/3 + 1, len/3 + 1 + 1); // as end is exclusive
				end[i]  = strings[i].substring(len/3 + 1 + 1, len); // as end is exclusive

			}
			else if(len%3 == 0){ // Janardhan - all are equal
				front[i] = strings[i].substring(0,len/3);// Jan ard han
				middle[i] = strings[i].substring(len/3, len/3 + 3); // as end is exclusive
				end[i]  = strings[i].substring(len/3 + 3, len); // as end is exclusive

			}
		}
		
		output1 = front[0] + front[1] + front[2];
		output2 = middle[0] + middle[1] + middle[2];
		tempoutput3 = end[0] + end[1] + end[2];
		
		
		for (int i=0; i<3; i++) {
			System.out.print(front[i] + " " + middle[i] + " " + end[i]);
			System.out.println();
		}
		
		for(int i=0; i<tempoutput3.length(); i++) {
			if(Character.isLowerCase(tempoutput3.charAt(i))) {
				output3.append(Character.toUpperCase(tempoutput3.charAt(i)));
			}
			else if (Character.isUpperCase(tempoutput3.charAt(i))) {
				output3.append(Character.toLowerCase(tempoutput3.charAt(i)));
			}
			else {
				output3.append(tempoutput3.charAt(i));
			}
		}
		System.out.println();
		System.out.println("Output1: " + output1 + " Output2: " + output2 + " Output1: " + output3 );
		
	}

}
