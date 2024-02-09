import java.util.*;

public class Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> cars = new ArrayList<>();
        String [] carBrand = new String[]{"Volkswagen", "Mercedes", "Alfa Romeo", "Bentley", "Moscvitch", "Lada", "Nissan", "Peugeot", "Rolls-Royce", "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Audi", "Hyundai", "Kia", "Subaru", "Mazda", "Fiat", "Renault", "Skoda", "Volvo", "Jaguar", "Land Rover", "Porsche", "Tesla", "Mitsubishi", "Suzuki", "Citroen"};
        Arrays.sort(carBrand);

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
