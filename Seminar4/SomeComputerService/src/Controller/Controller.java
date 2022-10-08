package Controller;

import Service.Printable;
import data.Computer;

import java.util.List;

public abstract class Controller<T extends Computer> {
    protected List<T> computers;

    private Printable printableService;

    protected Controller(List<T> computers, Printable<T> printableService){
        this.computers = computers;
        this.printableService = printableService;
    }

    public Printable<T> getPrintableService(){
        return this.printableService;
    }
}
