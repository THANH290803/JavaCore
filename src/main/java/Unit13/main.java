package Unit13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String args[]) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter employee name: ");
        String name = in.readLine();
        System.out.print("Enter employee salary: ");
        double salary = Double.parseDouble(in.readLine());
        System.out.print("Enter employee revenue: ");
        double revenue = Double.parseDouble(in.readLine());
        System.out.print("Enter the function U want to test 1 or 2: ");
        int tc = Integer.parseInt(in.readLine());
        System.out.println("OUTPUT:");
        if(tc == 1) {
            Employee m = new Employee(name, salary);
            System.out.println(m);
            m = new Seller(name, revenue, salary);
            System.out.println(m);
        }
        else if(tc == 2) {
            Seller b = new Seller(name, revenue, salary);
            System.out.println("name: "+name+"- salary: "+b.getSalary());
        }
    }
}
