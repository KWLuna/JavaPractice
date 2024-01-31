
public class StringManager {

	public String ReverseString(String s)
	{
		String newString = "";
		char ch;
		
		for (int i = 0; i< s.length(); ++i)
	    {
	        ch = s.charAt(i); //extracts each character
	        newString = ch + newString; //adds each character in front of the existing string
	    }
		return newString;
	}
	public int[] CountCharacters(String s)
	{
		int[] count = {0, 0, 0, 0}; // 0 - Letter, 1 - Space, 2 - Number, 3 - Other
		
		for(int i = 0; i < s.length(); ++i)
		{
			if(s.charAt(i) >= 66 && s.charAt(i) <= 90 || s.charAt(i) >= 97 && s.charAt(i) <= 122)
				count[0]++;
			else if (s.charAt(i) == ' ')
				count[1]++;
			else if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
				count[2]++;
			else
				count[3]++;
		}
		return count;
	}
	public int CharacterValue(char c)
	{
		return (int)c;
	}
	public String IsPalindrome(String s)
	{
		String newString = ReverseString(s);
		if (newString.contentEquals(s))
			return s + " is Palindrome";
		
		return s + " is not Palindrome";
	}
}
