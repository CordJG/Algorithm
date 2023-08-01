package 연습.연습6;

public class CordJgEx {
    public static void main(String[] args) {

        Sum sum= new Sum();

        System.out.println(sum.sum("슬램","덩크"));
    }

    static class Sum {
        public Object sum(Object x, Object y) {


            String xy = ((String) x).concat((String) y);

            return xy;


        }
    }
}
