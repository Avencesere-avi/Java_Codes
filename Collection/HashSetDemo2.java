package Collection;

import java.util.Objects;

class Student
{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj ) {
        Student other = (Student)obj;
        if (this.name == other.name)
            return true;
       else
           return false;

        // type casting of the argument.


        // comparing the state of argument with
        // the state of 'this' Object
//        if (marks != other.marks)
//            return false;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        }
//        else if (!name.equals(other.name))
//            return false;


//        if (this == o) return true;
//        if (!(o instanceof Student student)) return false;
//        return Objects.equals(name, student.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class HashSetDemo2 {

    public static void main(String[] args) {
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Xyz");
        Student s3 = new Student("Ravi");


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


    }
}
