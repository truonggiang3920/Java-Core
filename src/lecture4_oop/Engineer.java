package lecture4_oop;

import java.util.Scanner;

public class Engineer extends CanBo {
    private String trainingSector;
    public Engineer(String name, String gender, String address, int age, String trainingSector)
    {
        this.trainingSector = trainingSector;
    }
    public Engineer() {}
    public void setTrainingSector(String trainingSector) { this.trainingSector = trainingSector; }
    public String  getTrainingSector() { return trainingSector; }
    Scanner scanner = new Scanner(System.in);

}
