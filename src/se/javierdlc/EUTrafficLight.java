package se.javierdlc;

public class EUTrafficLight implements TrafficLight {
    private boolean red;
    private boolean yellow;
    private boolean green;
    private TrafficLightState state;

    public EUTrafficLight() {
        this.state = TrafficLightState.START;
    }

    @Override
    public void tick() {
        switch (state){
            case START:
                red = false;
                yellow = false;
                green = false;
                state = TrafficLightState.GREEN;
                break;
            case GREEN:
                red = false;
                yellow = false;
                green = true;
                state = TrafficLightState.YELLOW;
                break;
            case YELLOW:
                red = false;
                yellow = true;
                green = false;
                state = TrafficLightState.RED;
                break;
            case RED:
                red = true;
                yellow = false;
                green = false;
                state = TrafficLightState.RED_YELLOW;
                break;
            case RED_YELLOW:
                red = true;
                yellow = true;
                green = false;
                state = TrafficLightState.GREEN;
                break;
            default:
                red = false;
                yellow = false;
                green = false;
                state = TrafficLightState.STOP;
                break;
        }
    }

    @Override
    public boolean getGreenLight() {
        return green;
    }

    @Override
    public boolean getYellowLight() {
        return yellow;
    }

    @Override
    public boolean getRedLight() {
        return red;
    }
}
