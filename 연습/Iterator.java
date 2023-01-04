package 연습;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = {"love", "money"};
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String str = iterator.next();
        }
    }
}
