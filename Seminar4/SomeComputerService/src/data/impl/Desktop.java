package data.impl;

import constants.FormFactors;
import data.Computer;

public class Desktop extends Computer {

    private final boolean isWiFi;

    private final FormFactors size;
    protected Desktop(DesktopBuilder b) {
        super(b);
        this.size = b.size;
        this.isWiFi = b.isWiFi;
    }

    public static class DesktopBuilder extends ComputerBuilder<DesktopBuilder>{
        private FormFactors size;
        private boolean isWiFi;

        public DesktopBuilder(String model) {
            super();
        }

        public DesktopBuilder setWifi(boolean isWifi){
            this.isWiFi = isWifi;
            return this;
        }

        public DesktopBuilder setFormFactor(FormFactors s){
            this.size = s;
            return this;
        }

        @Override
        public Desktop build(){
            return new Desktop(this);
        }
    }
}
