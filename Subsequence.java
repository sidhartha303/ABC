package subsequence;

public class Subsequence {
	static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        int j = 0;
     
        for (int i=0; i<n&&j<m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
        }}
        return (j==m); 
    }
	
	
    public static void main (String[] args){
    	
    String str1 = "gksrek";
    String str2 = "geeksforgeeks";
    int m = str1.length();
    int n = str2.length();
    boolean res = isSubSequence(str1, str2, m, n);
    if(res)
        System.out.println("Yes");
    else
        System.out.println("No");
}}

