package finalexam.defaultsorting;

import finalexam.Sorting;
import finalexam.display.Display;

public class BubbleSort extends Sorting {
    public int[] values;
    public Display display;

    public BubbleSort(int[] values) {
        super();
        this.values = values;
        this.display = new Display(values);
        this.display.setTitle("Bubble Sort");
        this.display.setVisible(true);
    }

    @Override
    public void sort() {
        int n = values.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                this.accessCount++;

                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    this.swapCount++;

                    display.repaint();
                    display.sleep();
                }
                this.comparisons++;
            }
        }
    }
}