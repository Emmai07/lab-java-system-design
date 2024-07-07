import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Map to store Student objects with names as keys
        Map<String, Student> studentMap = new HashMap<>();

        // Create some Student objects
        Student student1 = new Student("John Doe", 85);
        Student student2 = new Student("Jane Smith", 92);
        Student student3 = new Student("Michael Johnson", 78);
        Student student4 = new Student("Avinash", 90);

        // Add students to the map
        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(),student4);

        // Increase grades by 10%
        studentMap = increaseGrades(studentMap);

        // Print updated map
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Student student : studentMap.values()) {
            int increasedGrade = (int) Math.round(student.getGrade() * 1.1); // Increase by 10%
            student.setGrade(increasedGrade);
        }
        return studentMap;
    }
}