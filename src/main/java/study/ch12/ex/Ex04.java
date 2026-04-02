package study.ch12.ex;

class Employee {
    String name;
    int salary;

    public Employee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }
}

class Manager extends Employee {
    int bonus;

    public Manager (String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public int getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Employee e = new Employee("김사원", 300);
        Manager m = new Manager("박부장", 500, 1000);
        System.out.println(e.getAnnualSalary()); // 3600
        System.out.println(m.getAnnualSalary()); // 7000


    }

}
