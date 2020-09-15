package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvd = new DVD(570,1600);
        CD cd = new CD(200,500);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        dvd.spinDisc();
        dvd.stopDisc();
        dvd.discRead();
        dvd.discWrite();
        cd.spinDisc();
        cd.stopDisc();
        dvd.discRead();
        dvd.discWrite();

    }
}
