package finalexam.display;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public abstract class ModeFrame extends JFrame {
    protected MainFrame mainFrame;
    protected JPanel panel;
    private boolean isSingleMode;
    protected List<String> sortingList;
    protected String currentSelection;

    public ModeFrame(MainFrame mainFrame, String title, List<String> sortingList, boolean isSingleMode) {
        this.mainFrame = mainFrame;
        this.sortingList = sortingList;
        this.currentSelection = sortingList.get(0);
        this.isSingleMode = isSingleMode;
        setTitle(title);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
    }

    protected void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    protected void addSelect() {
        if (isSingleMode) {
            JComboBox<String> selectBox = new JComboBox<>(sortingList.toArray(new String[0]));
            panel.add(selectBox);
        } else {
            JComboBox<String> selectBox1 = new JComboBox<>(sortingList.toArray(new String[0]));
            JComboBox<String> selectBox2 = new JComboBox<>(sortingList.toArray(new String[0]));
            panel.add(selectBox1);
            panel.add(selectBox2);
        }
    }

    protected void backToMainFrame() {
        setVisible(false);
        mainFrame.showMainFrame();
    }

    public List<String> getSortingList() {
        return sortingList;
    }

    public void addSortingDisplay(SortingDisplay sortingDisplay) {
        panel.add(sortingDisplay);
    }
}