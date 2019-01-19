import java.util.Arrays;

public class Sort {
    public void perform(int[] arr, SortingAlgorithms sortingAlgorithm) {
        switch (sortingAlgorithm) {
            case MERGE_SORT: {
                System.out.println("Performing MERGE_SORT: ");
                System.out.println("Initial: " + Arrays.toString(arr));

                mergeSort(arr);

                System.out.println("Done: " + Arrays.toString(arr));
                System.out.println();
                break;
            }
            case INSERTION_SORT: {
                System.out.println("Performing INSERTION_SORT: ");
                System.out.println("Initial: " + Arrays.toString(arr));

                insertionSort(arr);

                System.out.println("Done: " + Arrays.toString(arr));
                System.out.println();
                break;
            }
        }
    }

    // Best: O(n log(n))
    // Worst: omega(n log(n))
    private void mergeSort(int[] arr) {
        // Terminating condition for the recursion.
        if (arr.length > 1) {
           int mid = arr.length/2;
           // Divides the input array into left and right halves.
           int[] left = Arrays.copyOfRange(arr, 0, mid);
           int[] right = Arrays.copyOfRange(arr, mid, arr.length);

           System.out.println("Left: " + Arrays.toString(left));
           System.out.println("Right: " + Arrays.toString(right));

           mergeSort(left);
           mergeSort(right);

           // Indexes for the three arrays.
           // i represents the index for the left array.
           // j represents the index for the right array.
           // k represents the index for the combined array.
           int i = 0, j = 0, k = 0;

           // Compares the left and right arrays.
           // It will compare two elements and insert the smallest element to the combined array.
           // It will then increase the index of either the left or right array of the one it inserted.
           while (i < left.length && j < right.length) {
               if (left[i] < right[j]) {
                   arr[k] = left[i];
                   i++;
               } else {
                   arr[k] = right[j];
                   j++;
               }
               k++;
           }

           // These two while loops will ensure that both the left and right arrays will be exhausted, thus making sure that all elements go into the combined array.
           while (i < left.length) {
               arr[k] = left[i];
               i++;
               k++;
           }
           while (j < right.length) {
               arr[k] = right[j];
               j++;
               k++;
           }

           System.out.println("Merging: " + Arrays.toString(arr));
        }
    }

    private void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            // Saves the current element temporarily
            int key = arr[i];
            int j = i - 1;

            // When the element before index i is smaller, it will shift all of the elements to the right and insert the number in the sorted section.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
