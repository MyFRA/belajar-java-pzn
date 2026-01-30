package importpackage;

import polymorphism.Employee;

public class App {

    //  Import adalah kemampuan untuk menggunakan class yang berada di package berbeda
    //  Syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus publik

    static void main() {
        Employee employee = new Employee("Tomy");

        System.out.println(employee.name);
    }

}
