package model;

public class Car {
    private String type;
    private String make;
    private int model;

    public Car(String type, String make, int model) {
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(int model) {
        this.model = model;
    }
}



