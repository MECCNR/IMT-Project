public class BmiService {
    public static void main(String[] args) {
        IMTProject service = new IMTProject();
        int mass = 90;
        int height = 180;
        double imt = service.calculate(mass, height);
        System.out.println("Ваш индекс массы тела равен: " + imt);
    }
}

