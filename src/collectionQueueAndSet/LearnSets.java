package collectionQueueAndSet;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

class Student {
    private final int rollNo;
    private final String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + "'" +
                '}';
    }
}

public class LearnSets {
    public static void main(String[] args) {
        demonstrateSimpleSet();
        demonstrateHashSet();
        demonstrateTreeSet();
    }

    private static void demonstrateSimpleSet() {
        Set<String> simpleSet = new HashSet<>();
        simpleSet.add("Apple");
        simpleSet.add("Banana");
        simpleSet.add("Cherry");
        simpleSet.add("Apple"); // Duplicate

        System.out.println("Simple HashSet: " + simpleSet);
    }

    private static void demonstrateHashSet() {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Mritunjay"));
        studentSet.add(new Student(1, "Mritunjay")); // Duplicate based on rollNo
        studentSet.add(new Student(1, "Hritik"));    // Duplicate based on rollNo

        System.out.println("HashSet of Students: " + studentSet);
    }

    private static void demonstrateTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(30); // Duplicate
        treeSet.add(90);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.remove(50);

        System.out.println("TreeSet of Integers: " + treeSet);
        System.out.println("TreeSet contains 90: " + treeSet.contains(90));
    }
}
