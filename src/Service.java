public abstract class Service {

    private String serviceName;
    private int serviceId;
    private boolean isActive;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService() {
        isActive = true;
        System.out.println(serviceName + " is now ACTIVATED.");
    }

    public void deactivateService() {
        isActive = false;
        System.out.println(serviceName + " is now DEACTIVATED.");
    }

    public boolean isActive() {
        return isActive;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getServiceId() {
        return serviceId;
    }

    public abstract void performService();
}
