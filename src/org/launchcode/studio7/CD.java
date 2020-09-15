package org.launchcode.studio7;

public class CD extends BaseDisc{
    public CD() {
        super();
    }

    public CD(int minRPM, int maxRPM) {
        super(minRPM, maxRPM);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + getMinRPM() + " - " + getMaxRPM() + " RPM");
    }


}
