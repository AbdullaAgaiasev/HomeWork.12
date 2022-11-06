public class Main {
    public static void main(String[] args) {
        String Salon = ("Leather interior");// кожанный салон
        Driver1 Driver1 = new Driver1("Dominik");

        Mersedes_Benz mersedes_benz = new Mersedes_Benz(ColorCar.BLACK, 124, Salon,Driver1);
        System.out.println(mersedes_benz.getInfo(String.valueOf(Driver1)));
        mersedes_benz.makeMusic();
       // mersedes_benz.makeMusic(" Bip bip ");
        System.out.println("-------------");
        mersedes_benz.makeNoise();
       // mersedes_benz.makeNoise(" Отстрелы из выхлопа ");
    }

    }



