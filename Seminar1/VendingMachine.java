package Seminar1;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс описывает вендинговый автомат.
 * Содержит коллекцию объектов класса {@code Product} и методы
 * для работы с ней.
 */
public class VendingMachine {
    /**
     * Коллекция объектов класса {@code Product}.
     */
    private List<Product> products;

    /**
     * Конструктор по умолчанию, создающий коллекцию объектов класса {@code Product}.
     */
    public VendingMachine(){
        this.products = new ArrayList<>();
        this.products.add(new ChocolateBar("Snikers", 87, "MARS", 43));
        this.products.add(new ChocolateBar("Bounty", 70, "MARS", 45));
        this.products.add(new ChocolateBar("TWIX", 84, "MARS", 41));
        this.products.add(new WaterBottle());
        this.products.add(new WaterBottle("Pepsi",160,"Pepci", 2.0));
        this.products.add(new WaterBottle("Sprite",155,"Coca-Cola", 1.5));
        this.products.add(new WaterBottle("Coca-Cola",180,"Coca-Cola", 1.0));
    }

    /**
     * Конструктор, позволяющий указать коллекцию объектов класса {@code Product}.
     * @param products коллекция объектов класса {@code Product}. 
     */
    public VendingMachine(List<Product> products){
        this.products = products;
    }

    /**
     * По указанной цене возвращает первый подходящий продукт.
     * @param cost стоимость продукта.
     * @return возвращает продукт, подходящий по стоимости.
     */
    public Product getProductByCost(int cost){
        for(Product p : products)
            if(p.getCost() == cost)
                return p;

        return null;
    }

    /**
     * Метод возвращает первую бутылку с водой,
     * удовлетворяющую заданному объему.
     * @param volume требуемый объем.
     * @return возвращает бутылку с водой {@code WaterBottle} 
     *         требуемого объема или null.
     */
    public WaterBottle getWaterBottleByVolume(double volume){
        for(Product p : products){
            if(p instanceof WaterBottle){
                WaterBottle wb = (WaterBottle)p;
                if(Double.compare(wb.getVolume(), volume) == 0)
                    return wb;
            }
        }

        return null;
    }

    /**
     * Метод возвращает шоколадный батончик {@code ChocolateBar} требуемого веса.
     * @param weight вес шоколадного батончика {@code ChocolateBar}.
     * @return возвращает шоколадный батончик {@code ChocolateBar} или null.
     */
    public ChocolateBar getChocolateBarByWeight(int weight){
        for(Product p : products){
            if(p instanceof ChocolateBar){
                ChocolateBar cb = (ChocolateBar)p;
                if(cb.getWeight() == weight)
                    return cb;
            }
        }

        return null;
    }
}
