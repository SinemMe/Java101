public class Teacher {
String Name;
String mpno;
String Branch;

Teacher(String Name, String mpno, String Branch){
    this.Name = Name;
    this.mpno = mpno;
    this.Branch = Branch;
}
    void print(){
    System.out.println("Adi: "+ this.Name);
    System.out.println("Telefonu: "+ this.mpno);
    System.out.println("Bölümü: "+ this.Branch);
    }
}
