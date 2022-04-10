

public class App {
    public static void main(String[] args) {

        System.out.println("Therefore: " + isPalindrome2("hello"));
        System.out.println("Therefore: " +  isPalindrome2("racecar"));
        System.out.println("Therefore: " + isPalindrome1("racecar"));

        System.out.println("\n");

        System.out.println("Therefore: " + isPalindrome3("hello" ));
        System.out.println("Therefore: " + isPalindrome4("hello"));
        System.out.println("Therefore: " +  isPalindrome3("racecar"));
        System.out.println("Therefore: " + isPalindrome4("racecar"));
        
        System.out.println("\n");

        System.out.println(isNumPalindrome(122321));
        System.out.println(isNumPalindrome(31411413));




    }

    /**
     * (NOT AS SIMPLE IMPLEMENTATION)
     * @param original
     * @return a boolean based on whether passed string is a palindrome
     * Goes in FORWARD direction
     */
    public static boolean isPalindrome1(String original) {

        for (int i = 0; i < original.length() / 2; i++) {

            System.out.println(original.charAt(i) + "<>" + original.charAt(original.length() - 1 - i));
            if (original.charAt(i) != original.charAt(original.length() - 1 - i)) {
                return false;
            }

        }

        return true;

    }

    /**
     * (NOT AS SIMPLE IMPLEMENTATION)
     * @param original
     * @return a boolean based on whether passed string is a palindrome
     * Goes in REVERSE direction
     */
    public static boolean isPalindrome2(String original) {

        for (int i = original.length() - 1; i > original.length() / 2; i--) {

            System.out.println(original.charAt(i) + "<>" + original.charAt(original.length() - 1 - i));
            if (original.charAt(i) != original.charAt(original.length() - 1 - i)) {  
                return false;
            }

        }
        return true;
    }

        /**
     * (SIMPLER IMPLEMENTATION)
     * @param original
     * @return a boolean based on whether passed string is a palindrome
     * Goes in FORWARD direction
     */
    public static boolean isPalindrome3(String original){

        String reverse = "";

        for (int i = 0; i < original.length(); i++){

            reverse = original.charAt(i) +  reverse ;

        }

        System.out.println("Original String: " + original + "\n" + "Reversed String: " + reverse);

        if (reverse.equals(original)){
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * (SIMPLER IMPLEMENTATION)
     * @param original
     * @return a boolean based on whether passed string is a palindrome
     * Goes in REVERSE direction
     */
    public static boolean isPalindrome4(String original){

        String reverse = "";

        for (int i = original.length()-1; i >= 0; i --){

            reverse = reverse + original.charAt(i) ;

        }

        System.out.println("Original String: " + original + "\n" + "Reversed String: " + reverse);

        if (reverse.equals(original)){
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * 
     * @param original
     * @return a boolean based on whether passed number is a palindrome
     */
    public static boolean isNumPalindrome(int original){

        int reverse = 0;
        int o = original;

        while (original!=0){

            int digit = original % 10; //return last digit

            original = original / 10; //rip off last digit

            reverse = reverse * 10 + digit; //create space for new digit and add digit

        }

        System.out.printf("Original number: %d\nReversed number: %d\nTherefore: ", o, reverse);

        if (reverse == o){
            return true;
        }
        else {
            return false;
        }


    }

}
