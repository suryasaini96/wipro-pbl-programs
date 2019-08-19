
public class FindStringCode {
	public enum alpha{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
		public int getVal() {
			return ordinal()+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = args[0];
		String words[] = input1.split(" ");
		int len;
		
		for(String i:words){
			len = i.length();
			if(len%2 == 0) { //if its symmetric word
				for(int j=0; j<len/2;j++) {
					int sum=0;
					sum+= alpha.valueOf(Character.toString(i.charAt(j))).getVal() + alpha.valueOf(Character.toString(i.charAt(len/2+1))).getVal();
					
				}
			}
			
			
		}
	}

}
