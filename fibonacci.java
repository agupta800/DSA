public class fibonacci {

    static int count =2 ;
    public static void fibonacci(int a , int b){
        if(count <=5){
            int newFibo = a + b;
            System.out.println(newFibo);
            b = a;
            a = newFibo;
            count +=1 ;
            fibonacci(a, b);
        }
        else{            
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibonacci(1, 0);
    }
}
