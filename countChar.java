
public class countChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = args[0];
		String b = args[1];
		StringBuffer chkA = new StringBuffer();
		StringBuffer chkB = new StringBuffer();
		chkA.append(a);
		chkB.append(b);
		
		for(int i=0; i<chkA.length(); i++) {
			for(int j=0; j<chkB.length(); j++) {
				if (chkA.charAt(i)==chkB.charAt(j)) {
					chkB.deleteCharAt(j);
				}
			}
		}
		if (chkB.length()==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
			
		
	}

}
