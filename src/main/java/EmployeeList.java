import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public List<Employee> sortByName() {
        employeeList.sort(Comparator.comparing(Employee::getFullName));
        return employeeList;
    }

    public List<Employee> sortByEmploymentDate() {
        employeeList.sort(Comparator.comparing(Employee::getEmploymentDate));
        return employeeList;
    }

    public void promoteWorker(Employee employee) {
        if (employee instanceof Worker) {
            removeEmployee(employee);
            addEmployee(new Manager(employee.getFullName(), employee.getBirthDate(), employee.getEmploymentDate()));
        } else if (employee instanceof Manager) {
            for (Worker worker : ((Manager) employee).getWorkerList()) {
                worker.setManager(null);
            }
            removeEmployee(employee);
            addEmployee(new OtherEmployee(employee.getFullName(), employee.getBirthDate(), employee.getEmploymentDate(), "some desc"));
        }
    }
}
