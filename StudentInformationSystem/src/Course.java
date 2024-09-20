public class Course {
    Teacher teacher;
    String Name;
    String Code;
    String Prefix;
    int note;

    Course(String Name, String Code, String Prefix) {
        this.Name = Name;
        this.Code = Code;
        this.Prefix = Prefix;
        int note = 0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.Branch.equals(this.Prefix)){
        this.teacher = teacher;
    }else {
            System.out.println("Ögretmen ve Ders bölümleri uyusmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
