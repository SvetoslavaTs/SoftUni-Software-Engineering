package ExercisesDefiningClasses.RawData;

public class Tire {
    double tire1Pressure;
    int Tire1Age;
    double Tire2Pressure;
    int Tire2Age;
    double Tire3Pressure;
    int Tire3Age;
    double Tire4Pressure;
    int Tire4Age;

    public Tire(double tire1Pressure, int tire1Age,
                double tire2Pressure, int tire2Age,
                double tire3Pressure, int tire3Age,
                double tire4Pressure, int tire4Age) {
        this.tire1Pressure = tire1Pressure;
        Tire1Age = tire1Age;
        Tire2Pressure = tire2Pressure;
        Tire2Age = tire2Age;
        Tire3Pressure = tire3Pressure;
        Tire3Age = tire3Age;
        Tire4Pressure = tire4Pressure;
        Tire4Age = tire4Age;
    }

    public double getTire1Pressure() {
        return tire1Pressure;
    }

    public int getTire1Age() {
        return Tire1Age;
    }

    public double getTire2Pressure() {
        return Tire2Pressure;
    }

    public int getTire2Age() {
        return Tire2Age;
    }

    public double getTire3Pressure() {
        return Tire3Pressure;
    }

    public int getTire3Age() {
        return Tire3Age;
    }

    public double getTire4Pressure() {
        return Tire4Pressure;
    }

    public int getTire4Age() {
        return Tire4Age;
    }

    public void setTire1Pressure(double tire1Pressure) {
        this.tire1Pressure = tire1Pressure;
    }

    public void setTire1Age(int tire1Age) {
        Tire1Age = tire1Age;
    }

    public void setTire2Pressure(double tire2Pressure) {
        Tire2Pressure = tire2Pressure;
    }

    public void setTire2Age(int tire2Age) {
        Tire2Age = tire2Age;
    }

    public void setTire3Pressure(double tire3Pressure) {
        Tire3Pressure = tire3Pressure;
    }

    public void setTire3Age(int tire3Age) {
        Tire3Age = tire3Age;
    }

    public void setTire4Pressure(double tire4Pressure) {
        Tire4Pressure = tire4Pressure;
    }

    public void setTire4Age(int tire4Age) {
        Tire4Age = tire4Age;
    }
}
