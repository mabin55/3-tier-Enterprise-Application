package Car;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class CarEJB {

    // ======================================
    // =             Attributes             =
    // ======================================

    @PersistenceContext(unitName = "A2PU")
    private EntityManager em;

    // ======================================
    // =           Public Methods           =
    // ======================================

    public List<Car> findNewCars() {
        Query query = em.createNamedQuery("findNewCars");
        return query.getResultList();
    }
    
    public List<Car> findUsedCars() {
        Query query = em.createNamedQuery("findUsedCars");
        return query.getResultList();
    }
    
    public List<Car> findAllCars(){
        Query query = em.createNamedQuery("findAllCars");
        return query.getResultList();
    }
    
    public List<NewCar> searchNewCar(String rn){
        Query query = em.createNamedQuery("searchForNewCar");
        query.setParameter(1, rn);
        return query.getResultList();
    }
    
    public List<UsedCar> searchUsedCar(String rn){
        Query query = em.createNamedQuery("searchForUsedCar");
        query.setParameter(1, rn);
        return query.getResultList();
    }

    public NewCar createBrandNewCar(NewCar newCar) {
        em.persist(newCar);
        return newCar;
    }

    public UsedCar createUsedCar(UsedCar usedCar) {
        em.persist(usedCar);
        return usedCar;
    }
}