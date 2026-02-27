// Java program to check whether a
// string is a Palindrome using recursion
public class Palindrome
{
    // Recursive method to check 
    // if a string is a palindrome
    public static boolean isPalindrome(int i, int j, String s) {
      
        // If pointers have crossed, 
        // it's a palindrome
        if (i >= j) {
            return true;
        }

        // If characters at i and j are not the same, 
        // return false
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        // Recursive call for the 
        //next pair of pointers
        return isPalindrome(i + 1, j - 1, s);
    }

    // Overloaded method to simplify the call
    public static boolean isPalindrome(String s) {
        return isPalindrome(0, s.length() - 1, s);
    }

    public static void main(String[] args) {
      
        // Input strings
        String s1 = "geeks";
        String s2 = "Racecar";

        // Convert strings to lowercase for 
        // case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Check and print results for s1
        if (isPalindrome(s1)) {
            System.out.println("\"" + s1 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s1 + "\" is not a palindrome.");
        }

        // Check and print results for s2
        if (isPalindrome(s2)) {
            System.out.println("\"" + s2 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s2 + "\" is not a palindrome.");
        }
    }
}