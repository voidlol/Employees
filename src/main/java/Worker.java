public class Worker extends Employee {

    private Manager manager = null;

    public Worker(String fullName, String birthDate, String employmentDate) {
        super(fullName, birthDate, employmentDate);
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
