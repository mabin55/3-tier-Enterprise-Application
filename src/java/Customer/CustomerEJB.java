package Customer;

import Order.CarOrders;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class CustomerEJB {

    @PersistenceContext(unitName = "A2PU")
    private EntityManager em;
        
    public Customer createCustomer(Customer customer){
        
        em.persist(customer);
        return customer;
    }
    
    public List<Customer> findCustomers(){
        
        Query query = em.createNamedQuery("findCustomers");
        return query.getResultList();
    }
    
    public List<Customer> searchCustomer(String name){
        Query query = em.createNamedQuery("searchCustomer");
        query.setParameter(1, name);
        return query.getResultList();
    }
}
