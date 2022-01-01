public class Student {
    Course math;
    Course econ;
    Course dataStruct;
    String studentName;
    String studentNo;
    double average;
    int verbalGrade;
    boolean isPass;

    Student (String studentName, String studentNo, Course math, Course econ, Course dataStruct){
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.math = math;
        this.econ = econ;
        this.dataStruct = dataStruct;
        this.average = 0;
        this.verbalGrade = 0;
        this.isPass = false;
    }

    public void addBulkExamNote (int math, int verbalGrade1, int econ, int verbalGrade2, int dataStruct, int verbalGrade3){
        if(math >= 0 && math <= 100 && verbalGrade1 >=0 && verbalGrade1 <= 100){
            this.math.note = math;
            this.math.verbalGrade = verbalGrade1;
        }
        if(econ >= 0 && econ <= 100 && verbalGrade2 >=0 && verbalGrade2 <= 100){
            this.econ.note = econ;
            this.econ.verbalGrade = verbalGrade2;
        }
        if(dataStruct >= 0 && dataStruct <= 100 && verbalGrade3 >=0 && verbalGrade3 <= 100){
            this.dataStruct.note = dataStruct;
            this.dataStruct.verbalGrade = verbalGrade3;
        }
    }
    public void isPass() {
        if (this.math.note == 0 || this.econ.note == 0 || this.dataStruct.note == 0) {
            System.out.println("Invalid note value.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed the class. ");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }
    public void calcAvarage() {
        this.average = ((this.math.note*0.8 + this.math.verbalGrade*0.2)  +
                (this.econ.note*0.8 + this.econ.verbalGrade*0.2) +
                (this.dataStruct.note*0.8 + this.dataStruct.verbalGrade*0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.studentName);
        System.out.println("Math Note : " + this.math.note + " --- Instructor : " + this.math.courseInstructor.name);
        System.out.println("Econ Note : " + this.econ.note + " --- Instructor : " + this.econ.courseInstructor.name);
        System.out.println("Data Structure Note : " + this.dataStruct.note + " --- Instructor : " + this.dataStruct.courseInstructor.name);
    }
}
