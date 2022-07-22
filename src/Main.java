public class Main {

    public static void main(String[] args) {
        long[] sales = new long[]{15, 0, 25, 10, 38};
        SalesManager max = new SalesManager(sales);
        long maxFin = max.max();
        SalesManager average = new SalesManager(sales);
        long averageFin = average.averageSales();
        System.out.println("Максимальное количество продаж составляет: " + maxFin);
        System.out.println("Среднее количество продаж составляет: " + averageFin);
    }
}
