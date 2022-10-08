package Service.impl;

import Service.SelectableByOS;
import constants.OperationSystems;
import data.impl.Server;

import java.util.ArrayList;
import java.util.List;

public class ServerSelectByOSService implements SelectableByOS<Server> {
    @Override
    public List<Server> SelectByOS(List<Server> computers, OperationSystems os) {
        List<Server> result = new ArrayList<>();
        for(Server svr : computers){
            if(svr.getOS() == os)
                result.add(svr);
        }
        return result;
    }
}
