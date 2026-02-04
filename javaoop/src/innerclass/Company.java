package innerclass;

public class Company {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Kita bisa membuat class di dalam class menggunakan inner class
    // Cara membuat inner class, cukup membuatnya di dalam block class outer class nya

    public static class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
