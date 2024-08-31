import java.util.*;

public class bubble {

    public static void main(String[] args) {
        int arr[] = {50,60,89,56};

        for(int i=0 ; i < arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){

                if(arr[j] < arr[j+1]){

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
                }
                }
                for(int num :arr){

                    System.out.print(num  +" " + "is Bubble shorting order");
                }                
            }
        }
    
