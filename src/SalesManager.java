public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int averageSales() {
        int max = sales[0];
        int min = sales[0];
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
        }
        return (sum - min - max) / (sales.length - 2);
    }
}
