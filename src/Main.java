import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int PLOTS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену за квадратный метр в диапазоне 500 - 1000");
        int price = scanner.nextInt();
        List <LandPlot> plotList = new ArrayList<>();
        for (int i = 0; i < PLOTS; i++) {
            plotList.add(new LandPlot());
        }

        System.out.println("Список участников с ценой не более " + price + " рублей за квадратный метр (Нечестная сделка)");
        plotList.stream().filter(a -> a.getCost()/(a.getLength()* a.getWidth()) <= price)
                .toList().forEach(LandPlot::landToString);
    }
}
