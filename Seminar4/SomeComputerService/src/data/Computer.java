package data;

import constants.OperationSystems;

public abstract class Computer{
    private int ram;

    private OperationSystems os;

    private int hdd;

    protected Computer(ComputerBuilder b){
        this.ram = b.ram;
        this.os = b.os;
        this.hdd = b.hdd;
    }

    public int getRAM(){ return this.ram;}

    public OperationSystems getOS(){ return this.os;}

    public int getHDD(){ return this.hdd;}

    @Override
    public String toString(){
        return "[" + getClass()
                + " RAM=" + this.ram
                + " HDD=" + this.hdd
                + " OS=" + this.os
                + "]";
    }

    public abstract static class ComputerBuilder <T extends ComputerBuilder>{
        private int ram;
        private OperationSystems os;
        private int hdd;

        public ComputerBuilder(){

        }

        public T setRAM(int ram){
            this.ram = ram;
            return (T) this;
        }

        public T setOS(OperationSystems os){
            this.os = os;
            return (T) this;
        }

        public T setHDD(int hdd){
            this.hdd = hdd;
            return (T) this;
        }

        public abstract <S extends Computer> S build();
    }
}