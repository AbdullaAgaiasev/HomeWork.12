public class Main {
    public static void main(String[] args) {
        String Salon = ("Leather interior");// кожанный салон
        String name = new String("Dominik Toretto");
        Mersedes_Benz mersedes_benz = new Mersedes_Benz(ColorCar.BLACK, 124, Salon, name);
        System.out.println(mersedes_benz.getInfo(name));
        mersedes_benz.makeMusic();
        // mersedes_benz.makeMusic(" Bip bip ");
        System.out.println("-------------");
        mersedes_benz.makeNoise();
        // mersedes_benz.makeNoise(" Отстрелы из выхлопа ");

        String Sistem = (": Хорошая ");
        String Management = (": Тяжкое ");
        Audi audi = new Audi(ColorCar.RAD, 6, 280, Sistem, Management, name);
        System.out.println(audi.getInfo(name));
        audi.makeAudiMusic();

        String Sistem2 = (": Отлично ");
        String Management2 = (": Замечательное ");
        Audi audi2 = new Audi(ColorCar.DARK_GRAY,8,320,Sistem2,Management2,name);
        System.out.println(audi2.getInfo(name));
        audi2.makeAudiNoise();
    }
}



