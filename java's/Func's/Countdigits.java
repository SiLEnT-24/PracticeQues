
public class Countdigits {
    static int countDigits(int m){
        int count=0;

        while(m!=0){
            count++;
            m = m/10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countDigits(134536));
    }
}
