package homework12;

public class Crystal {
    private Integer red;
    private Integer white;
    private final Integer LIMIT_OF_VALUE = 50;

    public Crystal() {
        this.red = 0;
        this.white = 0;
    }

    public synchronized void addRed(int amount) {
        red += amount;
    }

    public synchronized void addWhite(int amount) {
        white += amount;
    }

    public synchronized boolean isEnough() {
        return red >= LIMIT_OF_VALUE && white >= LIMIT_OF_VALUE;
    }

    public Integer getRed() {
        return red;
    }

    public Integer getWhite() {
        return white;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }
}
