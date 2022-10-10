public class EmployeeBook {
    private final Employee[] employeeBook;

    public EmployeeBook (Employee [] employeeBook) {
        this.employeeBook = employeeBook;
    }

    public void putEmployee(Employee employeeToPut) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employeeToPut;
                break;
            }
        }
    }

    public void printEmployeeList() {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                System.out.println("Employee: " + employeeBook[i].toString() + " Salary: " + employeeBook[i].getSalary() + " rub" + " Department: " + employeeBook[i].getDepartament() + " ID: " + employeeBook[i].getId());
            } else {
                System.out.println("Пустой лот!");
                continue;
            }
        }
    }

    public int getExpensesTotal() {
        int sumSalary = 0;
        for (int i = 0; i < employeeBook.length && employeeBook[i] != null; i++) {
            sumSalary = employeeBook[i].getSalary() + sumSalary;
        }
        return sumSalary;
    }

    public void findMinSalary() {
        int minSalary = employeeBook[0].getSalary();
        int employeeMinNum = 0;
        for (int i = 0; i < employeeBook.length && employeeBook[i] != null; i++) {
            final int currentMinimum = employeeBook[i].getSalary();
            if (currentMinimum < minSalary) {
                minSalary = currentMinimum;
                employeeMinNum = i;
            }
        }
        System.out.println("Employee " + employeeBook[employeeMinNum].toString() + " has the lowest salary: " + employeeBook[employeeMinNum].getSalary() + " rub" + " ID: " + employeeBook[employeeMinNum].getId());
    }

    public void findMaxSalary() {
        int maxSalary = employeeBook[0].getSalary();
        int employeeMaxNum = 0;
        for (int i = 0; i < employeeBook.length && employeeBook[i] != null; i++) {
            final int currentMaximum = employeeBook[i].getSalary();
            if (currentMaximum > maxSalary) {
                maxSalary = currentMaximum;
                employeeMaxNum = i;
            }
        }
        System.out.println("Employee " + employeeBook[employeeMaxNum].toString() + " has the highest salary: " + employeeBook[employeeMaxNum].getSalary() + " rub" + " ID: " + employeeBook[employeeMaxNum].getId());
    }

    public double getMediumSalary() {
        double mediumSalary = 1.0 * (this.getExpensesTotal() / employeeBook.length);
        return mediumSalary;
    }

    public void getAllNames() {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                System.out.println(employeeBook[i].toString());
            }
        }
    }
}
