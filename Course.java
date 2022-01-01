public class Course {
    Instructor courseInstructor;
    String name;
    String code;
    String prefix;
    int note;
    int verbalGrade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalGrade = 0;
    }

    public void addTeacher(Instructor t) {
        if (this.prefix.equals(t.branch)) {
            this.courseInstructor = t;
            System.out.println(this.courseInstructor.name+" is assigned to the "+t.branch+" course.");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseInstructor != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseInstructor.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}