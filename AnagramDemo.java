import java.util.Arrays;

class AnagramDemo 
{
	static boolean checkAnagram(String s1, String s2) 
	{
        	// Remove spaces and convert to lowercase
        	s1 = s1.replaceAll("\\s", "").toLowerCase();
        	s2 = s2.replaceAll("\\s", "").toLowerCase();

        	// If lengths differ, not an anagram
        	if (s1.length() != s2.length())
            		return false;

        	// Convert to char arrays
        	char[] c1 = s1.toCharArray();
        	char[] c2 = s2.toCharArray();

        	// Sort arrays
        	Arrays.sort(c1);
        	Arrays.sort(c2);

        	// Compare sorted arrays
        	return Arrays.equals(c1, c2);
	}

    	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        	// Take input from user
        	System.out.print("Enter first string: ");
        	String str1 = sc.nextLine();

        	System.out.print("Enter second string: ");
        	String str2 = sc.nextLine();

        	if (checkAnagram(str1, str2))
		{
            		System.out.println("Anagram");
        	} 
		else 
		{
            		System.out.println("Not Anagram");
        	}
    	}
}