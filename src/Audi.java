final
public class Audi extends Mersedes_Benz {
     private int Speed;
     private String sistem;
     private String management;// управление

    public int getSpeed() {
        return Speed;
    }

    public String getSistem() {
        return sistem;
    }

    public String getManagement() {
        return management;
    }
    public Audi(ColorCar colorCar, int model, int speed, String sistem, String management, String name) {
        super(colorCar,model,sistem, String.valueOf(name));
        this.Speed = speed;
        this.sistem = sistem;
        this.management = management;
        //super.getDriver();
    }

    @Override
    public String getInfo(String Driver1) {
        return super.getDriver("DDD")+
                "\nSpeed: " + Speed +
                "\nSistem: " + sistem +
                "\nManagement: " + management;
    }
    public void makeAudiMusic(){
        System.out.println("Врум врум " + "\n       ");
    }
    public void makeAudiNoise(){
        System.out.println("Шумит двигатель");
    }
}
