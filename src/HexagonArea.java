import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the side of the hexagon
        System.out.print("Enter the side of the hexagon: ");
        double s = input.nextDouble();

        // Compute the area using the given formula
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display the result
        System.out.println("The area of the hexagon is: " + area);

        // Close the scanner
        input.close();
    }
}
