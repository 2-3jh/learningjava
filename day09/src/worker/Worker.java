package worker;

public class Worker {
    private String id, name;
    private int wage;

    public Worker() {
    }

    public Worker(String id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void work() {
    }

    public void eat() {
        System.out.println("吃米饭");
    }
}
