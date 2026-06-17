public class ReverseNumber {
    static int reverse(int n){
        int rev=0;

        while(n!=0){
            int num = n%10;
            rev = rev*10+num;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args){
        System.out.println(reverse(123546));
    }
}
