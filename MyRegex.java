public class MyRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip = "10.26.33.33";
		String notip = "This.is.not.an.ip";
		boolean flag = false;
		String[] words = ip.split("\\.");	
		//System.out.println(words.length);
		if(words.length==4) {
			// the IP has 4 blocks >> true
			for(String i:words) {
				if (i.matches("\\d+")) {
					if( Integer.parseInt(i)>=0 && Integer.parseInt(i)<=255 ) {
						flag = true;
					}
					else {
						flag = false;
					}
				}
				else {
					flag = false;
				}	
			}
		}
		if (flag == true) {
			System.out.println("true");
		}
		else if(words.length!=4 || flag == false) {
			// the IP doesn't have 4 blocks >> or num is not b/w 0-255
			System.out.println("false");
		}
	}

}
