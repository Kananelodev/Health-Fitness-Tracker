package za.co.kani;

public class HealthApp {

    public static void main(String[] args) {

        Health myStats = new Health();


        myStats.addSteps(500);
        myStats.updateHeartRate(120);

        System.out.println(myStats.summary());
    }
}
