package Controller.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Controller.HumanController;
import data.Human;
import data.Relative;

public class HumanRelativesController extends HumanController{

    public HumanRelativesController(Set<Relative> relatives, Map<Integer, Human> humans){
        super(relatives, humans);
    }

    
    public Set<Human> findHumanRelatves(int id){
        Human human = this.getHumanSearchService().searchById(this.humans, id);

        return this.getRelativesFindingService().findRelatives(relatives, human);
    }

    public List<Human> findHumanRelatves(String name, String surname){
        List<Human> searchedHumans = this.getHumanSearchService().searchByName(humans, name, surname);
        List<Human> result = new ArrayList<>();

        for(Human h : searchedHumans){
            result.addAll(
                this.getRelativesFindingService().findRelatives(relatives, h));
        }

        return result;
    }
}
