public class StreamingService extends Service implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is not active.");
            return;
        }

        if (isPremium) {
            System.out.println("Streaming in HD quality with no ads.");
        } else {
            System.out.println("Streaming in standard quality with ads.");
        }
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to PREMIUM version.");
    }
}
