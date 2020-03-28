package lecture4_oop;

public class Staff extends CanBo {
    private String  work;
    public Staff (String name, String gender, String address, int age, String work)
    {
        this.work = work;
    }
    public Staff() {}
    public void setWork(String work) {this.work = work;}
    public String getWork() {return work;}
}
