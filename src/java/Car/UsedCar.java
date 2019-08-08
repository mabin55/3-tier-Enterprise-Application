package Car;

import javax.persistence.Entity;

@Entity
public class UsedCar extends Car {

    //Attributes
    private String odometer;
    private String regoNo;
    private String regoExpiry;
    private String serviceHistory;
    private String vehicleIdentificationNumber;
    private String carHistory;

    //Constructor
    public UsedCar() {
    }

    public UsedCar(String odometer, String regoNo, String regoExpiry, String serviceHistory, String vehicleIdentificationNumber, String carHistory, String referenceNumber, String carMake, String carModel, String driveType, String bodyColour, String transmission, String carEngine, String fuelType, String numberOfDoors, String numberOfSeats, Float price, String numberOfCars) {
        super(referenceNumber, carMake, carModel, driveType, bodyColour, transmission, carEngine, fuelType, numberOfDoors, numberOfSeats, price, numberOfCars);
        this.odometer = odometer;
        this.regoNo = regoNo;
        this.regoExpiry = regoExpiry;
        this.serviceHistory = serviceHistory;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.carHistory = carHistory;
    }

    

    //Getters and Setters
    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public String getRegoNo() {
        return regoNo;
    }

    public void setRegoNo(String regoNo) {
        this.regoNo = regoNo;
    }

    public String getRegoExpiry() {
        return regoExpiry;
    }

    public void setRegoExpiry(String regoExpiry) {
        this.regoExpiry = regoExpiry;
    }

    public String getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(String serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getCarHistory() {
        return carHistory;
    }

    public void setCarHistory(String carHistory) {
        this.carHistory = carHistory;
    }

    
}