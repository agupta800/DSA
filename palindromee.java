import java.util.*;
public class palindromee {

    public static void main(String[] args) {
        
        String original , reverrse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Palindrome num");

        original = sc.nextLine();
        int length = original.length();

        for(int i = length-1; i>=0 ; i--)

        reverrse= reverrse + original.charAt(i);

        if(original.equals(reverrse))
        System.out.println("is palindrome");
        else

            System.out.println("not plaindrome");
        


    }
    
}
