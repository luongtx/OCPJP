//package collections.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
class Student implements Comparator<Student> {
    private String name;
    private String exam;
 
    public Student() {
        super();
    }
 
    public Student(String name, String exam) {
        this.name = name;
        this.exam = exam;
    }
 
    public int compare(Student s1, Student s2) {
        return s2.name.compareToIgnoreCase(s1.name);
    }
 
    public String toString() {
        return '{' + name + ", " + exam + '}';
    }
}
 
public class ListSort {
    public static void main(String[] args) {
        Student stud1 = new Student("John", "OCA");
        Student stud2 = new Student("Jack", "OCP");
        Student stud3 = new Student("Rob", "OCP");
        List<Student> list = Arrays.asList(stud1, stud2, stud3);
        list.sort(new Student());
        list.forEach(System.out::println);
    }
}
