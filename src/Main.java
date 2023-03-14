import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        System.out.println("Курсовая работа 1. Захарова Наталья");



        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Иван" + i, "Иванович" + i, "Иванов" + i, 1 + (i % 5),  10000*(i+1));
        }

        System.out.println("a. Список сотрудников и их данные");
        printEmloyee(employees);
        System.out.println("b. "+calculateTotalSalary(employees));
        System.out.println("c. "+calculateMinSalary(employees));
        System.out.println("d. "+calculateMaxSalary(employees));
        System.out.println("e. "+calculateAverageSalary(employees));
        System.out.println("f. ФИО сотрудников ");
        printFullName(employees);

    }

    private static void printEmloyee(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
    private static Employee calculateMinSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if ( employees[i].getSalary() > result.getSalary())
            {result = employees[i];
        }}
        return result;
    }
    private static Employee calculateMaxSalary(Employee[] employees) {
            Employee result = employees[0];

            for (int i = 0; i < employees.length; i++) {
                if ( employees[i].getSalary() < result.getSalary())
                {result = employees[i];
                }}
                return result;

    }
    private static double calculateAverageSalary(Employee[] employees) {

        return (double) calculateTotalSalary(employees)/employees.length;
    }
    private static void printFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            String fullName = employees[i].getSurName()+" "+ employees[i].getFirstName()+" "+employees[i].getMiddleName();
            System.out.println(fullName);
        }
    }

}
