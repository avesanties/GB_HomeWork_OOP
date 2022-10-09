/*
 * 09.10.2022
 * Шлепенков Алексей
 * Telegram: @avesanties
 * Discord: Alexey Sh.#3490
 * e-mail: schlepenkow@gmail.com
 */

/*
 * Создаем классы Cpu, Ram, MotherBourd(и другие части комюьтера)
 * Создаем класс Настольный Компьютер с полями в виде предыдущих созданных классов
 * Создаем типизированные сервисы для работы с частями компьютера(по сервису на класс!)
 * Применяем шаблон проектирования Builder, посредством создания класса Настольный компьютер билдер, передачи в него описания желаемых характеристики(для примера setRam(16)), и создания компьютера(пример buildt() в нем вызываем сервисы для фильтрации по желаемому критери из списка заранее созданных деталей)
 * Создаем контролер с методом дайКомпьютерПоЖелаемымКритериям(String критерии...)
 * в нем создаем билдер и наполняем его переданными критериямм и возвращаем компьютер
 * в main демонстрируем
*/

import constants.MotherboardFormFactors;
import constants.OperationSystems;
import controllers.impl.DesktopBuilderController;

public class Main {
    public static void main(String[] args) {
        var dc = new DesktopBuilderController();
        var desktop = dc.BuidDesktopByCriteria(3.5
                                    , 6
                                    , MotherboardFormFactors.ATX
                                    , OperationSystems.UBUNTU
                                    , 500
                                    , 16
                                    , 400);

        System.out.println(desktop);
    }
}