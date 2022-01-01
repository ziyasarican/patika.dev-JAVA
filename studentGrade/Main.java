public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics","MAT101","MATH");
        Course econ = new Course ("Economy","ECON101","ECON");
        Course dataStruct = new Course("Data Structure","DT101","DT");

        Instructor mathInstructor = new Instructor("Archimedes", "..@math.com","MATH");
        Instructor econInstructor = new Instructor("W.Buffet","..@econ.com","ECON");
        Instructor dataStructInstructor = new Instructor("Alex","..@dt.com","DT");

        math.addTeacher(mathInstructor);
        econ.addTeacher(econInstructor);
        dataStruct.addTeacher(dataStructInstructor);

        Student s1 = new Student("Ziya","188",math,econ,dataStruct);
        s1.addBulkExamNote(80,80,100,100,90,90);
        s1.isPass();

        Student  s2 = new Student ("Veli","123",math,econ,dataStruct);
        s2.addBulkExamNote(80,80,80,90,80,90);
        s2.isPass();

        Student s3 = new Student("Sophia","221",math,econ,dataStruct);
        s3.addBulkExamNote(10,23,12,41,32,12);
        s3.isPass();
    }
}
