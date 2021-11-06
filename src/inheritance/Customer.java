/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Maxine
 */
public class Customer {
    private String cusId;
    private String cusLead;
    protected double Orders[]=new double[12];

    public Customer(String cusId, String cusLead) {
        this.cusId = cusId;
        this.cusLead = cusLead;
    }
    
    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusLead() {
        return cusLead;
    }

    public void setCusLead(String cusLead) {
        this.cusLead = cusLead;
    }

    public double[] getOrder() {
        return Orders;
    }

    public void setOrder(double[] Order) {
        this.Orders = Order;
    }
    
    

}
