package controller.impl;

import controller.Controller;
import service.Printable;
import service.SelectableByOS;
import service.impl.ServerSelectByOSService;
import constants.OperationSystems;
import data.impl.Server;

import java.util.List;

public class ServerController extends Controller<Server> {
    private SelectableByOS<Server> serverSelectByOSService;

    public ServerController(List<Server> computers, Printable<Server> printableService) {
        super(computers, printableService);
        this.serverSelectByOSService = new ServerSelectByOSService();
    }

    public SelectableByOS<Server> getServerSelectByOSService() {
        return serverSelectByOSService;
    }

    public void printFilteredByOSServers(OperationSystems os){
        List<Server> result = this.getServerSelectByOSService().SelectByOS(computers,os);
        this.getPrintableService().print(result);
    }
}