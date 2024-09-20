public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca,","000", "TRH");
        Teacher t2= new Teacher("Graham Bell", "0000", "FZK");
        Teacher t3= new Teacher("Külyutmaz", "1111", "BIO");

        Course tarih = new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "303", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyiloji", "101","BIO");
        biyo.addTeacher(t3);

       Student s1 = new Student("Saban Güler", "123", "4", tarih,fizik,biyo);
       s1.addBulkExamNote(100,78,50);
       s1.isPass();

       Student s2 = new Student("Can Caner", "444","4", tarih,fizik,biyo);
       s2.addBulkExamNote(80,50,90);
       s2.isPass();
    }
}