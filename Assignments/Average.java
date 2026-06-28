package Assignments;
class Average{

    void avg(int a, int b) {
        System.out.println("Average = " + (a + b) / 2.0);
    }

    void avg(int a, int b, int c) {
        System.out.println("Average = " + (a + b + c) / 3.0);
    }

    public static void main(String args[]) {
        Average obj = new Average();

        obj.avg(10, 20);
        obj.avg(10, 20, 30);
    }
}