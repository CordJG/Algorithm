package 연습.Practice;
import java.util.*;
import java.util.stream.*;

public class JgStream4 {
    public static void main(String[] args) {

        List<Pet> list = Arrays.asList(
                new Pet("고양이", 2, Pet.Gender.Female),
                new Pet("강아지", 5, Pet.Gender.Male),
                new Pet("앵무새", 1, Pet.Gender.Female),
                new Pet("햄스터", 3, Pet.Gender.Female)
        );

        Map<String, Integer> map = list.stream().filter(a -> a.getAge()>1 && a.getGender()==Pet.Gender.Female)
                .collect(Collectors.toMap(
                        b->b.getKind(), b->b.getAge()
                ));

        System.out.println(map);

    }
}


class Pet {
    public enum Gender {Male, Female};
    private String kind;
    private int age;
    private Gender gender;

    public Pet(String kind, int age, Gender gender) {
        this.kind = kind;
        this.age = age;
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}