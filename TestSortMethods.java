public class TestSortMethods {

    public static void main(String[] args) {

        // Selection Sort
        int[] randomArray = SortMethods.randomIntArray(2000, 10000);
        int comparisons = SortMethods.selectionSortComparisons(randomArray);
        System.out.println("Selection Sort comparisons 2000: " + comparisons);

        randomArray = SortMethods.randomIntArray(4000, 10000);
        comparisons = SortMethods.selectionSortComparisons(randomArray);
        System.out.println("Selection Sort comparisons 4000: " + comparisons);

        randomArray = SortMethods.randomIntArray(6000, 10000);
        comparisons = SortMethods.selectionSortComparisons(randomArray);
        System.out.println("Selection Sort comparisons 6000: " + comparisons);

        randomArray = SortMethods.randomIntArray(8000, 10000);
        comparisons = SortMethods.selectionSortComparisons(randomArray);
        System.out.println("Selection Sort comparisons 8000: " + comparisons);

        randomArray = SortMethods.randomIntArray(10000, 10000);
        comparisons = SortMethods.selectionSortComparisons(randomArray);
        System.out.println("Selection Sort comparisons 10000: " + comparisons);

        // Bubble Sort
        randomArray = SortMethods.randomIntArray(2000, 10000);
        comparisons = SortMethods.bubbleSortandComparisons(randomArray);
        System.out.println("Bubble Sort comparisons 2000: " + comparisons);

        randomArray = SortMethods.randomIntArray(4000, 10000);
        comparisons = SortMethods.bubbleSortandComparisons(randomArray);
        System.out.println("Bubble Sort comparisons 4000: " + comparisons);

        randomArray = SortMethods.randomIntArray(6000, 10000);
        comparisons = SortMethods.bubbleSortandComparisons(randomArray);
        System.out.println("Bubble Sort comparisons 6000: " + comparisons);

        randomArray = SortMethods.randomIntArray(8000, 10000);
        comparisons = SortMethods.bubbleSortandComparisons(randomArray);
        System.out.println("Bubble Sort comparisons 8000: " + comparisons);

        randomArray = SortMethods.randomIntArray(10000, 10000);
        comparisons = SortMethods.bubbleSortandComparisons(randomArray);
        System.out.println("Bubble Sort comparisons 10000: " + comparisons);

        // Merge Sort 
        randomArray = SortMethods.randomIntArray(2000, 10000);
        comparisons = SortMethods.mergeSortComparisons(randomArray);
        System.out.println("Merge Sort comparisons 2000: " + comparisons);

        randomArray = SortMethods.randomIntArray(4000, 10000);
        comparisons = SortMethods.mergeSortComparisons(randomArray);
        System.out.println("Merge Sort comparisons 4000: " + comparisons);

        randomArray = SortMethods.randomIntArray(6000, 10000);
        comparisons = SortMethods.mergeSortComparisons(randomArray);
        System.out.println("Merge Sort comparisons 6000: " + comparisons);

        randomArray = SortMethods.randomIntArray(8000, 10000);
        comparisons = SortMethods.mergeSortComparisons(randomArray);
        System.out.println("Merge Sort comparisons 8000: " + comparisons);

        randomArray = SortMethods.randomIntArray(10000, 10000);
        comparisons = SortMethods.mergeSortComparisons(randomArray);
        System.out.println("Merge Sort comparisons 10000: " + comparisons);
    }
}
