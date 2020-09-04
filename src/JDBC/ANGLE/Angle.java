package JDBC.ANGLE;

public class Angle {
    private double x = Math.toRadians(0);

    public Angle(double x) {
        this.x = x;
    }

    public double getTheSinValue(double x) {
        return Math.sin(x);
    }

    public double getTheCosValue(double x) {
        return Math.cos(x);
    }

    public double getTheTanValue(double x) {
        return Math.tan(x);
    }

    public double getTheCotValue(double x) {
        return Math.tan(x);
    }

    public double getTheSecansValue(double x) {
        return Math.cos(x);
    }

    public double getTheCosecansValue(double x) {
        return Math.sin(x);
    }

    public double getRadian(double x) {
        return Math.toRadians(x);
    }

    public double getDegrees(double x) {
        return Math.toDegrees(x);
    }

    @Override
    public String toString() {
        return "Angle{" +
                "x =" + x + "°" + " ' " + " '' " +
                '}';
    }

    public Angle(int a, int b, int c) {

    }

}


