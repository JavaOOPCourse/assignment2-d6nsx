public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Customer " + name + " does not have permission to manage services.");
    }

    @Override
    public void useService(Service s) {
        System.out.println("Customer " + name + " is using " + s.getServiceName());
        if (s.isActive()) {
            s.performService();
        } else {
            System.out.println("Service is not active.");
        }
    }
}
