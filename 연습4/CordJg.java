package 연습4;

import java.sql.SQLOutput;

enum Animals {
        MONKEY,
        DOG,
        CAT
    }

    public class CordJg{
        public static void main(String[] args) {
            Animals animals = Animals.CAT;

            Animals[] setAnimals = Animals.values();
            for(Animals a : setAnimals)
            {
                System.out.printf("%s = %d %n", a.name(), a.ordinal());
            }

            Animals dogNum1 = Animals.DOG;
            Animals dogNum = Animals.valueOf("DOG");
            System.out.println(dogNum1);
            System.out.println(dogNum);
            System.out.println(Animals.MONKEY == Animals.valueOf("MONKEY"));

            System.out.println(dogNum.compareTo(Animals.CAT));

            switch(animals) {
                case MONKEY:
                    System.out.println("원숭이");
                    break;
                case DOG:
                    System.out.println("개");
                    break;
                case CAT:
                    System.out.println("고양이");
                    break;


            }
        }
    }

