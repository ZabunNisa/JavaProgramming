package day39_Recap.CydeoTask;

public class Employee extends Person{

    private int employeeID;
    private String jobTitile;
    private double salary;


    public Employee(String name, int age, char gender, int employeeID, String jobTitile, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitile(jobTitile);
        setSalary(salary);
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

       if (employeeID <=0) {
           System.err.println(" Invalid employeeID: " + employeeID);
           System.exit(1);

       }

            this.employeeID = employeeID;
    }

    public String getJobTitile() {
        return jobTitile;
    }

    public void setJobTitile(String jobTitile) {
        this.jobTitile = jobTitile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void  work(){
        System.out.println(getName() + " is working");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeID=" + employeeID +
                ", jobTitile='" + jobTitile + '\'' +
                ", salary= £" + salary +
                '}';
    }
}



/* 2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
*/