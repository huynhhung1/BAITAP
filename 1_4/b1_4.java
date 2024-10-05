public class b1_4 {



    private int id;
    private String name;
    private double salary;
    private String firstname;
    private String lastname;
    public b1_4(int id, String name, String Firstname, String Lastname, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.firstname = Firstname;
        this.lastname = Lastname;





    }
    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }
    public int getId() {
        return id;

    }
    public String getName() {
        return name;

    }
    public double getSalary() {
        return salary;

    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }










    public String raiseSalary(double percent) {
        if (percent < 0) {
            System.out.println("Ty le tang luong khong hop le");


        }
        salary += salary * (percent / 100);
        return String.format("%.2f", salary);


    }






    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + firstname + " " + lastname + " ,  salary=" + salary + "]";


    }


    public int getAnnualSalary() {
        return (int) (salary * 12);





    }
}
