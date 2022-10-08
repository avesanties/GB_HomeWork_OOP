package data.impl;

import constants.Colors;
import data.Computer;

public class Notebook extends Computer {

    private Colors color;

    protected Notebook(NotebookBuilder b) {
        super(b);
    }

    public static class NotebookBuilder extends ComputerBuilder<NotebookBuilder>{

        private Colors color;
        private String model;

        public NotebookBuilder(String model) {
            super();
            this.model = model;
        }
        public NotebookBuilder setColor(Colors c){
            this.color = c;
            return this;
        }

        @Override
        public Notebook build() {
            return new Notebook(this);
        }
    }
}
