import java.util.*;

public class Generator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> cars = new ArrayList<>();
        String [] carBrand = new String[]{"Volkswagen", "Mercedes", "Alfa Romeo", "Bentley", "Moscvitch", "Lada", "Nissan", "Peugeot", "Rolls-Royce", "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Audi", "Hyundai", "Kia", "Subaru", "Mazda", "Fiat", "Renault", "Skoda", "Volvo", "Jaguar", "Land Rover", "Porsche", "Tesla", "Mitsubishi", "Suzuki", "Citroen"};
        Arrays.sort(carBrand);
        String [] regionalCodes = new String[]{"E", "A", "B","BT", "BH", "BP", "EB", "K", "KH", "OB", "M", "PA", "PK", "EH", "PB", "PP", "P", "CC", "CH", "CO", "C", "CA", "CB", "CT", "T", "X", "H", "Y"};
        Map<String, String> regionalCodeOfCarNumber = new HashMap<>();

        int numberOfCars = 10;
        System.out.println("Cars number: " + numberOfCars);
        //int numberOfCars = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter < numberOfCars) {
            int randomNumber = random.nextInt(carBrand.length);
            String newCar = carBrand[randomNumber];
            String regionalCode = regionalCodes[random.nextInt(regionalCodes.length)];
            int number = random.nextInt(9999);

            if (!cars.contains(newCar)) {
                newCar = newCar + " " + regionalCode + number;
                cars.add(newCar);
                counter++;
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("%d %s\n", i + 1, cars.get(i));
        }
    }
}
