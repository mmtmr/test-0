package inheritance;

/**
 *
 * @author Maxine
 */


public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Educational APU = new Educational ("CUS111","Lee@gmail.com","Asia Pacific University","Bukit Jalil","U");
        Educational INTI = new Educational ("CUS121","Low@gmail.com","INTI International School","Bukit Jalil","S");
        Government KPM = new Government("CUS211","Lim@kpm.gov.my","Malaysia Health Ministry","Putrajaya");
        APU.addOrder(300);
        APU.addOrder(700);
        INTI.addOrder(300);
        INTI.addOrder(700);
        APU.CalculateDiscount();
        INTI.CalculateDiscount();
        APU.PrintOrders();
        INTI.PrintOrders();
        KPM.addOrder(300);
        KPM.addOrder(700);
        KPM.CalculateDiscount();
        KPM.PrintOrders();
    }
    
}
