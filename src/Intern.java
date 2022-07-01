// Intern POJO class to represent entity Intern
public class Intern {
    // default field
    String name;

    // public field
    public String role;

    // private field
    private double salary;

    //arg-constructor to initialize fields
    public Intern(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for role
    public String getRole() {
        return role;
    }

    // getter method for salary
    public Double getSalary() {
        return salary;
    }
}