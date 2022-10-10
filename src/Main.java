public class Main {
    public static void main(String[] args) {
        double mass = 60;
        double height = 1.55;

        BmiService service = new BmiService();
        double imt = service.calculate(mass, height);
        System.out.print("Ваш ИМТ: ");
        System.out.printf("%.1f",imt);
    }
}