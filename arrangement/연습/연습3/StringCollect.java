package 연습.연습3;
import java.util.*;
import java.util.stream.*;

public class StringCollect {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("이재관", 100, Student.Gender.Male),
                new Student("박해커", 80, Student.Gender.Male),
                new Student("이자바", 90, Student.Gender.Female),
                new Student("나미녀", 60, Student.Gender.Female)
        );

        // 스트림 연산 결과를 Map으로 반환
        Map<String, Integer> maleMap = totalList.stream()
                .filter(s -> s.getGender() == Student.Gender.Male)
                .collect(Collectors.toMap(
                        student -> student.getName(),
                        student -> student.getScore()
                ));
        System.out.println(maleMap);
    }

}

class Student{
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }
}
