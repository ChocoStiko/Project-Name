//Programmed by: Eljhun Angcanan BIT-23
import java.util.Scanner;
import java.util.Stack;


public class Palindrome {
    public static boolean isPalindrome(String word) {

        Stack <Character> stack = new Stack <Character>();
        String toLowerCase = word.toLowerCase();

        for (int i = 0; i < toLowerCase.length(); i++){
            stack.push(toLowerCase.charAt(i));

        }

        for (int i = 0; i < toLowerCase.length(); i++){
            if (toLowerCase.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        String word;

        Scanner scan = new Scanner(System.in);


        System.out.println("Input a word: ");
        word = scan.nextLine();

        if (isPalindrome(word)){
            System.out.println("The word " + word +" is a palindrome");
        }
        else{
            System.out.println("The word " + word +" is not a palindrome");
        }



    }
}
