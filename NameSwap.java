public class NameSwap {
    public static void main(String[] args) {
        String fullName = "Awadhesh Gupta";
        
        // Split the full name into first and last name
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            
            // Swap and print
            String swappedName = lastName + " " + firstName;
            System.out.println(swappedName);
        } else {
            System.out.println("Input name format is incorrect.");
        }
    }
}
