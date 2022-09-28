package Seminar1;

/**
 * Абстрактный класс, описывающий
 * продукт вендингового автомата.
 * @author Alexey Sh.
 */
public abstract class Product {

    /**
     * Наименование продукта.
     */
    private String name;

    /**
     * Стоимость продукта.
     */
    private int cost;

    /**
     * Производитель продукта.
     */
    private String producer;

    /**
     * Создает самый простой вариант объект
     * класса {@code Product}.
     * @param name наименование продукта.
     * @param cost стоимость продукта.
     * @param producer производитель продукта.
     */
    public Product(String name, int cost, String producer){
        this.name = name;
        this.cost = cost;
        this.producer = producer;
    }

    public String getName(){
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
    abstract String getCharactiristics();

    public String getProducer(){
        return this.producer;
    }
}
