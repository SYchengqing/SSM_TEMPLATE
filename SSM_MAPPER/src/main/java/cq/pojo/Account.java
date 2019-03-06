package cq.pojo;

public class Account {
    private String name;
    private double money;
    private int id;

    public Account(String name, double money, int id) {
        this.name = name;
        this.money = money;
        this.id = id;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
