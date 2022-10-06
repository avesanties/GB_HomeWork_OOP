package Service;

import java.util.List;
import java.util.Map;

import Constants.Gender;
import data.Human;

public interface HumanSearchable{
    List<Human> searchByName(Map<Integer, Human> humans, String name, String surName);

    List<Human> searchByAgeGender(Map<Integer, Human> humans, Gender gender, int age);

    Human searchById(Map<Integer, Human> humans, int id);
}