import java.util.Random;

public class ConstructorTest {

    public static void main(String[] args) {
        EmployeeA[] staff = new EmployeeA[3];

        staff[0] = new EmployeeA("Harry", 40000);
        staff[1] = new EmployeeA(60000);
        staff[2] = new EmployeeA();

        for (EmployeeA e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
    }
}


class EmployeeA {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public EmployeeA(String n, double s) {
        name = n;
        salary = s;
    }

    public EmployeeA(double s) {
        this("Employee#" + nextId, s);
    }

    public EmployeeA() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}