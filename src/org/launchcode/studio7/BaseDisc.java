package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisk{
    int capacityBytes;
    String name;
    int maxRPM;
    int minRPM;

    public BaseDisc(){

    }
    public BaseDisc(int minRPM, int maxRPM){
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
    }
    @Override
    public void stopDisc() {
        System.out.println("Disc Stopped");
    }

    //Getters and Setters
    public int getCapacityBytes() {
        return capacityBytes;
    }

    @Override
    public void discWrite() {
        System.out.println("Writing to disc");
    }

    @Override
    public void discRead() {
        System.out.println("Reading disc");

    }

    public void setCapacityBytes(int capacityBytes) {
        this.capacityBytes = capacityBytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }

    public int getMinRPM() {
        return minRPM;
    }

    public void setMinRPM(int minRPM) {
        this.minRPM = minRPM;
    }
}
