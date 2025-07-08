package Day_9;

public class HCF {

    // Function to calculate HCF using Euclidean algorithm
    public static int calculateHcf(int A, int B) {
        // Make sure A >= B
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    // Wrapper function
    public int hcf(int A, int B) {
        return calculateHcf(A, B);
    }
}

