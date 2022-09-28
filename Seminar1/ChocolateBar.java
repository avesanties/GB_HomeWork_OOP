package Seminar1;

/**
 * Класс, описывающий состояние и поведение шоколадного батончика.
 * @author Alexey Sh.
 */
public class ChocolateBar extends Product{

    /**
     * Вес шоколадного батончика.
     */
    private int weight;

    /**
     * Наличие глютена в батончике.
     * Во всех батончиках есть глютен,
     * если не указано иного.
     */
    private boolean isGlutenFree = false;

    /**
     * Создается обычный глютеновый шоколадный батончик.
     * @param name наименование шоколадного батончика.
     * @param cost стоимость шоколадного батончика.
     * @param producer производитель шоколадного батончика.
     * @param weigth вес шоколадного батончика.
     */
    public ChocolateBar(String name, int cost, String producer, int weigth) {
        super(name, cost, producer);
        this.weight = weigth;
    }

    /**
     * Создается шоколадный батончик с возможностью указания
     * его безглютенового статуса.
     * @param name наименование шоколадного батончика.
     * @param cost стоимость шоколадного батончика.
     * @param producer производитель шоколадного батончика.
     * @param weight вес шоколадного батончика.
     * @param isGlutenFree статус наличия глютена.
     */
    public ChocolateBar(String name, int cost, String producer, int weight, boolean isGlutenFree){
        super(name, cost, producer);
        this.weight = weight;
        this.isGlutenFree = isGlutenFree;
    }

    public int getWeight(){
        return this.weight;
    }

    public boolean getGlutenStatus(){
        return this.isGlutenFree;
    }

    @Override
    public String getCharactiristics(){
        return "The chocolate bar weighs " + this.weight  + " g.";
    }

    @Override
    public String toString(){
        return String.format("Name=%s,cost=%d,producer=%s,weight=%d,glutenfree=%b"
                                ,this.getName()
                                ,this.getCost()
                                ,this.getProducer()
                                ,this.getWeight()
                                ,this.getGlutenStatus());
    }
}