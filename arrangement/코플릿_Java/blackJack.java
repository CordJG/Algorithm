package 코플릿_Java;
import java.util.*;
import java.util.Arrays;

public class blackJack {
    public static void main(String[] args) {
        int[] cards = {2, 3, 4, 8, 13};
        int sum = 0;

        List<Integer> list = new ArrayList<>();

        int count = 0;
        // 카드를 3장 뽑아 5c3
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int z = j + 1; z < cards.length; z++) {
                    sum = cards[i] + cards[j] + cards[z];
                    list.add(sum);
                }
            }
        }
        int[] sums = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            sums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(sums));
        for (int i = 0; i < sums.length; i++) {
            for (int j = 2; j <= (int) Math.sqrt(sums[i]); j++) {
                if (sums[i] % j == 0) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(sums.length-count);
    }
}

