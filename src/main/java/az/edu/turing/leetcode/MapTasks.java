package az.edu.turing.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTasks {

    public static void nameAndAge() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jord", 24);
        map.put("Malina", 25);
        map.put("Furky", 22);
        map.put("Julia", 30);
        map.put("Helen", 21);

        System.out.println("Age due name: " + map.get("Furky"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "." + entry.getValue());
        }

    }

    public static void studentInfo() {
        Map<String, List<Integer>> studentInfo = new HashMap<>();
        studentInfo.put("Robert", Arrays.asList(71, 75));
        studentInfo.put("David", Arrays.asList(84, 76));
        studentInfo.put("Daniel", Arrays.asList(75, 84));

        String topStudent = null;
        double maxAverage = 0;

        for (Map.Entry<String, List<Integer>> entry : studentInfo.entrySet()) {
            String studentName = entry.getKey();
            List<Integer> grades = entry.getValue();

            double totalGrades = 0;
            for (Integer grade : grades) {
                totalGrades += grade;
            }
            double average = totalGrades / grades.size();
            System.out.println(studentName + ": " + average);

            if (average > maxAverage) {
                maxAverage = average;
                topStudent = studentName;
            }
        }
        System.out.println("Top Student with Max Average: " + topStudent + ": " + maxAverage);
    }
}
