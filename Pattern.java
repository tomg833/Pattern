//
//  Class author:  Tom Glick
//  Date created:  10/28/26
//  General description: Prints patterns of characters and numbers.
//

public class Pattern {

    //
    //  Pre-condition: None
    //  Post-condition: Prints lines/rows of stars.
    //
    public static void stars(int rows) {
        int line = 1;
        while (line <= rows) {
            int count = 1;
            while (count <= 2 * line - 1) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            line++;
        }
    }

    //
    //  Pre-condition: None
    //  Post-condition: Prints lines/rows of triangles
    //
    public static void triangle(int rows) {
        int line = 1;
        while (line <= rows) {
            int count = 1;
            do {
                System.out.print(line);
                count++;
            } while (count <= line);
            System.out.println();
            line++;
        }
    }

    //
    //  Pre-condition: None
    //  Post-condition: Prints the value and count
    //
    public static void odds(int start) {
        for (int value = start; value >= 1; value -= 2) {
            for (int count = 1; count <= value; count++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    //
    //  Pre-condition: None
    //  Post-condition: Prints a line pattern
    //
    public static void eo(int maxE) {
        // Growing half: lines 1 through maxE
        for (int line = 1; line <= maxE; line++) {
            printEoLine(line, maxE);
        }
        // Shrinking half: lines maxE - 1 down to 1
        for (int line = maxE - 1; line >= 1; line--) {
            printEoLine(line, maxE);
        }
    }

    //
    //  Pre-condition: line is between 1 and maxE.
    //  Post-condition: Prints Eo line and letters
    //
    public static void printEoLine(int line, int maxE) {
        String letter = "O";
        if ((maxE - line) % 2 == 0) {
            letter = "E";
        }
        for (int count = 1; count <= line; count++) {
            System.out.print(letter);
        }
        System.out.println();
    }

    //
    //  Pre-condition: None
    //  Post-condition: Prints rows/lines of pyramid
    //
    public static void pyramid(int rows) {
        for (int line = 1; line <= rows; line++) {
            for (int space = 1; space <= line - 1; space++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= 2 * (rows - line) + 1; count++) {
                System.out.print(line);
            }
            System.out.println();
        }
    }

    //
    //  Pre-condition: None
    //  Post-condition: Calls/prints the rows of each pattern
    //
    public static void main(String[] args) {
        System.out.println("stars(7):");
        stars(7);
        System.out.println("\nstars(1):");
        stars(1);
        System.out.println("\nstars(0): (nothing should print)");
        stars(0);

        System.out.println("\ntriangle(9):");
        triangle(9);
        System.out.println("\ntriangle(3):");
        triangle(3);

        System.out.println("\nodds(9):");
        odds(9);
        System.out.println("\nodds(5):");
        odds(5);

        System.out.println("\neo(6):");
        eo(6);
        System.out.println("\neo(5):");
        eo(5);
        System.out.println("\neo(1):");
        eo(1);

        System.out.println("\npyramid(5):");
        pyramid(5);
        System.out.println("\npyramid(3):");
        pyramid(3);
    }
}