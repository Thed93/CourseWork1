public class Main {

    public static void main(String[] args) {
        Employee andreev = new Employee("Андрей","Андреев","Андреевич");
        andreev.setSalary(10000);
        andreev.setDepartmentNumber(1);
        Employee borisov = new Employee("Борси","Борисов","Борисович");
        borisov.setSalary(11000);
        borisov.setDepartmentNumber(2);
        Employee volodin = new Employee("Владимир","Володин","Владимирович");
        volodin.setSalary(23000);
        volodin.setDepartmentNumber(3);
        Employee glebov = new Employee("Глеб","Глебов","Глебович");
        glebov.setSalary(12000);
        glebov.setDepartmentNumber(4);
        Employee denisov = new Employee("Денис","Денисов","Денисович");
        denisov.setSalary(13000);
        denisov.setDepartmentNumber(5);
        Employee egorov = new Employee("Егор","Егоров","Егорович");
        egorov.setSalary(12321);
        egorov.setDepartmentNumber(1);
        Employee jukov = new Employee("Жук","Жуков","Жукович");
        jukov.setSalary(20000);
        jukov.setDepartmentNumber(2);
        Employee zaycev = new Employee("Заец","Зайцев","Зайцевич");
        zaycev.setSalary(17000);
        zaycev.setDepartmentNumber(3);
        Employee ignatov = new Employee("Игнат","Игнатов","Игнатович");
        ignatov.setSalary(22000);
        ignatov.setDepartmentNumber(4);
        Employee kirillov = new Employee("Кипилл","Кириллов","Кириллович");
        kirillov.setSalary(18000);
        kirillov.setDepartmentNumber(5);
        EmployeeBook employees = new EmployeeBook(new Employee[10]);
        employees.putEmployee(andreev);
        employees.putEmployee(borisov);
        employees.putEmployee(volodin);
        employees.putEmployee(glebov);
        employees.putEmployee(denisov);
        employees.putEmployee(egorov);
        employees.putEmployee(jukov);
        employees.putEmployee(zaycev);
        employees.putEmployee(ignatov);
        employees.putEmployee(kirillov);
        System.out.println("Total expenses for salaries: " + employees.getExpensesTotal());
        employees.findMinSalary();
        employees.findMaxSalary();
        System.out.println("Medium salary: " + employees.getMediumSalary());
        employees.getAllNames();








    }
}