package Task7_Shop;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String electronics[] = new String [5];
        electronics[0] = "1 — Фен Rowenta";
        electronics[1] = "2 — Утюг Philips";
        electronics[2] = "3 — Микроволновая печь Scarlett";
        electronics[3] = "4 — Миксер Samsung";
        electronics[4] = "5 — Тостер Redmond";

        String smartphone[] = new String [5];
        smartphone [0] = "1 — Apple IPhone 11 Pro";
        smartphone [1] = "2 — Xiaomi Redmi 9C";
        smartphone [2] = "3 — Samsung Galaxy";
        smartphone [3] = "4 — Techno Pova 3";
        smartphone [4] = "5 — Honor X8";



        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.println("1 — Электроника" + "\n" + "2 — Смартфоны" + "\n" + "3 — Ноутбуки и компьютеры");

        System.out.println("Введите номер категории товара: ");
        String category = scanner.nextLine();
        category = scanner.nextLine();

        switch(category) {
            case "1":
                System.out.println("Введите номер товара: " + Arrays.toString(electronics));
                String el = scanner.nextLine();
                el = scanner.nextLine();
                switch (el){
                    case "1":
                        System.out.println("Вы добавили в корзину Фен Rowenta, введите 'Оплатить', чтобы оформить покупку");
                        String buy = scanner.nextLine();
                        buy = scanner.nextLine();
                        switch (buy){
                            case "Оплатить":
                                System.out.println("Товар оплачен, благодарим Вас за покупку");
                        }
                        break;
                }

                break;

            case "2":
                System.out.println("Категория смартфоны: " + Arrays.toString(smartphone));
                break;

            default:
                System.out.println("Вы что-то не то ввели :(");


        }



    }
}
