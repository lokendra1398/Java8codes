package Java8Features;

import java.util.*;

public class ComparatorWithLambda {
    public static void main(String args[]) {
        // TreeMap with custom comparator (Descending order)
        TreeMap<Integer, String> mp = new TreeMap<>((a, b) -> b - a);

        mp.put(1, "Aryan");
        mp.put(2, "Sunny");
        mp.put(3, "Rahul");

        System.out.println(mp); // Output: {3=Rahul, 2=Sunny, 1=Aryan}

        // Creating Student objects
        Student s1 = new Student("Lok", 123, 1);
        Student s2 = new Student("Var", 142, 2);
        Student s3 = new Student("Bal", 3221, 3);

        List<Student> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        // Sorting Students by ID in descending order using Stream
        List<Student> l2 = l1.stream()
                .sorted(Comparator.comparingInt(Student::getId).reversed())
                .toList();
        //yha comparator bhi use karsakte the
//        Collections
//        .sort(l1, (a,b)-> b.id - a.id);
//        alternate for this

        System.out.println(l2); // Print sorted list
    }

    // Student class
    static class Student {
        String name;
        int rollno;
        int id;

        public Student(String name, int rollno, int id) {
            this.name = name;
            this.rollno = rollno;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", rollno=" + rollno + ", id=" + id + "]";
        }
    }
}