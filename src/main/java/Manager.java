import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements IManager {

    private final List<Worker> workerList = new ArrayList<>();

    public Manager(String fullName, String birthDate, String employmentDate) {
        super(fullName, birthDate, employmentDate);
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    @Override
    public void addWorker(Worker worker) {
        workerList.add(worker);
        worker.setManager(this);
    }

    @Override
    public void removeWorker(Worker worker) {
        workerList.remove(worker);
        worker.setManager(null);
    }


}
