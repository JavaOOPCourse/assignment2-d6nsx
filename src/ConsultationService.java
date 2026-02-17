public class ConsultationService extends Service implements Billable {

    private int sessionsUsed;

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.sessionsUsed = 3;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is not active.");
            return;
        }

        System.out.println("Booking an online consultation session.");
        sessionsUsed++;
    }

    @Override
    public void generateBill() {
        double costPerSession = 30.0;
        double total = sessionsUsed * costPerSession;
        System.out.println("Consultation bill: $" + total);
    }
}
