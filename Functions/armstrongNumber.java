public class armstrongNumber {
    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        int num = String.valueOf(n).length();

        while(temp!=0){
            int rem = temp%10;
            sum += Math.pow(rem, num);
            temp = temp/10;
        }
        return sum == n;
    }
    public static void main(String[] args){
        System.out.println(isArmstrong(152));
    }
}
