/*
 * 6.10.2022
 * Шлепенков Алексей
 * Telegram: @avesanties
 * Discord: Alexey Sh.#3490
 * e-mail: schlepenkow@gmail.com
 */



/*
 * Класс Human со своими параметрами (прмер: name, surname, age, gender);
 * Enum Relation содержащий типы связей между людей (пример: Родитель, Ребенок, Муж и тд)
 * Класс Relative содержащий в себе двух людей и связь между ними (Human, Human, Relation)
 * Записать в 2 коллекции [люди], [отношения];
 * Создать сервисы для взаимодействия с Human, Relative
 * Создать контроллер в котором используем логику сервисов по поиску по спискам Human и Relative
 * в main инициализировать коллекции и вызвать контроллер
 */



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Constants.Gender;
import Constants.Relation;
import Controller.Impl.HumanRelativesController;
import data.Human;
import data.Relative;

public class App {
    public static void main(String[] args) {
        Map<Integer, Human> humans = new HashMap<>();
        var h1 = new Human("George VI","Windsor",56,Gender.MALE);
        var h2 = new Human("Elizabeth I","Bowes-Lyon",102,Gender.FEMALE);
        var h3 = new Human("Elizabeth II","Windsor",96,Gender.FEMALE);
        var h4 = new Human("Philipp","Mountbatten",99,Gender.MALE);
        var h5 = new Human("Rose","Windsor",72,Gender.FEMALE);
        var h6 = new Human("Charles III","Windsor",74,Gender.MALE);
        var h7 = new Human("Anna","Windsor",72,Gender.FEMALE);
        var h8 = new Human("Andrew","Windsor",62,Gender.MALE);
        var h9 = new Human("Edward","Windsor",58,Gender.MALE);
        var h10 = new Human("Camilla","Shand",75,Gender.FEMALE);
        humans.put(h1.getId(), h1);
        humans.put(h2.getId(), h2);
        humans.put(h3.getId(), h3);
        humans.put(h4.getId(), h4);
        humans.put(h5.getId(), h5);
        humans.put(h6.getId(), h6);
        humans.put(h7.getId(), h7);
        humans.put(h8.getId(), h8);
        humans.put(h9.getId(), h9);
        humans.put(h10.getId(), h10);

        Set<Relative> relatives = new HashSet<>();
        relatives.add(new Relative(h1,h2,Relation.HUSBAND));
        relatives.add(new Relative(h2,h1,Relation.WIFE));
        relatives.add(new Relative(h3,h4,Relation.WIFE));
        relatives.add(new Relative(h4,h3,Relation.HUSBAND));
        relatives.add(new Relative(h3,h6,Relation.MOTHER));
        relatives.add(new Relative(h3,h7,Relation.MOTHER));
        relatives.add(new Relative(h3,h8,Relation.MOTHER));
        relatives.add(new Relative(h3,h9,Relation.MOTHER));
        relatives.add(new Relative(h6,h10,Relation.HUSBAND));
        relatives.add(new Relative(h6,h10,Relation.HUSBAND));

        var controller = new HumanRelativesController(relatives, humans);

        System.out.println(controller.findHumanRelatves(2));
    }
}
