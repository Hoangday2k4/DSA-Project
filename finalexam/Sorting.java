package finalexam;

public abstract class Sorting {
    public int accessCount; //đếm số lần lặp
    public int comparisons; //đếm số lần so sánh
    public int swapCount; //đếm số lần đổi chỗ

    public double timeExecuted; //thời gian chạy

    public Sorting() {
        this.accessCount = 0;
        this.comparisons = 0;
        this.swapCount = 0;
    }

    public abstract void sort();
}