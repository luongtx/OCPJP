package java_io_n_nio_2.fundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person {
    private String name;
    private int age;
 
    public Person(){}
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}
 
class Student extends Person implements Serializable {
    private String course;
 
    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
 
    public String getCourse() {
        return course;
    }
}
 
public class ParentNotSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stud = new Student("John", 20, "Computer Science");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("stud.ser")));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser")))
        {
            oos.writeObject(stud);
 
            Student s = (Student) ois.readObject();
            System.out.printf("%s, %d, %s", s.getName(), s.getAge(), s.getCourse());
        }
    }
}