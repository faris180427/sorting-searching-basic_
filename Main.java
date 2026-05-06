import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyAlgorithms algo = new MyAlgorithms();
        
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Data Awal: " + Arrays.toString(data));

        // Proses Sorting
        algo.bubbleSort(data);
        System.out.println("Setelah Bubble Sort: " + Arrays.toString(data));

        // Proses Searching
        int target = 22;
        int hasil = algo.binarySearch(data, target);

        if (hasil != -1) {
            System.out.println("Angka " + target + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }
    }
}
