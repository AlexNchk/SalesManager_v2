public class Main {

    public static void main(String[] args) {
        int[] sales = new int[]{15, 0, 25, 10, 38};
        SalesManager max = new SalesManager(sales);
        int maxFin = max.max();
        SalesManager average = new SalesManager(sales);
        int averageFin = average.averageSales();
        System.out.println("Максимальное количество продаж составляет: " + maxFin);
        System.out.println("Среднее количество продаж составляет: " + averageFin);
    }
}
