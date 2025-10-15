class pattern9 {
    static void diamondPattern(int N) {
        // Top pyramid
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

        // Bottom inverted pyramid
        for (int i = 1; i < N; i++) {  // start from 1 to skip middle row
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        int N = 5;
        diamondPattern(N);
    }
}
