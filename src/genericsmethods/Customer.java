
package genericsmethods;

class Customer {
   private int id;
   private String name;
   private String adress;

    public Customer(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
        
    }
}
