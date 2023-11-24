package finalexam;

import finalexam.defaultsorting.BubbleSort;
import finalexam.defaultsorting.InsertionSort;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100);

        /*
        BubbleSort bubbleSort = new BubbleSort(arr.clone());

        InsertionSort insertionSort = new InsertionSort(arr.clone());

        Thread thread1 = new Thread(() -> bubbleSort.sort());
        Thread thread2 = new Thread(() -> insertionSort.sort());

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}