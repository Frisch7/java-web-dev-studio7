package org.launchcode.studio7;

public class DVD extends BaseDisc{
    public DVD() {
        super();
    }

    public DVD(int minRPM, int maxRPM) {
        super(minRPM, maxRPM);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + getMinRPM() + " - " + getMaxRPM() + " RPM");
    }


}
