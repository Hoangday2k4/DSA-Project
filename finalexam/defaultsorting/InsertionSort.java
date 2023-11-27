package finalexam.defaultsorting;

import finalexam.Sorting;
import finalexam.display.SortingDisplay;

public class InsertionSort extends Sorting {
    public int[] values;
    public SortingDisplay sortingDisplay;

    public InsertionSort(int[] values) {
        super();
        this.values = values;
        this.sortingDisplay = new SortingDisplay(values);
        this.sortingDisplay.setVisible(true);
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
                this.sortingDisplay.repaint();
                this.sortingDisplay.sleep();
            }
            values[j + 1] = key;
        }
    }
}