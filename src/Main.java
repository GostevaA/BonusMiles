//public class Main {
//    public static void main(String[] args) {
//        int price = 4500; // стоимость билета
//        int twentyMiles = 20; //
//        int bonusMiles = price / twentyMiles;
//        System.out.println("Бонусные мили: " + bonusMiles);
//
//    }
//}
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}