import java.util.*;

public class Generator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> cars = new ArrayList<>();
        String [] carBrand = new String[]{"Volkswagen", "Mercedes", "Alfa Romeo", "Bentley", "Moscvitch", "Lada", "Nissan", "Peugeot", "Rolls-Royce", "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Audi", "Hyundai", "Kia", "Subaru", "Mazda", "Fiat", "Renault", "Skoda", "Volvo", "Jaguar", "Land Rover", "Porsche", "Tesla", "Mitsubishi", "Suzuki", "Citroen"};
        Arrays.sort(carBrand);
        Map<String, String> regionalCodeOfCarNumber = new HashMap<>();
        regionalCodeOfCarNumber.put("A", "София - столица");
        regionalCodeOfCarNumber.put("B", "Бургас");
        regionalCodeOfCarNumber.put("BH", "Бяла");
        regionalCodeOfCarNumber.put("BP", "Благоевград");
        regionalCodeOfCarNumber.put("BT", "Батак");
        regionalCodeOfCarNumber.put("EB", "Елена");
        regionalCodeOfCarNumber.put("EBE", "Елена");
        regionalCodeOfCarNumber.put("EBO", "Елена");
        regionalCodeOfCarNumber.put("HK", "Хасково");
        regionalCodeOfCarNumber.put("HM", "Хумата");
        regionalCodeOfCarNumber.put("KB", "Кубрат");
        regionalCodeOfCarNumber.put("KK", "Карлово");
        regionalCodeOfCarNumber.put("KH", "Кърджали");
        regionalCodeOfCarNumber.put("KK", "Кюстендил");
        regionalCodeOfCarNumber.put("KP", "Копривщица");
        regionalCodeOfCarNumber.put("M", "Монтана");
        regionalCodeOfCarNumber.put("MO", "Монтана");
        regionalCodeOfCarNumber.put("OH", "Охрид");
        regionalCodeOfCarNumber.put("PA", "Панагюрище");
        regionalCodeOfCarNumber.put("PB", "Плевен");
        regionalCodeOfCarNumber.put("PK", "Първомай");
        regionalCodeOfCarNumber.put("PX", "Пловдив");
        regionalCodeOfCarNumber.put("RT", "Русе");
        regionalCodeOfCarNumber.put("SO", "София - област");
        regionalCodeOfCarNumber.put("ST", "Стара Загора");
        regionalCodeOfCarNumber.put("T", "Търговище");
        regionalCodeOfCarNumber.put("TP", "Троян");
        regionalCodeOfCarNumber.put("XA", "Хвърчил");
        regionalCodeOfCarNumber.put("XA", "Хвърчил");
        regionalCodeOfCarNumber.put("XA", "Хвърчил");
        regionalCodeOfCarNumber.put("YA", "Ямбол");

        int numberOfCars = 10;
        System.out.println("Cars number: " + numberOfCars);
        //int numberOfCars = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter < numberOfCars) {
            int randomNumber = random.nextInt(carBrand.length);

            if (!cars.contains(carBrand[randomNumber])) {
                cars.add(carBrand[randomNumber]);
                counter++;
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("%d %s\n", i + 1, cars.get(i));
        }

        /*A: София - столица
        B: Бургас
        BH: Бяла
        BP: Благоевград
        BT: Батак
        EB: Елена
        EBE: Елена
        EBO: Елена
        HK: Хасково
        HM: Хумата
        KB: Кубрат
        KK: Карлово
        KH: Кърджали
        KK: Кюстендил
        KP: Копривщица
        M: Монтана
        MO: Монтана
        OH: Охрид
        PA: Панагюрище
        PB: Плевен
        PK: Първомай
        PX: Пловдив
        RT: Русе
        SO: София - област
        ST: Стара Загора
        T: Търговище
        TP: Троян
        XA: Хвърчил
        XA: Хвърчил
        XA: Хвърчил
        YA: Ямбол*/
    }
}
