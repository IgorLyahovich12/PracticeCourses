import java.util.Scanner;
import java.util.ArrayList;

public class CitiesGame {
    public static void main(String[] args) {
        String[] citiesArray = {"Харків", "Амстердам", "Варшава", "Лондон", "Київ"};
        playCitiesGame(citiesArray);
    }

    public static void playCitiesGame(String[] citiesArray) {
        Scanner scanner = new Scanner(System.in);
                ArrayList<String> usedCities = new ArrayList<>();
                //список для використаних міст
        System.out.println("Давай пограємо у «Міста». Ти перший називай!");

        boolean playerTurn = true; // Починає гравець

        while (true) {
            if (playerTurn) {
                System.out.print("Ти: ");
                String userCity = scanner.nextLine();
                if (userCity.equalsIgnoreCase("Здаюся")) {
                    System.out.println("Ти здаєшся.Дякую за гру! Кінець гри!");
                    break;
                }
                if (usedCities.contains(userCity)) {
                    //перевірка списку використаних
                    System.out.println("Таке місто вже було назване. Спробуй ще раз.");
                    System.out.println("Напиши \"Здаюся\"якщо не знаєш більше міст ");
                    continue;
                }
                usedCities.add(userCity);
                playerTurn = false; // Завершено хід гравця
            } else {
                char lastChar = usedCities.get(usedCities.size() - 1).charAt(usedCities.get(usedCities.size() - 1).length() - 1);
                //Отримуємо зі списку останню букву міста
                if (lastChar == 'ь'||lastChar =='Ь') {
                    // Якщо остання літера - ь, шукаємо місто на попередню букву
                    lastChar = usedCities.get(usedCities.size() - 1).charAt(usedCities.get(usedCities.size() - 1).length() - 2);
                    //якщо ь
                }
                String computerCity = findCityStartingWith(lastChar, citiesArray, usedCities);
                if (computerCity != null) {
                    System.out.println("Комп'ютер: " + computerCity);
                    usedCities.add(computerCity);
                    //додаєм с список використаних
                } else {
                    System.out.println("Комп'ютер: Я не можу знайти міста на цю літеру. Ти виграв!");
                    break;
                }
                playerTurn = true; // Завершено хід комп'ютера
            }
        }
    }

    public static String findCityStartingWith(char firstLetter, String[] citiesArray, ArrayList<String> usedCities) {
        char lowerCaseFirstLetter = Character.toLowerCase(firstLetter);
        //Ігнор регістру
        for (String city : citiesArray) {
            String cityName = city.toLowerCase();
            //Ігнорування часу порівнянь
            if (cityName.charAt(0) == lowerCaseFirstLetter && !usedCities.contains(city)) {
                return city;
            }
        }
        return null;
    }
}