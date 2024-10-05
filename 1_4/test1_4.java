public class test1_4 {
    public static void main(String[] args) {
        b1_4 e1 = new b1_4(8, " Peter Tan ", "Peter", "Tan", 2500);
        System.out.println(e1.toString());
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id la:" + e1.getId());
        System.out.println("firstname is " + e1.getFirstname());

        System.out.println("lastname is:" + e1.getLastname());
        System.out.println("salary is :" + e1.getSalary());
        System.out.println("name is " + e1.getName());
        System.out.println(" anual salary la:" + e1.getAnnualSalary());
        System.out.printf(e1.raiseSalary(10));
        System.out.println(e1);
    }


}
