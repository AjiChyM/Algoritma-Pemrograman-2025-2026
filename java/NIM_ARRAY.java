public class NIM_ARRAY {
    public static void main(String[] args) {
        String nim = "2510161";
        int[] digits = new int[nim.length()];

        // Pisahkan setiap karakter menjadi digit
        for (int i = 0; i < nim.length(); i++) {
            digits[i] = Character.getNumericValue(nim.charAt(i));
        }

        int total = 0, maks = digits[0], minim = digits[0];

        for (int d : digits) {
            total += d;
            if (d > maks) maks = d;
            if (d < minim) minim = d;
        }

        double rata = (double) total / digits.length;

        // Reverse array
        System.out.print("Reverse array = [ ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("]");

        // Output normal
        System.out.print("Array digit = [ ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("]");

        System.out.println("Total digit = " + total);
        System.out.println("Digit maksimum = " + maks);
        System.out.println("Digit minimum = " + minim);
        System.out.println("Rata-rata digit = " + rata);
    }
}
