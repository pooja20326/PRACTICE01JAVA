class pattern8 {
    static void invertedPyramid(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");
            }
             for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        invertedPyramid(N);
    }
}
