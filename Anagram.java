

import java.util.Arrays;

public class Anagram {
		
		static void isAnagram(String s1,String s2) {
		boolean status;
		char c1[],c2[];
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		
		if(s1.length()!=s2.length())
			status=false;
		
		else {
		
			 c1=s1.toLowerCase().toCharArray();
			 c2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status=Arrays.equals(c1, c2);
		}
			if(status)
				System.out.println(s1+" and "+s2+" are Anagrams");
			else
				System.out.println(s1+" and "+s2+" are Not anagrams");
		}
public static void main(String[] args) {
	isAnagram("Mother In Law", "Hitler Woman");
	 
    isAnagram("keEp", "peeK");

    isAnagram("SiLeNt CAT", "LisTen AcT");

    isAnagram("Debit Card", "Bad Credit");

    isAnagram("School MASTER", "The ClassROOM");

    isAnagram("DORMITORY", "Dirty Room");

    isAnagram("ASTRONOMERS", "NO MORE STARS");

    isAnagram("Toss", "Shot");

    isAnagram("joy", "enjoy");

}}	
