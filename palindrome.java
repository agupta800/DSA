import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        String original , reverse = "";

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the palindrome no");

        original = sc.nextLine();
        int length = original.length();

        for(int i = length-1 ; i>=0 ;i--)

        reverse = reverse + original.charAt(i);

        if(original.equals(reverse))

        System.out.println("Enter palindrome is Palindrome");
        else

System.out.println("not pandrome");

    }
}