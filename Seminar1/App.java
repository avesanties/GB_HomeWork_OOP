package Seminar1;

/*
 * 27.09.2022
 * Шлепенков Алексей
 * Telegram: @avesanties
 * Discord: Alexey Sh.#3490
 * e-mail: schlepenkow@gmail.com
 * 
 * Реализовать абстрактный класс Продукт, добавить ему какие-то параметры.
 * Реализовать несколько наследников от класса Продукт со своими параметрами,
 * конструкторами и переопределяющие метод toString
 * Реализовать класс Торговый автомат инициализирующий в дефолном конструкторе 
 * несколько коллекция содержащих наследников класса Продукт
 * Реализовать несколько методов возвращающий наследника класса (использовать разных наследников) 
 * Продукт по какому признаку
 * В отдельном классе Main, реализовать пример и использования торгового автомата 
 * (Создать автомат - запросить продукт по критерию - вывести полученный продукт в лог)
 */

import java.util.logging.Logger;

public class App{
    public static void main(String[] args) {
        Logger appLogger = Logger.getAnonymousLogger();

        VendingMachine vm = new VendingMachine();
        appLogger.info(vm.getChocolateBarByWeight(43).toString());
        
        appLogger.info(vm.getWaterBottleByVolume(2).toString());

        appLogger.info(vm.getProductByCost(180).toString());
    }
}