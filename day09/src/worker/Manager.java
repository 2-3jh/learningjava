package worker;

public class Manager  extends Worker{
    int managerWage;

    public Manager(String id, String name, int wage, int managerWage) {
        super(id, name, wage);
        this.managerWage = managerWage;
    }

    public Manager(int managerWage) {
        this.managerWage = managerWage;
    }
}
