public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean isPremium;
    private int storageUsed;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
        this.storageUsed = 50;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is not active.");
            return;
        }

        if (isPremium) {
            System.out.println("Accessing 1TB cloud storage.");
        } else {
            System.out.println("Accessing 100GB free cloud storage.");
        }
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to PREMIUM storage plan.");
    }

    @Override
    public void generateBill() {
        double costPerGB = 0.5;
        double total = storageUsed * costPerGB;
        System.out.println("Cloud storage bill: $" + total);
    }
}
