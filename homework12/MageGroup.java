package homework12;

import java.util.Random;

public class MageGroup extends Thread {
    private String name;
    private Crystal crystals;
    private static Random RANDOM = new Random();
    private Integer collectedRed = 0;
    private Integer collectedWhite = 0;
    private final Integer bound = 4;
    private final Integer additionalBound = 2;
    private final Integer simulateOneDay = 1000;

    public MageGroup(String name, Crystal crystals) {
        this.name = name;
        this.crystals = crystals;
    }

    @Override
    public void run() {
        while (!crystals.isEnough()) {
            int dailyRedCrystal = RANDOM.nextInt(bound) + additionalBound;
            int dailyWhiteCrystal = RANDOM.nextInt(bound) + additionalBound;
            crystals.addRed(dailyRedCrystal);
            crystals.addWhite(dailyWhiteCrystal);

            int totalLoadCrystal = RANDOM.nextInt(bound) + additionalBound;
            int loadRedCrystal = RANDOM.nextInt(totalLoadCrystal);
            int loadWhiteCrystal = totalLoadCrystal - loadRedCrystal;

            collectedRed += loadRedCrystal;
            collectedWhite += loadWhiteCrystal;

            System.out.println(name + " collected: " + loadRedCrystal + " red and " + loadWhiteCrystal + " white crystals.");
            try {
                Thread.sleep(simulateOneDay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " wins!");
    }
}
