
public class printDub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Javaee";
		StringBuffer str = new StringBuffer();
		StringBuffer out = new StringBuffer();
		str.append(a);
		for(int i=0 ;i<str.length(); i++) {
			for(int j=i+1; j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					out.append(str.charAt(i));
					str.deleteCharAt(j);
					str.deleteCharAt(i);
				}
			}	
		}
		if(out.length()>0) {
			System.out.println(out);
		}
		else {
			System.out.println("None");
		}

	}

}
