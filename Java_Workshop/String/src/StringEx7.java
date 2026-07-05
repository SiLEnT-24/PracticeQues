public class StringEx7 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Harsh Barnawa");

        System.out.println(s);
        s.append("Universal");
        System.out.println(s);

        s.append(12);
        System.out.println(s);

        s.insert(2, "incapp");
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        s.replace(2, 8, "rr");
        System.out.println(s);

        s.delete(2, 8);
        System.out.println(s);

        String x = "sukesh";
        StringBuilder y = new StringBuilder(x);

        String z = y.toString();
    }
}