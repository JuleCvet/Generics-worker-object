

package genericsmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
    List<Customer> customers = new ArrayList<Customer>();
    
    Customer customer1 = new Customer(1, "Jule", "ulica Aleluja");
    Customer customer2 = new Customer(1, "Miko", "ulica viulica");
    Customer customer3 = new Customer(1, "Andrej", "ulica Tummelisas gata");
    
    customers.add(customer1);//ne mozeme da frlame sekogash tocno vo pravilni objekti, izbegnuvame errors
    customers.add(customer2);
    customers.add(customer3);
    
    Iterator<Customer> iterator = customers.iterator();//element shto lupa niz nizata od tipot Customer
        while(iterator.hasNext()){//dodeka ima sledni customeri
            Customer nextCustomer = iterator.next();//lupaj i zacuvuvaj gi vo nextCustomer
            System.out.println(nextCustomer.getName());//pecati gi po ime
            //hasBext(), next(), loop + elementot+.getSomething za da ni gi printa objektite po atributi
    
    }  
        for(Customer nextCustomer : customers){//object od tip customer, so ime nextCustomer, vo listata so ime Customers
            System.out.println(nextCustomer.getName());
            
      }
        StringWorker<String,Integer> sw = new StringWorker<String,Integer>("Hello", 123);//ja povrzuvame novata klasa StringWorker
        System.out.println(sw.toString());//da proverime dali raboti
        
        StringWorker<String,String> sw2 = new StringWorker<String,String>("Hello", "world");//moze i so String
        System.out.println(sw2.toString());
        System.out.println(sw2.getO1());//znae deka o1 e od tip na string i vraka Hello
        
        System.out.println(StringWorker.getString(customer1, "Hello"));//mozzime da stavime objekti od bilo koj tip
        //customer e object i nema toString metod pa outputot ke ni e nerazbirliv

  } 
}
//1. Consumer: ACCEPT() ima parametri, nema return(consumer jadi a ne serri)
//2. Suplier: GET()  nema parametri, ima return (suplier, dava a ne jadi)
//koga imame i INPUT i RETURN - togash imame i functional interfejsis
//3.FUNCTION APPLY()   ako imame 3 parametri: String Boolean i integer = na ()koj vraka integer a zema String i Boolean kako input
//4.Predicatite TEST()   vrakaat boolean a zemaat 2 objekti kako input