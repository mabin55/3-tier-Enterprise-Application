package Order;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class OrderController {
    
    @EJB
    private OrderEJB orderEJB;
    
    private CarOrders newOrder;
    private List<CarOrders> orderList = new ArrayList<CarOrders>();
    private List<CarOrders> searchOrderList = new ArrayList<CarOrders>();
    private String noOfOrders;
    private String noOfSearchedOrder;
    private String id;
    
    public String showOrderList(){
        
        return "listOfOrders.xhtml";
    }
    
    public String doNewOrder(){
        
        return "newOrder.xhtml";
    }
    
    public String doCreateNewOrder(){
        
        newOrder = orderEJB.createOrder(newOrder);
        orderList = orderEJB.findOrders();
        noOfOrders = Integer.toString(orderList.size());
        return "listOfOrders.xhtml";
    }
    
    public String searchOrder(){
        searchOrderList = orderEJB.searchOrders(id);
        noOfSearchedOrder = Integer.toString(searchOrderList.size());
        return "searchedOrder.xhtml";
    }
    
    public String deleteOrder(){
        
        return "listOfOrder.xhtml";
    }

    public CarOrders getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(CarOrders newOrder) {
        this.newOrder = newOrder;
    }

    public List<CarOrders> getOrderList() {
        orderList = orderEJB.findOrders();
        return orderList;
    }

    public void setOrderList(List<CarOrders> orderList) {
        this.orderList = orderList;
    }    
    
    public OrderEJB getOrderEJB() {
        return orderEJB;
    }

    public void setOrderEJB(OrderEJB orderEJB) {
        this.orderEJB = orderEJB;
    }

    public List<CarOrders> getSearchOrderList() {
        return searchOrderList;
    }

    public void setSearchOrderList(List<CarOrders> searchOrderList) {
        this.searchOrderList = searchOrderList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoOfSearchedOrder() {
        return noOfSearchedOrder;
    }

    public void setNoOfSearchedOrder(String noOfSearchedOrder) {
        this.noOfSearchedOrder = noOfSearchedOrder;
    }

    public String getNoOfOrders() {
        return noOfOrders;
    }

    public void setNoOfOrders(String noOfOrders) {
        this.noOfOrders = noOfOrders;
    }
    
     
    
    
}
