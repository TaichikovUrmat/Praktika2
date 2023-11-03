import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Urmat", 19, "java");
        Student student2 = new Student("Isa", 16, "java");
        Student student3 = new Student("Kuba", 22, "java");
        Student student4 = new Student("Kanat", 14, "JS");
        Student student5 = new Student("Samat", 125, "JS");

        Student[] students = {student1, student2, student3, student4, student5};
        int countJava = 0;
        int countJS = 0;
        int summ = 0;

        for (Student student : students) {
            summ += student.age;
            if (student.group.equals("java")) {
                countJava++;
            } else {
                countJS++;
            }
        }
        int result = summ / students.length;

        System.out.println("java: " + countJava);
        System.out.println(" JS " + countJS);
        System.out.println("Resultat:" + result);

    }
}