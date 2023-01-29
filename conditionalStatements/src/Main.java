
import java.util.Scanner;  // Import the Scanner class
        import java.io.Console;
        import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String angle1 = in.nextLine();
        double a1 = Double.parseDouble(angle1);

        String angle2 = in.nextLine();
        double a2 = Double.parseDouble(angle2);

        String angle3 = in.nextLine();
        double a3 = Double.parseDouble(angle3);

        if (a1 + a2 + a3 == 180) {
            System.out.println("The triangle can be built based on the angle values");
            if (a1 == a2 && a1 == a3) {
                System.out.println("The triangle is equilateral");  //равностранен
            } else if (a1 == a2 || a1 == a3 || a2 == a3) {
                System.out.println("The triangle is isosceles");
            } else if (a1 == 90 || a2 == 90 || a3 == 90) {
                System.out.println("The triangle is multifaceted and right-angled");
            } else if (a1 > 90 || a2 > 90 || a3 > 90) {
                System.out.println("The triangle is multifaceted and obtuse");
            } else  {  // (a1 < 90 || a2 < 90 || a3 < 90)
                System.out.println("The triangle is multifaceted and acute");
            }
        }
        else {
            System.out.println("The triangle cannot be built based on the angle values");
        }
    }
}
