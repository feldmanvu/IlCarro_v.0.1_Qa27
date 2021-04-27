package models;

public class Car {
    String location;
    String make;
    String model;
    String year;
    String engine;
    String doors;
    String seats;
    String carClass;
    String fuelConsumption;
    String carRegistrationNumber;
    String price;
    String distanceIncluded;
    String features;
    String about;

    public Car withLocation(String location) {
        this.location = location;
        return this;
    }

    public Car withMake(String make) {
        this.make = make;
        return this;
    }

    public Car withModel(String model) {
        this.model = model;
        return this;
    }

    public Car withYear(String year) {
        this.year = year;
        return this;
    }

    public Car withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car withDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public Car withSeats(String seats) {
        this.seats = seats;
        return this;
    }

    public Car withCarClass(String carClass) {
        this.carClass = carClass;
        return this;
    }

    public Car withFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public Car withCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
        return this;
    }

    public Car withPrice(String price) {
        this.price = price;
        return this;
    }

    public Car withDistanceIncluded(String distanceIncluded) {
        this.distanceIncluded = distanceIncluded;
        return this;
    }

    public Car withFeatures(String features) {
        this.features = features;
        return this;
    }

    public Car withAbout(String about) {
        this.about = about;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getDoors() {
        return doors;
    }

    public String getSeats() {
        return seats;
    }

    public String getCarClass() {
        return carClass;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public String getPrice() {
        return price;
    }

    public String getDistanceIncluded() {
        return distanceIncluded;
    }

    public String getFeatures() {
        return features;
    }

    public String getAbout() {
        return about;
    }
}
