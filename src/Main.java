public class Main {
    public static void main(String[] args) {
        // Test the getRatio method (I used the initial array from the problem statement)
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        System.out.println(getRatio(a));
    }

    public static double getRatio(int[] arr) {
        // Initializes the largest and smallest numbers
        int lrg1 = Integer.MIN_VALUE;
        int lrg2 = Integer.MIN_VALUE;
        int sml1 = Integer.MAX_VALUE;
        int sml2 = Integer.MAX_VALUE;

        // Iterating through the array and finding the largest and smallest numbers
        for (int num : arr) {
            // Updating the largest numbers
            if (num > lrg1) {
                lrg2 = lrg1;
                lrg1 = num;
            } else if (num > lrg2) {
                lrg2 = num;
            }

            // Updating the smallest numbers
            if (num < sml1) {
                sml2 = sml1;
                sml1 = num;
            } else if (num < sml2) {
                sml2 = num;
            }
        }

        // Calculate the ratio and return the result
        return (double) (lrg1 + lrg2) / (sml1 + sml2);
    }
}
/* This algorithm initializes four variables: 2 to keep track of the largest and 2 to keep track of the smallest numbers.
Then it iterates through the array once, updating the largest and smallest numbers. Then, it returns the ratio.

The time complexity is O(n), where n is the length of the input array.
We only need to perform a single pass through the array to find the largest and smallest numbers.
And there are no additional loops inside the main loop. Which means that the time complexity is O(n),
making it a linear algorithm.
* */