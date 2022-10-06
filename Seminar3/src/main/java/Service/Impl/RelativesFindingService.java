package Service.Impl;

import java.util.HashSet;
import java.util.Set;

import Service.RelativeConnectionsFindable;
import data.Human;
import data.Relative;

public class RelativesFindingService implements RelativeConnectionsFindable {

    @Override
    public Set<Human> findRelatives(Set<Relative> relatives, Human human) {
        if(relatives == null || human == null) return null;

        Set<Human> result = new HashSet<>();
        for(Relative rel : relatives){
            if(rel.getHumanLeft().equals(human)){
                result.add(rel.getHumanRight());
            }
            else if(rel.getHumanRight().equals(human)){
                result.add(rel.getHumanLeft());
            }
        }

        return result;
    }
    
}
