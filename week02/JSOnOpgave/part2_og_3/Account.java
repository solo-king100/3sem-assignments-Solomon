package JSOnOpgave.part2_og_3;

public class Account {
    private String id;
    private int balance;
    private boolean isActive;

    public Account(String id, int balance, boolean isActive) {
        this.id = id;
        this.balance = balance;
        this.isActive = isActive;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


}
