public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer("Иван", 25, 150000, 35);
        p.checkOvertime();
        p.checkLevel("Senior");

        Accountant a = new Accountant("Мария", 40, 90000, 101);
        a.printDuties();
        a.checkWorkload(10);

        Lawyer l = new Lawyer("Петр", 30, 120000, "Олег, Анна, Дмитрий");
        l.processClients();
    }
}


class Programmer {
    String name; int age; double salary; int hours;
    Programmer(String n, int a, double s, int h) { name=n; age=a; salary=s; hours=h; }
    void checkOvertime() {
        if (hours < 40) System.out.println(name + " может взять подработку");
    }
    void checkLevel(String lvl) {
        if (lvl.equalsIgnoreCase("Senior")) System.out.println(name + " имеет самую большую зп");
    }
}

class Accountant {
    String name; int age; double salary; int actNum;
    Accountant(String n, int a, double s, int act) { name=n; age=a; salary=s; actNum=act; }
    void printDuties() {
        System.out.println(name + " занимается финансами");
    }
    void checkWorkload(int h) {
        if (h <= 8) System.out.println(name + " обычная нагрузка");
        else System.out.println(name + " высокая нагрузка");
    }
}

class Lawyer {
    String name; int age; double salary; String clients;
    Lawyer(String n, int a, double s, String c) { name=n; age=a; salary=s; clients=c; }
    void processClients() {
        String[] arr = clients.split(",\\s*");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Текущий клиент: " + arr[i]);
        }
    }
}