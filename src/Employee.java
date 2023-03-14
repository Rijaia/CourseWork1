public class Employee {
    private final String firstName;
    private final String middleName;
    private final String surName;
    private int department;
    private int salary;
    private final int id;
    private static int count = 0;

    public Employee(String firstName, String middleName, String surName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
        this.id = ++count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return
                "ФИО " + firstName+" " + middleName+" " + surName +
                ", department" + department +
                ", salary=" + salary +
                ", id=" + id;
    }
}
