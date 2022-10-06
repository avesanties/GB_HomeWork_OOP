package Service;

import java.util.Set;

import data.Human;
import data.Relative;

public interface RelativeConnectionsFindable{
    Set<Human> findRelatives(Set<Relative> relatives, Human human);
}