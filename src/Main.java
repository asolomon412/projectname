import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont = "y";

        System.out.println("Welcome to the GC Room Calculator!");
        System.out.println();

        while (cont.equalsIgnoreCase("y")) {

            System.out.print("Please enter the length of the room: ");
            double length = Double.parseDouble(scan.nextLine());

            System.out.print("Please enter the width of the room: ");
            double width = Double.parseDouble(scan.nextLine());

            // this portion is for the extended challenge
            System.out.println();
            System.out.print("Would you like to calculate the volume of the room? y/n ");
            String calcVolume = scan.nextLine();

            if (calcVolume.equalsIgnoreCase("y")) {
                System.out.print("Please enter the height of the room: ");

                double height = Double.parseDouble(scan.nextLine());
                double volume = length * width * height;
                System.out.println();
                System.out.println("Volume: " + volume);
            }

            System.out.println("Area: " + (width * length));
            System.out.println("Perimeter: " + 2*(length + width));

            System.out.println();
            System.out.println("Would you like to continue? y/n ");
            cont = scan.nextLine();
        }
        scan.close();
        System.out.println("Goodbye!");
    }
}
