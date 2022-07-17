public class IMTProject {
    public double calculate(double mass, double height) {
        double superheight = (height / 100) * (height / 100);
        double vary = mass / superheight;
        return vary;
    }
}
