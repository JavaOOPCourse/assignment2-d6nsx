public class Main {
    public static void main(String[] args) {

        User admin = new Admin("Alice", 1);
        User customer = new Customer("Bob", 2);

        Service streaming = new StreamingService("StreamPlus", 101);
        Service cloud = new CloudStorageService("CloudBox", 102);
        Service consultation = new ConsultationService("MediTalk", 103);

        Service[] services = {streaming, cloud, consultation};

        for (Service s : services) {
            s.activateService();
        }

        System.out.println("------ Performing Core Operations ------");

        for (Service s : services) {
            s.performService();
        }

        System.out.println("------ Premium Features ------");

        if (streaming instanceof PremiumFeature) {
            ((PremiumFeature) streaming).upgradeToPremium();
        }

        if (cloud instanceof PremiumFeature) {
            ((PremiumFeature) cloud).upgradeToPremium();
        }

        System.out.println("------ Billing Behavior ------");

        if (cloud instanceof Billable) {
            ((Billable) cloud).generateBill();
        }

        if (consultation instanceof Billable) {
            ((Billable) consultation).generateBill();
        }

        System.out.println("------ User Interactions ------");

        admin.manageService(streaming);
        customer.useService(streaming);

        admin.manageService(cloud);
        customer.useService(cloud);

        System.out.println("------ Service Summary ------");

        for (Service s : services) {
            System.out.println(s.getServiceName());
        }

        System.out.println("------ Deactivating Services ------");

        for (Service s : services) {
            s.deactivateService();
        }
    }
}
