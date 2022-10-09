package constants;

public enum OperationSystems {
    CENTOS, UBUNTU, WINSERVER, REDHAT, FREEBSD;

    @Override
    public String toString() {
        return "OS=" + this.name();
    }
}
