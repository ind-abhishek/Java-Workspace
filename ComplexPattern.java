public class ComplexPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i+j == n && j < n-1/2 && i < n-1/2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}