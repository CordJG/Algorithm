package codingTest;

public class CalculateGrade {
    public static void main(String[] args) {

        double a = Math.pow(0.995, 100);
        int result = (int) Math.floor(175 * (1 - a));
        int objectCount = findN(60);
        System.out.println(result);
        System.out.println(objectCount);
    }

    static int findN(int n) {
        int count=1;
        double a = Math.pow(0.995, count);
        int result = (int) Math.floor(175 * (1 - a));
        while (result<n) {
            count++;
            a=Math.pow(0.995, count);
            result = (int) Math.floor(175 * (1 - a));
        }
        return count;
    }
}
