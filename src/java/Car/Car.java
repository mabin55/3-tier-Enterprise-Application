 package Car;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({
    @NamedQuery(name = "findNewCars", query = "SELECT i FROM NewCar i"),
    @NamedQuery(name = "findUsedCars", query = "SELECT i FROM UsedCar i"),
    @NamedQuery(name = "searchForNewCar", query = "SELECT i FROM NewCar i WHERE i.referenceNumber = ?1"),
    @NamedQuery(name = "searchForUsedCar", query = "SELECT i FROM UsedCar i WHERE i.referenceNumber = ?1"),
    @NamedQuery(name = "findAllCars", query = "SELECT i FROM Car i")
})
public class Car implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //Attributes
    @Id
    @GeneratedValue
    protected Long id;
    protected String referenceNumber;
    protected String carMake;
    protected String carModel;
    protected String driveType;
    protected String bodyColour;
    protected String transmission;
    protected String carEngine;
    protected String fuelType;
    protected String numberOfDoors;
    protected String numberOfSeats;
    protected Float price;
    protected String numberOfCars;

    //Constructor
    public Car() {
    }

    public Car(String referenceNumber,String carMake,String carModel, String driveType,String bodyColour, String transmission,String carEngine, String fuelType,String numberOfDoors, String numberOfSeats, Float price, String numberOfCars) {
        this.referenceNumber = referenceNumber;
        this.carMake = carMake;
        this.carModel = carModel;
        this.driveType = driveType;
        this.bodyColour = bodyColour;
        this.transmission = transmission;
        this.carEngine = carEngine;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
        this.numberOfCars = numberOfCars;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getBodyColour() {
        return bodyColour;
    }

    public void setBodyColour(String bodyColour) {
        this.bodyColour = bodyColour;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(String numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    
}