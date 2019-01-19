public class Main {
    public static void main(String[] args) {
        int[] arr = { 28, 35, 1, 6, 3, 10, 34, 1, 19, 27 };
        int[] arrOne = arr.clone();
        int[] arrTwo = arr.clone();

        Sort sort = new Sort();
        sort.perform(arrOne, SortingAlgorithms.INSERTION_SORT);
        sort.perform(arrTwo, SortingAlgorithms.MERGE_SORT);
    }
}
