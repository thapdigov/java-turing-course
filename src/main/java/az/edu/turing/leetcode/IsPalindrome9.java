package az.edu.turing.leetcode;

public class IsPalindrome9 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1245521));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;
        while (0 < number) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }
        return originalNumber == reverseNumber;
    }
}
