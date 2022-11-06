public class Mersedes_Benz extends Car{
    private ColorCar colorCar;
    private int Model;
    private String Salon;
    private Driver1 driver;

    public Driver1 getDriver(String name) {
        return this.driver;
    }

    public ColorCar getColorCar() {
        return colorCar;
    }

    public int getShassis() {
        return Model;
    }

    public String getSalon() {
        return Salon;
    }
    @Override
    public String getInfo(String Driver1) {
        return  " \nColor Car: " + colorCar +
                " \nModel: " + Model +
                " \nSalon: " + Salon +
                " \nDriver: " + driver;
    }
    public void makeMusic(){
        System.out.println("Bip bip ");
    }
    public void makeMusic(String music){
        System.out.println(music);
    }
    public void makeNoise() {
        System.out.println("Отстрелы из выхлопа");
    }
    public void makeNoise(String noise){
        System.out.println(noise);
    }

    public Mersedes_Benz(ColorCar colorCar, int model, String salon, Driver1 driver1) {
        super(colorCar, model, salon, new Driver1("Dominik"));
        this.colorCar = colorCar;
        this.Model = model;
        this.Salon = salon;
        this.driver = new Driver1 ("Dominik");


    }

}

