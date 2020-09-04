package JDBC.ANGLE;

public class AngleMain {
    public static void main(String[] args) {

        double x = 45;
        Angle angle = new Angle(x);
        System.out.println("Sin = " + angle.getTheSinValue(x));
        System.out.println("Cos = " + angle.getTheCosValue(x));
        System.out.println("Cot = " + angle.getTheCotValue(x));
        System.out.println("Tan = " + angle.getTheTanValue(x));
        System.out.println("Cosecans = " + angle.getTheCosecansValue(x));
        System.out.println("Secans = " + angle.getTheSecansValue(x));
        System.out.println("Radian = " + angle.getRadian(x));
        System.out.println("Degrees = " + angle.getDegrees(x));

    }
}

