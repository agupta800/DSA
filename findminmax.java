public class findminmax {
    public static void main(String[] args) {
        int[] array={2,8,10};
        findminmax(array);
    }
    public static void findminmax(int[] array){

        if(array==null || array.length==0){

            System.out.println("Enter input is invalid");
        }
            int min = array[0], max=array[0];
        for(int i= 1 ; i<=array.length-1; i++){

            if (array[i] < min){
                min= array[i];
            }
            if (array[i]> max){
                max= array[i];
            }


        }
        System.out.println("Minimum number is" +" "+ min);
        System.out.println("Maximum Number"+"" +max);

    }
    // public static void main(String[] args) {
    //     int[] array={2,8,10};
    //     findminmax(array);
    // }
}
