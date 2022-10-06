package data;

import java.util.Objects;

import Constants.Gender;

public class Human {
    private static int nextId = 0;

    private int id;

    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Human(String name, String surname, int age, Gender gender){
        this.id = nextId;
        nextId++;

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public int getId(){ return this.id;}
    
    public String getName(){ return this.name;}
    
    public String getSurname(){ return this.surname;}
    
    public int getAge(){ return this.age;}
    
    public Gender getGender(){ return this.gender;};

    @Override
    public String toString(){
        return getClass().getName()
            + "[id=" + this.id
            + ",name=" + this.name
            + ",surname=" + this.surname
            + ",age=" + this.age
            + ",gender=" + this.gender.name()
            + "]";
                
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Human object = (Human)obj;
        return this.id == object.id
                && Objects.equals(this.name, object.getName())
                && Objects.equals(this.surname, object.getSurname())
                && this.age == object.getAge()
                && Objects.equals(this.gender, object.getGender());
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, surname, age, gender);
    }
}

