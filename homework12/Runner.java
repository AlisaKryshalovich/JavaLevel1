package homework12;

public class Runner {
    public static void main(String[] args) {
        Crystal crystals = new Crystal();
        MageGroup fireMages = new MageGroup("Fire Mages", crystals);
        MageGroup airMages = new MageGroup("Air Mages", crystals);

        fireMages.start();
        airMages.start();

        try {
            fireMages.join();
            airMages.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
