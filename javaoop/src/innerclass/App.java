package innerclass;

public class App {

    static void main() {
        Company company = new Company();

        company.setName("Matursoft");
        System.out.println(company.getName());

        Company.Employee employee = new Company.Employee();
        employee.setName("Tomy W");
        System.out.println(employee.getName());
    }

}
