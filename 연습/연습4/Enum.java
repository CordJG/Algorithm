package 연습.연습4;

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public class Enum{
        public static void main(String[] args) {
            Level level = Level.MEDIUM;

            Level[] allLevels = Level.values();
            for(Level x : allLevels) {
                System.out.printf("%s = %d %n", x.name(), x.ordinal());
            }

            Level findLevel = Level.valueOf("LOW");
            System.out.println(findLevel);
            System.out.println(Level.LOW == Level.valueOf("LOW"));

            System.out.println(level.compareTo(Level.HIGH));

            switch(level) {
                case LOW:
                    System.out.println("낮은 레벨");
                    break;
                case MEDIUM:
                    System.out.println("중간 레벨");
                    break;
                case HIGH:
                    System.out.println("높은 레벨");
                    break;


        }
    }
}
