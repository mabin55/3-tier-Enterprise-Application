package Car;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CarController {

    // ======================================
    // =             Attributes             =
    // ======================================

    @EJB
    private CarEJB carEJB;

    private NewCar newCar = new NewCar();
    private UsedCar usedCar = new UsedCar();
    private Car car = new Car();
    private List<Car> newCarList = new ArrayList<Car>();
    private String noOfBrandNewCar;
    private List<Car> usedCarList = new ArrayList<Car>();
    private String noOfUsedCar;
    private List<NewCar> searchNewCarList = new ArrayList<NewCar>();
    private String noOfSearchedNewCar;
    private List<UsedCar> searchUsedCarList = new ArrayList<UsedCar>();
    private String noOfSearchedUsedCar;
    private String searchNewCarWithRN;
    private String searchUsedCarWithRN;
    private List<Car> carList = new ArrayList<Car>();

    // ======================================
    // =           Public Methods           =
    // ======================================
    
    public String mainPage(){
        return "index.xhtml";
    }
    
    public String doBrandNewCar() {
        return "newCar.xhtml";
    }

    public String doUsedCar() {
        return "usedCar.xhtml";
    }
    
    public String showNewCarList(){
        return "listOfNewCars";
    }
    
    public String showUsedCarList(){
        return "listOfUsedCars";
    }

    public String doCreateBrandNewCar() {
        newCar = carEJB.createBrandNewCar(newCar);
        newCarList = carEJB.findNewCars();
        noOfBrandNewCar=Integer.toString(newCarList.size());
        return "listOfNewCars.xhtml";
    }

    public String doCreateUsedCar() {
        usedCar = carEJB.createUsedCar(usedCar);
        usedCarList = carEJB.findUsedCars();
        noOfUsedCar = Integer.toString(usedCarList.size());
        return "listOfUsedCars.xhtml";
    }
    
    public String searchBrandNewCar(){
        searchNewCarList = carEJB.searchNewCar(searchNewCarWithRN);
        noOfSearchedNewCar = Integer.toString(searchNewCarList.size());
        return "searchedCar.xhtml";
    }
    
    public String searchUsedCar(){
        searchUsedCarList = carEJB.searchUsedCar(searchUsedCarWithRN);
        noOfSearchedUsedCar = Integer.toString(searchUsedCarList.size());
        return "searchedUsedCar.xhtml";
    }

    //Getters and Setters
    public NewCar getNewCar() {
        return newCar;
    }

    public void setNewCar(NewCar newCar) {
        this.newCar = newCar;
    }

    public UsedCar getUsedCar() {
        return usedCar;
    }

    public void setUsedCar(UsedCar usedCar) {
        this.usedCar = usedCar;
    }

    public List<Car> getNewCarList() {
        newCarList = carEJB.findNewCars();
        return newCarList;
    }

    public void setNewCarList(List<Car> newCarList) {
        this.newCarList = newCarList;
    }

    

    public List<Car> getUsedCarList() {
        usedCarList = carEJB.findUsedCars();
        return usedCarList;
    }

    public void setUsedCarList(List<Car> usedCarList) {
        this.usedCarList = usedCarList;
    }
    
    
    public List<NewCar> getSearchNewCarList() {
        return searchNewCarList;
    }

    public void setSearchNewCarList(List<NewCar> searchNewCarList) {
        this.searchNewCarList = searchNewCarList;
    }

    public String getSearchNewCarWithRN() {
        return searchNewCarWithRN;
    }

    public void setSearchNewCarWithRN(String searchNewCarWithRN) {
        this.searchNewCarWithRN = searchNewCarWithRN;
    }

    public String getNoOfSearchedNewCar() {
        return noOfSearchedNewCar;
    }

    public void setNoOfSearchedNewCar(String noOfSearchedNewCar) {
        this.noOfSearchedNewCar = noOfSearchedNewCar;
    }

    public String getNoOfBrandNewCar() {
        return noOfBrandNewCar;
    }

    public void setNoOfBrandNewCar(String noOfBrandNewCar) {
        this.noOfBrandNewCar = noOfBrandNewCar;
    }

    public String getNoOfUserdCar() {
        return noOfUsedCar;
    }

    public void setNoOfUserdCar(String noOfUsedCar) {
        this.noOfUsedCar = noOfUsedCar;
    }

    public String getNoOfUsedCar() {
        return noOfUsedCar;
    }

    public void setNoOfUsedCar(String noOfUsedCar) {
        this.noOfUsedCar = noOfUsedCar;
    }

    public List<UsedCar> getSearchUsedCarList() {
        return searchUsedCarList;
    }

    public void setSearchUsedCarList(List<UsedCar> searchUsedCarList) {
        this.searchUsedCarList = searchUsedCarList;
    }

    public String getNoOfSearchedUsedCar() {
        return noOfSearchedUsedCar;
    }

    public void setNoOfSearchedUsedCar(String noOfSearchedUsedCar) {
        this.noOfSearchedUsedCar = noOfSearchedUsedCar;
    }

    public String getSearchUsedCarWithRN() {
        return searchUsedCarWithRN;
    }

    public void setSearchUsedCarWithRN(String searchUsedCarWithRN) {
        this.searchUsedCarWithRN = searchUsedCarWithRN;
    }

    public List<Car> getCarList() {
        carList = carEJB.findAllCars();
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
    
    
    
    
    
    

}