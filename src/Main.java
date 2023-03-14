public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        System.out.println("Курсовая работа 1. Захарова Наталья");

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Иван" + i, "Иванович" + i, "Иванов" + i, 1 + (i % 5),  10000*(i+1));
        }

        System.out.println("a. Список сотрудников и их данные");
        printEmloyee();
        System.out.println("b. "+calculateTotalSalary());
        System.out.println("c. "+calculateMinSalary());
        System.out.println("d. "+calculateMaxSalary());
        System.out.println("e. "+calculateAverageSalary());
        System.out.println("f. ФИО сотрудников ");
        printFullName();

    }

    private static void printEmloyee() {

        for (int i = 0; i < Main.employees.length; i++) {
            System.out.println(Main.employees[i].toString());
        }
    }

    private static int calculateTotalSalary() {
        int totalSalary = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            totalSalary += Main.employees[i].getSalary();
        }
        return totalSalary;
    }
    private static Employee calculateMinSalary() {
        Employee result = Main.employees[0];
        for (int i = 0; i < Main.employees.length; i++) {
            if ( Main.employees[i].getSalary() > result.getSalary())
            {result = Main.employees[i];
        }}
        return result;
    }
    private static Employee calculateMaxSalary() {
            Employee result = Main.employees[0];

            for (int i = 0; i < Main.employees.length; i++) {
                if ( Main.employees[i].getSalary() < result.getSalary())
                {result = Main.employees[i];
                }}
                return result;

    }
    private static double calculateAverageSalary() {

        return (double) calculateTotalSalary()/ Main.employees.length;
    }
    private static void printFullName() {
        for (int i = 0; i < Main.employees.length; i++) {
            String fullName = Main.employees[i].getSurName()+" "+ Main.employees[i].getFirstName()+" "+ Main.employees[i].getMiddleName();
            System.out.println(fullName);
        }
    }

}
