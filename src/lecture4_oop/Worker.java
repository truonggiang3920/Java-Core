package lecture4_oop;

public class Worker extends CanBo {
    private int rank;
    public Worker(String name, String gender, String address, int age, int rank)
    {
        this.rank = rank;
    }

    public Worker() {

    }

    public void setRank(int rank) { this.rank = rank; }
    public int getRank() { return rank; }
}
