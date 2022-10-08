/*
 * 08.10.2022
 * Шлепенков Алексей
 * Telegram: @avesanties
 * Discord: Alexey Sh.#3490
 * e-mail: schlepenkow@gmail.com
 */

/*
 * Создать наследников класса Компьютер в задаче про ноутбуке
 * Создать интерфейс Printable, содержащий описание метода void print(List<Computer>)
 * Создать типизированные сервисы на каждый наследник и реализовать в них сервис Printable
 * создать контроллер для отбора по каким либо критериям наследников Компьютера, путем вызова
 * метода отбора из заранее созданных списков в сервисах и передачи в метод Печать для печати в Loger
 * в main продемонстрировать поведение программы
*/

import Controller.impl.ServerController;
import Service.impl.ServerPrintService;
import constants.OperationSystems;
import data.impl.Server;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Server> servers = new ArrayList<>();
        servers.add(new Server.ServerBuilder()
                .setHDD(5000)
                .setRAM(64)
                .setOS(OperationSystems.UBUNTU)
                .build());
        servers.add(new Server.ServerBuilder()
                .setHDD(10000)
                .setRAM(32)
                .setOS(OperationSystems.UBUNTU)
                .build());
        servers.add(new Server.ServerBuilder()
                .setHDD(3000)
                .setRAM(16)
                .setOS(OperationSystems.UBUNTU)
                .build());
        servers.add(new Server.ServerBuilder()
                .setHDD(5000)
                .setRAM(64)
                .setOS(OperationSystems.ASTRA)
                .build());
        servers.add(new Server.ServerBuilder()
                .setHDD(10000)
                .setRAM(32)
                .setOS(OperationSystems.CENTOS)
                .build());
        servers.add(new Server.ServerBuilder()
                .setHDD(3000)
                .setRAM(16)
                .setOS(OperationSystems.ASTRA)
                .build());

        ServerController serverController = new ServerController(servers, new ServerPrintService());
        serverController.getPrintableService().print(servers);

        serverController.printFilteredByOSServers(OperationSystems.ASTRA);
    }
}