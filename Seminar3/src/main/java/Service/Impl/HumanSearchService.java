package Service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Constants.Gender;
import Service.HumanSearchable;
import data.Human;

public class HumanSearchService implements HumanSearchable{

    @Override
    public List<Human> searchByName(Map<Integer, Human> humans, String name, String surName){
        if(humans == null) return null;

        List<Human> result = new ArrayList<>(); 

        if(name == null || surName == null) return result;

        for(Human h : humans.values()){
            if(h.getName().equals(name) 
                && h.getSurname().equals(surName)){
                    result.add(h);
                }
        }
        return result;
    }

    @Override
    public Human searchById(Map<Integer, Human> humans, int id){
        if(humans == null) return null;
        return humans.get(id);
    }

    @Override
    public List<Human> searchByAgeGender(Map<Integer, Human> humans, Gender gender, int age) {
        if(humans == null) return null;

        List<Human> result = new ArrayList<>();

        if(age < 0 || gender == null) return result;

        for(Human h : humans.values()){
            if(h.getAge() == age
                && h.getGender() == gender){
                    result.add(h);
                }
        }

        return result;
    }
}
