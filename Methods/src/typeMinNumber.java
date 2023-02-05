public class typeMinNumber {   // name of the class
    //1. Write a Java method to ﬁnd the smallest number among three numbers
    public double methodMinNumber(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else return c;
    }
}