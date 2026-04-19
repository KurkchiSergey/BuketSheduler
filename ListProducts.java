import java.util.Scanner;

public class ListProducts {
    static Scanner sc = new Scanner(System.in);
    static String[] listProducts = {"Хлеб", "Яблоки", "Молоко"};// заводим массив продуктов
    static int[] priceProducts = {50, 100, 160};// цены на каждый из товаров

    //Выведем список всех доступных к покупке продуктов
    public static void outputListProducts() {
        System.out.println("Список продуктов: ");
        for (int i = 0; i < listProducts.length; i++) {
            System.out.println((i + 1) + ". " + listProducts[i] + " " + priceProducts[i] + " руб/шт");
        }
    }

    // метод для ввода данных
    public static void userInput() {
        int summa = 0;// сумма всех выбранных пользователем товаров
        while (true) {
            System.out.println("Выберете товар и количество или введите end: ");
            String input = sc.nextLine();//  пользователь вводит название товара + кол-во
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");
            int product = Integer.parseInt(parts[0]); // номер продукта
            int countProduct = Integer.parseInt(parts[1]);//количество этого продукта
            summa += priceProducts[(Integer.valueOf(product) - 1)] * countProduct;

            // System.out.println("Вы выбрали:" + listProducts[product] + priceProducts[product]*countProduct);
        }
        System.out.println("Суммарная стоимость ваших заказов составляет : " + summa + "руб.");
    }
}