package codingTest.silver.sort;

import java.io.*;
import java.util.*;

/**
 * Comparable 활용 문제
 * 숙달필요
 */
public class Bj10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members.add(new Member(age, name));
        }

        Collections.sort(members);

        for (Member member : members) {
            bw.write(member.getAge() + " " + member.getName() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }


    static class Member implements Comparable<Member> {
        private int age;
        private String name;


        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Member other) {
            if (this.age == other.age) {
                return 0;
            } else {
                return Integer.compare(this.age, other.age);
            }
        }
    }
}
