package Controller;

import java.util.Map;
import java.util.Set;

import Service.HumanSearchable;
import Service.RelativeConnectionsFindable;
import Service.Impl.HumanSearchService;
import Service.Impl.RelativesFindingService;
import data.Human;
import data.Relative;

public abstract class HumanController {
    protected Set<Relative> relatives;
    protected Map<Integer, Human> humans;

    private HumanSearchable HumanSearchableService;
    private RelativeConnectionsFindable RelativeConnectionsFindableService;
    
    protected HumanController(Set<Relative> relatives
                                , Map<Integer, Human> humans){
        this.relatives = relatives;
        this.humans = humans;
        this.HumanSearchableService = new HumanSearchService();
        this.RelativeConnectionsFindableService = new RelativesFindingService();
    }

    protected HumanSearchable getHumanSearchService(){ return HumanSearchableService;}

    protected RelativeConnectionsFindable getRelativesFindingService() { return RelativeConnectionsFindableService;}
}
