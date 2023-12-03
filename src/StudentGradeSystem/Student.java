public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course müzik;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course müzik) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.müzik = müzik;

    }

    void addBulkExamNote(int mat, int fizik, int müzik) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (müzik >= 0 && müzik <= 100) {
            this.müzik.note = müzik;
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.müzik.note == 0 || this.mat.oralNote == 0 || this.fizik.oralNote == 0 || this.müzik.oralNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    void calcAverage() {
        this.average = (((this.mat.oralNote * this.mat.weightOral + this.mat.note * (1 - this.mat.weightOral))) + ((this.fizik.oralNote * this.fizik.weightOral + this.fizik.note * (1 - this.fizik.weightOral))) + ((this.müzik.oralNote * this.müzik.weightOral + this.müzik.note * (1 - this.müzik.weightOral)))) / 3;
    }

    void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.müzik.note);
    }
    /*
        Student Sınıfı Özellikleri :
    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
     */
}
