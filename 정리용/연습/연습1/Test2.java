package 연습.연습1;

public class Test2 {
        public static void main(String[] args) {
            CozStudents cozStudents = new CozStudents(1,2,3);




            cozStudents.averageAge = 29;
            System.out.println("코드스테이츠 이번 기수 수강생들의 평균 나이는 " + cozStudents.averageAge + "살입니다.");

            nextGeneration(cozStudents.averageAge);
            System.out.println("최종적인 다음 기수 수강생들의 평균 나이는 " + cozStudents.averageAge + "살입니다.");

        }

        static void nextGeneration(int averageAge) {
            averageAge = 30;
            System.out.println("다음 기수 수강생들의 평균 나이는 " + averageAge + " 살입니다.");
        }
    }

    class CozStudents {
        int averageAge;
        int b;

        public void wow(double b){
            System.out.printf("나의 나이는 %s 이다.",b);
        }
                 CozStudents(int x, int y, int b){
                this.b=b;
                System.out.printf("이게뭐람 %d %d %d\n",x,y,b);

            }

    }


