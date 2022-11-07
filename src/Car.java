public abstract class Car {
    private int output;
    private int  Kuzov;
    private String color;

    public int getOutput() {
        return output;
    }

    public int getKuzov() {
        return Kuzov;
    }

    public String getColor() {
        return color;
    }

    public Car(ColorCar output, int kuzov, String salon, String color) {
        this.output = output.ordinal();
        this.Kuzov = kuzov;
        this.color = String.valueOf(color);
    }

    public String getInfo(Driver1 Driver1) {
        return Driver1.getName();
    }


    public abstract String getInfo(String Driver1);
}
