import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        String [] carBrand = new String[]{"Volkswagen", "Mercedes", "Alfa Romeo", "Bentley", "Moscvitch", "Lada", "Nissan", "Peugeot", "Rolls-Royce", "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Audi", "Hyundai", "Kia", "Subaru", "Mazda", "Fiat", "Renault", "Skoda", "Volvo", "Jaguar", "Land Rover", "Porsche", "Tesla", "Mitsubishi", "Suzuki", "Citroen"};
        Arrays.sort(carBrand);
        List<String> cars = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10);
            System.out.println(carBrand[randomNumber]);
        }
    }
}
