package Example;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedComparison {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        double startTime;
        double endTime;

        // 순차적인 추가
        System.out.println("--------------------------------------------------");
        startTime = System.nanoTime();
        for (int i = 0; i < 30_000_000; i++) arrayList.add(i);
        endTime = System.nanoTime();
        System.out.println("순차적인 추가 - ArrayList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");

        startTime = System.nanoTime();
        for (int i = 0; i < 30_000_000; i++) linkedList.add(i);
        endTime = System.nanoTime();
        System.out.println("순차적인 추가 - LinkedList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");
        System.out.println("--------------------------------------------------");

        // 순차적인 삭제
        System.out.println("--------------------------------------------------");
        startTime = System.nanoTime();
        for (int i = 29_999_999; i > 15_000_000; i--) arrayList.remove(i);
        endTime = System.nanoTime();
        System.out.println("순차적인 삭제 - ArrayList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");

        startTime = System.nanoTime();
        for (int i = 29_999_999; i > 15_000_000; i--) linkedList.remove(i);
        endTime = System.nanoTime();
        System.out.println("순차적인 삭제 - LinkedList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");
        System.out.println("--------------------------------------------------");

        // 중간 데이터 삭제
        System.out.println("--------------------------------------------------");
        startTime = System.nanoTime();
        arrayList.remove(10);
        endTime = System.nanoTime();
        System.out.println("중간 데이터 삭제 - ArrayList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");

        startTime = System.nanoTime();
        linkedList.remove(10);
        endTime = System.nanoTime();
        System.out.println("중간 데이터 삭제 - LinkedList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");
        System.out.println("--------------------------------------------------");

        // 중간 데이터 추가
        System.out.println("--------------------------------------------------");
        startTime = System.nanoTime();
        arrayList.add(10, 10);
        endTime = System.nanoTime();
        System.out.println("중간 데이터 추가 - ArrayList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");

        startTime = System.nanoTime();
        linkedList.add(10, 10);
        endTime = System.nanoTime();
        System.out.println("중간 데이터 추가 - LinkedList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");
        System.out.println("--------------------------------------------------");

        // 데이터 검색
        System.out.println("--------------------------------------------------");
        startTime = System.nanoTime();
        arrayList.get(10_000_000);
        endTime = System.nanoTime();
        System.out.println("데이터 검색 - ArrayList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");

        startTime = System.nanoTime();
        linkedList.get(10_000_000);
        endTime = System.nanoTime();
        System.out.println("데이터 검색 - LinkedList : " + Math.round((endTime - startTime) / 1000000 * 100) / 100.0 + "ms");
        System.out.println("--------------------------------------------------");
    }
}