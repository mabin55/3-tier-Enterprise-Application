package Customer;

//import Order.CarOrders;
import Order.CarOrders;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@NamedQueries({
    @NamedQuery(name = "findCustomers", query = "SELECT i FROM Customer i"),
    @NamedQuery(name = "searchCustomer", query = "SELECT i FROM Customer i WHERE i.name = ?1"),
})
public class Customer implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<CarOrders> orders;
   
    public Customer(){
        
    }
    
    //parameterized constructor
    public Customer(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }//end of parameterized constructor
    
    //getter and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    public List<CarOrders> getOrders() {
        return orders;
    }

    public void setOrders(List<CarOrders> orders) {
        this.orders = orders;
    }
}
