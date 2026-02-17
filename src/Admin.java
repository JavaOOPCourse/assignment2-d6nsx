public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin " + name + " is managing " + s.getServiceName());
        if (!s.isActive()) {
            s.activateService();
        }
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin " + name + " is using " + s.getServiceName());
        s.performService();
    }
}
