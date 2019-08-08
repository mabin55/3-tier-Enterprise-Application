package Order;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class OrderEJB {

    @PersistenceContext(unitName = "A2PU")
    private EntityManager em;
        
    public CarOrders createOrder(CarOrders order){
        
        em.persist(order);
        return order;
    }
    
    public List<CarOrders> findOrders(){
        
        Query query = em.createNamedQuery("findOrders");
        return query.getResultList();
    }
    
    public List<CarOrders> searchOrders(String id){
        
        Query query = em.createNamedQuery("searchOrder");
        query.setParameter(1, id);
        return query.getResultList();
    }
    
}
