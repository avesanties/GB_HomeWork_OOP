package Seminar1;

/**
 * Класс, описывающий состояние и поведение бутылки с водой.
 * @author Alexey Sh.
 */
public class WaterBottle extends Product {

    /**
     * Объем бутылки с водой.
     */
    private double volume;
    
    /**
     * Создается объект класса {@code WaterBottle}
     * со значениями полей по умолчанию.
     * @param name наименование шоколадного батончика.
     * @param cost стоимость шоколадного батончика.
     * @param producer производитель шоколадного батончика.
     */
    public WaterBottle(){
        super("DefaultName", 9999, "CompanyName");
        this.volume = 1.5d;
    }

    /**
     * Создается объект класса {@code WaterBottle}.
     * @param name наименование шоколадного батончика.
     * @param cost стоимость шоколадного батончика.
     * @param producer производитель шоколадного батончика.
     * @param volume объем бутылки воды.
     */
    public WaterBottle(String name, int cost, String producer, double volume){
        super(name, cost, producer);
        this.volume = volume;
    }

    public double getVolume(){
        return this.volume;
    }

    @Override
    public String getCharactiristics(){
        return "The water bottle is of 1.5 l. volume.";
    }

    @Override
    public String toString(){
        return String.format("Name=%s,cost=%d,producer=%s,wolume=%.1f"
                                ,this.getName()
                                ,this.getCost()
                                ,this.getProducer()
                                ,this.getVolume());
    }
}
