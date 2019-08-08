package Order;

import Car.Car;
import Customer.Customer;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
    @NamedQuery(name = "findOrders", query = "SELECT i,j FROM CarOrders i INNER JOIN i.customer j"),
    @NamedQuery(name = "searchOrder", query = "SELECT i,i.customer.name,i.Car.carModel FROM CarOrders i WHERE i.id = ?1"),
})
public class CarOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    
    protected Float quantity;
    
    @OneToOne
    protected Car Car;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "customer", referencedColumnName = "customer_id")
    protected Customer customer;
    
    public CarOrders(){
        
    }

    public CarOrders(Float quantity, Car Car, Customer customer) {
        this.quantity = quantity;
        this.Car = Car;
        this.customer = customer;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Car getCar() {
        return Car;
    }

    public void setCar(Car Car) {
        this.Car = Car;
    }
    
    
    
}
