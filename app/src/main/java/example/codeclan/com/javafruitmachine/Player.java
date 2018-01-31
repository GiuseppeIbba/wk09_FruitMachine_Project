package example.codeclan.com.javafruitmachine;

/**
 * Created by user on 31/01/2018.
 */

public class Player {

    private String name;
    private int credit;

    public Player(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return this.name;
    }

    public int getCredit() {
        return this.credit;
    }
}
