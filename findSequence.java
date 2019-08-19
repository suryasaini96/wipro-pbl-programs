import java.util.*;

public class findSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		 for(int i=0;i<input3.length;i++)
		 {
		     obj.put(input3[i],input2[i]);
		 }
		 Arrays.sort(input3);
		 int d=1;
		 String u="";
		 for(int i=0;i<input3.length-3;i++)
		 {
		  int a= input3[i];
		  int b= input3[i+1];
		            int c = input3[i+2];
		  if((a+1)==b && (b+1)==c)
		  {
		                  String j=obj.get(a);
		     String k=obj.get(b);
		     String l=obj.get(c);
		     u=u.concat(j).concat(":").concat(k).concat(":").concat(l);
		     d=0;
		     break;
		  }
		 }
		  if(d==1)
		  return "NONE";
		  else
		  return u;
	}

}
