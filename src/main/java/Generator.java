import java.util.*;

public class Generator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> cars = new ArrayList<>();
        String [] carBrand = new String[]{"Volkswagen", "Mercedes", "Alfa Romeo", "Bentley", "Moscvitch", "Lada", "Nissan", "Peugeot", "Rolls-Royce", "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Audi", "Hyundai", "Kia", "Subaru", "Mazda", "Fiat", "Renault", "Skoda", "Volvo", "Jaguar", "Land Rover", "Porsche", "Tesla", "Mitsubishi", "Suzuki", "Citroen"};
        Arrays.sort(carBrand);
        Map<String, String> regionalCodeOfCarNumber = new HashMap<>();
        regionalCodeOfCarNumber.put("E", "Благоевград");
        regionalCodeOfCarNumber.put("A", "Бургас");
        regionalCodeOfCarNumber.put("B", "Варна");
        regionalCodeOfCarNumber.put("BT", "Велико Търново");
        regionalCodeOfCarNumber.put("BH", "Видин");
        regionalCodeOfCarNumber.put("BP", "Враца");
        regionalCodeOfCarNumber.put("EB", "Габрово");
        regionalCodeOfCarNumber.put("K", "Кърджали");
        regionalCodeOfCarNumber.put("KH", "Кюстендил");
        regionalCodeOfCarNumber.put("OB", "Ловеч");
        regionalCodeOfCarNumber.put("M", "Монтана");
        regionalCodeOfCarNumber.put("PA", "Пазарджик");
        regionalCodeOfCarNumber.put("PK", "Перник");
        regionalCodeOfCarNumber.put("EH", "Плевен");
        regionalCodeOfCarNumber.put("PB", "Пловдив");
        regionalCodeOfCarNumber.put("PP", "Разград");
        regionalCodeOfCarNumber.put("P", "Русе");
        regionalCodeOfCarNumber.put("CC", "Силистра");
        regionalCodeOfCarNumber.put("CH", "Сливен");
        regionalCodeOfCarNumber.put("CO", "София-област");
        regionalCodeOfCarNumber.put("C", "София-столица");
        regionalCodeOfCarNumber.put("CA", "София-столица");
        regionalCodeOfCarNumber.put("CB", "София-столица");
        regionalCodeOfCarNumber.put("CT", "Стара Загора");
        regionalCodeOfCarNumber.put("T", "Търговище");
        regionalCodeOfCarNumber.put("X", "Хасково");
        regionalCodeOfCarNumber.put("H", "Шумен");
        regionalCodeOfCarNumber.put("Y", "Ямбол");

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
    }
}
