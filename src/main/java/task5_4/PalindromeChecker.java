package task5_4;

public class PalindromeChecker {
    public boolean isPalindrome(String str){
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }
}
