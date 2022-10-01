import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> CourseList=new LinkedList<>(){
            {
                add("Java.");
                add("Python.");
                add("Git.");
            }
        };
        for (String course:CourseList){
            byte i =1;
            String newCourseName=course.toUpperCase().replace(".","!");
            System.out.println("Curso:"+newCourseName);
            i++;
        }

        Stream<String> courseStream= Stream.of(
                "Java","Python","Git"
        );
        Stream<String>emphasisCourses=courseStream.map(course->course+"!");
        Stream<String>justJavaCourses=emphasisCourses.filter(course->course.contains("Java"));
        justJavaCourses.forEach(System.out::println);

        Stream<String>coursesStream2=CourseList.stream();

        coursesStream2
                .map(course->course+"!!")
                .filter(course->course.contains("Java"))
                .forEach(System.out::println);
    }
}
