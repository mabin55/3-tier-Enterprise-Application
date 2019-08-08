package Car;

import javax.persistence.Entity;

@Entity
public class NewCar extends Car{

    //Atributes
    private String warranty;
    private String extendingWarranty;
    private String roadSideAssistancePackage;

    //Constructors
    public NewCar() {
    }

    public NewCar(String warranty, String extendingWarranty, String roadSideAssistancePackage, String referenceNumber, String carMake, String carModel, String driveType, String bodyColour, String transmission, String carEngine, String fuelType, String numberOfDoors, String numberOfSeats, Float price, String numberOfCars) {
        super(referenceNumber, carMake, carModel, driveType, bodyColour, transmission, carEngine, fuelType, numberOfDoors, numberOfSeats, price, numberOfCars);
        this.warranty = warranty;
        this.extendingWarranty = extendingWarranty;
        this.roadSideAssistancePackage = roadSideAssistancePackage;
    }

    

    //Getters and Setters
    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getExtendingWarranty() {
        return extendingWarranty;
    }

    public void setExtendingWarranty(String extendingWarranty) {
        this.extendingWarranty = extendingWarranty;
    }

    public String getRoadSideAssistancePackage() {
        return roadSideAssistancePackage;
    }

    public void setRoadSideAssistancePackage(String roadSideAssistancePackage) {
        this.roadSideAssistancePackage = roadSideAssistancePackage;
    }

    
}