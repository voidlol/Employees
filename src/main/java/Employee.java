public abstract class Employee {
    private String fullName;
    private String birthDate;
    private String employmentDate;

    public Employee(String fullName, String birthDate, String employmentDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }
}
