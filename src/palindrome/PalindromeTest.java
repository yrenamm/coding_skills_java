package palindrome;

/**
 * Check if a String is palindrome or not.
 **/
public class PalindromeTest {

   
    public static void main(String args[]) {
        System.out.println("Is 12344321 palindrom?: " 
                             + isPalindromString("12344321"));
        System.out.println("Is asdf palindrom?: " 
                             + isPalindromString("asdf"));
       
        System.out.println("Is aaaa palindrom?: "
                             + isPalindromString("aaaa"));
        System.out.println("Is sssss palindrom?: " 
                             + isPalindromString("sssss"));
     
       
    }

    /**
     * return true if text is palindrome, otherwise false
     **/
    public static boolean isPalindromString(String text){
       String reverse = reverse(text);
       if(text.equals(reverse)){
           return true;
       }
     
       return false;
    }
   
    /**
     * Reverse String using recursion
     **/
    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
       
        return input.charAt(input.length()- 1) 
                   + reverse(input.substring(0, input.length() - 1));
    }
   
}

//Is 12344321 palindrom?: true
//Is asdf palindrom?: false
//Is aaaa palindrom?: true
//Is sssss palindrom?: true

