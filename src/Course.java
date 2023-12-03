public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int oralNote;
    double weightOral;

    /*
    Ödev
    Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için
    ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
     */
    Course(String name, String code, String prefix, int oralNote, double weightOral) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teacher = teacher;
        this.oralNote = oralNote;
        this.weightOral = weightOral;
    }

    void addTeacher(Teacher t) {
        if (t.branch.equals(this.prefix)) {
            System.out.println("Akademisyen başarıyla eklendi");
            this.teacher = t;
        } else {
            System.out.println("Akademisyen bu dersi veremez, branşı değil!");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinizin akademisyeni " + teacher + teacher.name);
        } else {
            System.out.println(this.name + " dersinizin akademisyeni bulunmamaktadır.");
        }
        System.out.println("===========================");
    }
    /*
    Öğrenci Not Sistemi

    Course Sınıfı Özellikleri :
    Nitelikler : name,code,prefix,note,Teacher
    Metotlar : Course() , addTeacher() , printTeacher()

    Ödev
    Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her
    ders için ayrı ayrı belirtin.
    Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.

    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
     */
}
