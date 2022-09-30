import java.util.Scanner;
import java.util.function.Predicate;


public class Predicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        String name=sc.nextLine();
        System.out.println("Ingrese la nota del estudiante");
        double calification=sc.nextDouble();

        Predicate<Student>approved=Student->Student.getCalification()>6;
        Student student1= new Student(name,calification);
        if(approved.test(student1)) System.out.println(name+" is Approved");
        else System.out.println(name+" is reproved");

    }
    static class Student{
        private double calification;
        private String name;

        public Student(String name,double calification){
            this.name=name;
            this.calification=calification;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public double getCalification() {
            return calification;
        }

    }
}
