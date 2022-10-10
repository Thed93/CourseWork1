public class Employee {


    private final String name;
    private final String lustName;
    private final String middleName;

    private static int counter = 1;
    private int id;
    private int departament;
    private int salary;

    public Employee(String name, String lustName, String middleName) {
        this.name = name;
        this.lustName = lustName;
        this.middleName = middleName;
        this.id = counter;
        counter++;

    }

    public String getName() {
        return name;
    }

    public String getLustName() {
        return lustName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        if (departmentNumber <= 5 || departmentNumber > 0) {
            this.departament = departament;
        } else if (departmentNumber > 5) {
            throw new IllegalArgumentException("There are only 5 departments!");
        } else if (departmentNumber < 0) {
            throw new IllegalArgumentException("Department number cannot be lower than 0!");
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return lustName + " " + name + " " + middleName;
    }
}
