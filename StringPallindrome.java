package algorithm;

public class StringPallindrome {

	public static void main(String[] args) {

		String s="redivider noon malayalam";
		StringBuffer s2=new StringBuffer();
		String[] s1=s.split(" ");
		int c=0;
		for(int i=0;i<s1.length;i++) {
			char[] ch=s1[i].toCharArray();
			int k=0;
			char[] ch2=new char[ch.length];
			for(int j=ch.length-1;j>=0;j--) {
				ch2[k]=ch[j];
				k++;
			}
			
			String s3=String.valueOf(ch2);
			if(s3.equals(s1[i]))
				c++;
		}	
		System.out.println(c);
		}
}
