public class IMTProject {
    public double calculate(double mass, double height) {
        double superHeight = (height / 100) * (height / 100);
        double vary = mass / superHeight;
        return vary;
    }
}
