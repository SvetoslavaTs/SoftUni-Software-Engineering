package ExercisesWorkingWithAbstractions.TrafficLights;

public class TrafficLight {
    private Light light;

    public TrafficLight(Light initialLight) {
        this.light = initialLight;
    }

    public void update() {
        switch (this.light) {
            case RED:
                this.light = Light.GREEN;
                break;
            case GREEN:
                this.light = Light.YELLOW;
                break;
            case YELLOW:
                this.light = Light.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("%s ", this.light);
    }
}
