import java.util.*;

public class Array {

    
    public static void main(String[] args) {
        String[] subjects = {"Maths", "Science", "English"}; // Array for subject names
        int marks[]= new int[3];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 99;

        for(int i =0 ; i<3; i++){
            System.out.println(marks[i]+ " " +subjects[i]);
        }



    }
}