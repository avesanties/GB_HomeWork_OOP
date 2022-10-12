/*
 * 12.10.2022
 * Шлепенков Алексей
 * Telegram: @avesanties
 * Discord: Alexey Sh.#3490
 * e-mail: schlepenkow@gmail.com
 */

/*
* Создать кофемашину с 4 видами кофе, для
* каждого использовать свой класс, билдер.
* Использовать первые три принципа SOLID
*/


import constants.CoffeeTypes;
import controller.impl.SomeCoffeMachine;

public class Main {
    public static void main(String[] args) {
        var coffeMachine = new SomeCoffeMachine();
        var coffee = coffeMachine.makeCoffee(CoffeeTypes.AMERICANO);

        System.out.println(coffee);
    }
}