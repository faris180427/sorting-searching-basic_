public class MyAlgorithms {

    // 1. BUBBLE SORT (Dengan Optimasi Flag)
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar posisi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // OPTIMASI: Jika tidak ada pertukaran, artinya sudah urut
            if (!swapped) break;
        }
    }

    // 2. BINARY SEARCH (Dengan Optimasi Mid-point)
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // OPTIMASI: Mencegah Integer Overflow
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Ketemu!
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Tidak ditemukan
    }
}
