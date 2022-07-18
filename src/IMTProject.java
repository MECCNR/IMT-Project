public class IMTProject {
    public double calculate(double mass, double height) {
        double superHeight = (height / 100) * (height / 100);
        return mass / superHeight;
    }
}
