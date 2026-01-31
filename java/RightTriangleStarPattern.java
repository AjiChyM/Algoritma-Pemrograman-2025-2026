public class RightTriangleStarPattern {
    // Function to demonstrate printing pattern
    public static void StarRightTriangle(int n) {
        int a, b;
        // outer loop to handle number of rows
        for (a = 0; a < n; a++) {
            // inner loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }
            // end-line
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        int k = 4;
        StarRightTriangle(k);
    }
}