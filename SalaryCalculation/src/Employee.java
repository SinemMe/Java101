public class Employee  {
    String name;
    int workHours;
    int hireYear;
    double salary ;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.salary = salary;

    }

        double tax() {

            if (this.salary <= 1000) {
                return this.salary * 0;

            }
            else {
               return (this.salary / 100) * 3;

            }
        }
         double bonus() {
            if (this.workHours > 40) {
                return (this.workHours - 40) * 30;
            } else {
                return 0;
            }
        }
        double raiseSalary() {
            int year = 2021 - hireYear;
            if (year < 10) {
                return this.salary  * 0.05;
            } else if (year > 9 && year < 20) {
                return this.salary * 0.10;
            } else
                return this.salary * 0.15;

        }
    void ToString() {
                System.out.println("Adi: " + this.name);
                System.out.println("Maasi: " + this.salary);
                System.out.println("Calisma Saati: " + this.workHours);
                System.out.println("Baslangic yili: " + hireYear);
                System.out.println("Vergi: " + tax());
                System.out.println("Bonus: " + bonus());
                System.out.println("Maas Artisi: " + raiseSalary());
                System.out.println("Vergi ve Bonuslar ile birlikte maas: " + (this.salary - tax() + bonus()));
                System.out.println("Toplam Maas: " + (this.salary + bonus() + raiseSalary() - tax()));
            }

            }

