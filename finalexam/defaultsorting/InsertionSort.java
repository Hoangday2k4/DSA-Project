package finalexam.defaultsorting;

import finalexam.Sorting;
import finalexam.display.Display;

public class InsertionSort extends Sorting {
    public int[] values;
    public Display display;

    public InsertionSort(int[] values) {
        super();
        this.values = values;
        this.display = new Display(values);
        this.display.setTitle("Insertion Sort");
        this.display.setVisible(true);
    }

    @Override
    public void sort() {
        int n = values.length;
        for (int i = 1; i < n; i++) {
            int key = values[i];
            int j = i - 1;

            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j = j - 1;
                this.display.repaint();
                this.display.sleep();
            }
            values[j + 1] = key;
        }
    }
}