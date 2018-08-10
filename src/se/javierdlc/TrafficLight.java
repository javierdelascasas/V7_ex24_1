package se.javierdlc;

public interface TrafficLight {
    // Move the traffic light one step forward
    void tick();

    boolean getGreenLight();

    boolean getYellowLight();

    boolean getRedLight();
}
