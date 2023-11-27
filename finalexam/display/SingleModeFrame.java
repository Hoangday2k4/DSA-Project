package finalexam.display;

import finalexam.App;
import finalexam.defaultsorting.BubbleSort;

import javax.swing.*;

public class SingleModeFrame extends ModeFrame {
    private int[] values;

    public SingleModeFrame(MainFrame mainFrame) {
        super(mainFrame, "Single Mode", App.getListSorting(), true);
        this.values = App.generateRandomArray(100);

        // Add buttons and selection
        addButton("Back", e -> backToMainFrame());
        addButton("Start", e -> startSorting());
        addSelect();

        // Add sorting display
        BubbleSort bubbleSort = new BubbleSort(values);
        addSortingDisplay(bubbleSort.sortingDisplay);
    }

    private void startSorting(bubbleSort) {
        bubbleSort.sort();
    }

    @Override
    protected void addSelect() {
        super.addSelect();
        JComboBox<String> selectBox = new JComboBox<>(getSortingList().toArray(new String[0]));
        panel.add(selectBox);
    }
}