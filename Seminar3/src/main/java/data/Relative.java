package data;

import java.util.Objects;

import Constants.Relation;

public class Relative {
    private Human humanLeft;
    private Human humanRight;
    private Relation relation;

    public Relative(Human hl, Human hr, Relation rel){
        this.humanLeft = hl;
        this.humanRight = hr;
        this.relation = rel;
    }

    public Human getHumanLeft(){ return this.humanLeft;}

    public Human getHumanRight(){ return this.humanRight;}

    public Relation getRelation(){ return this.relation;}

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Relative object = (Relative)obj;
        return Objects.equals(this.humanLeft, object.humanLeft)
                && Objects.equals(this.humanRight, object.humanRight)
                && Objects.equals(this.relation, object.relation);
    }

    @Override
    public int hashCode(){
        return Objects.hash(humanLeft, humanRight, relation);
    }
}
