package constants;

public enum OperationSystems {
    WINDOWS10("Windows 10"), WINDOWS11("Windows 11"), UBUNTU("Ubuntu"), MACOS("Mac OS")
    ,CENTOS("Cent OS"), ASTRA("Astra Linux");

    private String name;

    OperationSystems(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
