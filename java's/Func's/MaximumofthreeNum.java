
public class MaximumofthreeNum {
    static int max3(int a, int b, int c){
        if(a>=b && a>=c)
            return a;
        else if(b>=c)
            return b;
        else
            return c;
    }

    public static void main(String[] args){
        System.out.println(max3(10, 24, 3));
    }
}
