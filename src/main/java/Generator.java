import java.util.*;

public class Generator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> cars = new ArrayList<>();
        String [] carBrand = new String[]{"Volkswagen", "Mercedes", "Alfa Romeo", "Bentley", "Moscvitch", "Lada", "Nissan", "Peugeot", "Rolls-Royce", "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Audi", "Hyundai", "Kia", "Subaru", "Mazda", "Fiat", "Renault", "Skoda", "Volvo", "Jaguar", "Land Rover", "Porsche", "Tesla", "Mitsubishi", "Suzuki", "Citroen"};
        Arrays.sort(carBrand);
        String [] regionalCodes = new String[]{"E", "A", "B","BT", "BH", "BP", "EB", "K", "KH", "OB", "M", "PA", "PK", "EH", "PB", "PP", "P", "CC", "CH", "CO", "C", "CA", "CB", "CT", "T", "X", "H", "Y"};
        String [] lastWord = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

        int numberOfCars = 20;
        System.out.println("Cars number: " + numberOfCars);
        //int numberOfCars = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter < numberOfCars) {
            int randomNumber = random.nextInt(carBrand.length);
            StringBuilder order = new StringBuilder((counter + 1 + "               ").substring(0, 2));
            StringBuilder newCar = new StringBuilder(order + "| " + carBrand[randomNumber]);
            String regionalCode = regionalCodes[random.nextInt(regionalCodes.length)];
            int fourDigitNumber = random.nextInt(1000, 9999);

            if (!cars.contains(newCar.toString())) {
                newCar = new StringBuilder((newCar + "               ").substring(0, 17));
                newCar.append("| ").append(regionalCode).append(fourDigitNumber);
                for (int i = 0; i < 2; i++) {
                    int lastChar = random.nextInt(lastWord.length);
                    newCar.append(lastWord[lastChar]);
                }
                cars.add(newCar.toString());
                counter++;
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
