public class MergeSortApp {

    public static void main(String[] args) {
        int[] firstArray = {1, 6, 9};
        int[] secondArray = {2, 8, 9};
        mergeSort(firstArray, secondArray);
    }

    public static void mergeSort(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0;
        int index = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                resultArray[index] = firstArray[i];
                i++;
            } else {
                resultArray[index] = secondArray[j];
                j++;
            }
            index++;
        }
        while (i < firstArray.length) {
            resultArray[index] = firstArray[i];
            index++;
            i++;
        }
        while (j < secondArray.length) {
            resultArray[index] = secondArray[j];
            index++;
            j++;
        }
        for (int a = 0; a < resultArray.length; a++) {
            System.out.print(resultArray[a] + " ");
        }
    }
}
