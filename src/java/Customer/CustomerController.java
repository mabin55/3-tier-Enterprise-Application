package Customer;

import Order.CarOrders;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CustomerController {
    
    //attributes
    
    @EJB
    private CustomerEJB customerEJB;
    
    private Customer newCustomer = new Customer();
    private List<Customer> customerList = new ArrayList<Customer>();
    private String noOfCustomer;
    private List<Customer> searchCustomerList = new ArrayList<Customer>();
    private String noOfSearchedCustomer;
    private String searchCustomerWithName;
    private List<CarOrders> order = new ArrayList<CarOrders>();
    private String numberOfOrders;
    
    //public methods
    
    public String mainPage(){
        
        return "index.xhtml";
    }
    
    public String doNewCustomer(){
        
        return "newCustomer.xhtml";
    }
    
    public String showCustomerList(){
        
        return "listOfCustomers.xhtml";
    }
    
    public String doCreateNewCustomer(){
        
        newCustomer = customerEJB.createCustomer(newCustomer);
        customerList = customerEJB.findCustomers();
        noOfCustomer = Integer.toString(customerList.size());
        return "listOfCustomers.xhtml";
    }
    
    
    public String searchCustomer(){
        
        searchCustomerList = customerEJB.searchCustomer(searchCustomerWithName);
        noOfSearchedCustomer = Integer.toString(searchCustomerList.size());
        return "searchedCustomer.xhtml";        
    }
    
    public String showDetailsOfCustomer(){
        
        newCustomer = customerEJB.createCustomer(newCustomer);
        customerList = customerEJB.findCustomers();
        noOfCustomer = Integer.toString(customerList.size());
        return "detailsOfCustomer.xhtml";
    }
    
    //getter and setters
 
    public CustomerEJB getCustomerEJB() {
        return customerEJB;
    }

    public void setCustomerEJB(CustomerEJB customerEJB) {
        this.customerEJB = customerEJB;
    }

    public Customer getNewCustomer() {
        return newCustomer;
    }

    public void setNewCustomer(Customer newCustomer) {
        this.newCustomer = newCustomer;
    }

    public List<Customer> getCustomerList() {
        customerList = customerEJB.findCustomers();
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getNoOfCustomer() {
        return noOfCustomer;
    }

    public void setNoOfCustomer(String noOfCustomer) {
        this.noOfCustomer = noOfCustomer;
    }

    public List<Customer> getSearchCustomerList() {
        return searchCustomerList;
    }

    public void setSearchCustomerList(List<Customer> searchCustomerList) {
        this.searchCustomerList = searchCustomerList;
    }

    public String getNoOfSearchedCustomer() {
        return noOfSearchedCustomer;
    }

    public void setNoOfSearchedCustomer(String noOfSearchedCustomer) {
        this.noOfSearchedCustomer = noOfSearchedCustomer;
    }

    public String getSearchCustomerWithName() {
        return searchCustomerWithName;
    }

    public void setSearchCustomerWithName(String searchCustomerWithName) {
        this.searchCustomerWithName = searchCustomerWithName;
    }

    public List<CarOrders> getOrder() {
        return order;
    }

    public void setOrder(List<CarOrders> order) {
        this.order = order;
    }

    public String getNumberOfOrders() {
        
        int number = order.size();
        numberOfOrders = Integer.toString(number);
        return numberOfOrders;
    }

    public void setNumberOfOrders(String numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    } 
}
