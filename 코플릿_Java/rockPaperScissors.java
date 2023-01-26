package 코플릿_Java;
import java.util.*;

public class rockPaperScissors {
    public static void main(String[] args) {
        int rounds =2;

        ArrayList<String[]> outcomes = new ArrayList<>();

        System.out.println(permutation(rounds, new String[]{}, outcomes));
    }


    public static ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {

        if(roundsToGo == 0) {
            outcomes.add(playedSoFar);
            return outcomes;
        }

        String[] rps = new String[]{"rock", "paper", "scissors"};

        // rps 배열을 한 번씩 순회합니다.
        for(int i = 0; i < rps.length; i++) {

            String currentPlay = rps[i];


            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);
            concatArray[concatArray.length - 1] = currentPlay;

            System.out.println(Arrays.toString(concatArray));


            outcomes = permutation(roundsToGo - 1, concatArray, outcomes);
        }

        // outcomes를 반환합니다.
        return outcomes;

    }
}
