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
public class Educational extends Customer{
    private String InstName;
    private String InstAddress;
    private String EduType;
    private int OrderNo=0;
    private double DiscAmt=0.0;
    private double TotalOrderAmt=0.0;

    public Educational(String cusId, String cusLead, String InstName, String InstAddress, String EduType) {
        super(cusId, cusLead);
        this.InstName = InstName;
        this.InstAddress = InstAddress;
        this.EduType = EduType;
    }
    
    public void addOrder(double amt){
        Orders[OrderNo]=amt;
        OrderNo++;
    }
    
    public void CalculateDiscount(){
        
        for (int i=0; i<OrderNo; i++)
        {
            TotalOrderAmt=TotalOrderAmt+Orders[i];
        }
        
        if (EduType.equalsIgnoreCase("U"))
        {
            DiscAmt= TotalOrderAmt*0.1;
        }
        if (EduType.equalsIgnoreCase("S"))
        {
            DiscAmt= TotalOrderAmt*0.2;
        }
    }
    
    public void PrintOrders(){
        System.out.println("Institution Name: "+InstName);
        System.out.println("Institution Address: "+InstAddress);
        System.out.println("Customer ID: "+getCusId());
        System.out.println("Customer Lead: "+getCusLead());
        for (int i=0; i<OrderNo; i++){
            System.out.println("Order No: "+i);
            System.out.println("Order Amount: "+Orders[i]);
        }
        System.out.println("Total Order Amount Before Discount: "+TotalOrderAmt);
        System.out.println("Total Discount Amount: "+DiscAmt);
        System.out.println("Total Order Amount After Discount: "+ (TotalOrderAmt-DiscAmt));
        System.out.println("---------------------------------------------------------");
    }
}
