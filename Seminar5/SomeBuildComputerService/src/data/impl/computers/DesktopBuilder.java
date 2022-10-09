package data.impl.computers;

import data.AbstractComputerBuilder;

public class DesktopBuilder extends AbstractComputerBuilder<DesktopBuilder> {

    @Override
    public Desktop build() {
        return new Desktop(this);
    }
}
