public class OtherEmployee extends Employee {
    private String desc;

    public OtherEmployee(String fullName, String birthDate, String employmentDate, String desc) {
        super(fullName, birthDate, employmentDate);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
