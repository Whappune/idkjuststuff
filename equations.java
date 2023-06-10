import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = b = c = 1;
        System.out.println("Insert Max: ");
        int max = scanner.nextInt();

        while (a < max) {
            while (b < max/2) {
                while (c < max/2) {
                    if (doEquation(a, b, c) == 4) {
                        //i was looking for when the equation == 4 buyt you can change that :)
                        System.out.print(a + " " + b + " " + c + ": ");
                        System.out.println(doEquation(a, b, c));
                    }
                    c++;
                }
                c = 0;
                b++;
            }
            b = 0;
            if(a% (int)(max/25) == 0) {
                System.out.print(".");
            }
            a++;
        }
        System.out.println("done :)");
    }
    public static double doEquation(double a, double b, double c) {
        return (a/(b+c) + b/(a+c) + c/(a+b));
        //do equation ^^
    }

}
