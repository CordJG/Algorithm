package diary.write;

public class Retrospect {

    private int num;
    private String retro;

    private Retrospect(int num, String retro){
        this.num = num;
        this.retro = retro;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setPlan(String retro) {
        this.retro = retro;
    }
}
