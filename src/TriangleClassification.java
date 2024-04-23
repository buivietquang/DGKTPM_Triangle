import java.util.Scanner;

public class TriangleClassification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the sides of a triangle (exit to quit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String[] parts = input.split(" ");
            String result = processInput(parts);
            System.out.println(result);
        }
        scanner.close();
    }

    public static String processInput(String[] parts) {
        if (parts.length != 3) {
            return "Invalid input: Please enter exactly three values.";
        }
        int a, b, c;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return "Invalid input: Please enter valid integers.";
        }
        return classifyTriangle(a, b, c);
    }

    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "InvalidInput";
        }

        // Ensure a <= b <= c
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a + b <= c) {
            return "NotATriangle - Khong phai la tam giac";
        } else if (a == b && b == c) {
            return "Equilateral - Tam giac deu";
        } else if (a == b || b == c || a == c) {
            return "Isosceles - Tam giac can";
        } else if (a * a + b * b == c * c) {
            return "Right - Tam giac vuong";
        } else {
            return "Scalene - Tam giac thuong";
        }
    }
}
