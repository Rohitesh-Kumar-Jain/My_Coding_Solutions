import java.util.Scanner;

class Solution {

    static Scanner scanner = new Scanner(System.in);

    static double func(double x) {
        return x*x - 3*x -4;
    }

    static void bisection() {
        double a, b;
        boolean invalidAB;
        do {
            invalidAB = false;
            System.out.println("Assume A and B");
            a = scanner.nextDouble();
            b = scanner.nextDouble();

            if (func(a) * func(b) >= 0)
            {
                System.out.println("You have not assumed"
                        + " right a and b");
                invalidAB = true;
            }
        }
        while (invalidAB);

        double c = a;
        while ((b-a) >= 0.01)
        {
            c = (a+b)/2;
            if (func(c) == 0.0)
                break;
            else if (func(c)*func(a) < 0)
                b = c;
            else
                a = c;
        }
        System.out.printf("The value of root is : %.4f",c);
    }

    public static void main(String[] args)
    {
        bisection();
    }
}
