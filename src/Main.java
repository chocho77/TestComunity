class Address{
    String city,state,country;
    public Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class Main {
    // Aggregation example
    int id;
    String name;
    Address address;

    public Main(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("ID "+id+"Name "+name);
        System.out.println(address.city+' ' + address.state + ' ' + address.country);
    }
    public static void main(String[] args) {
        Address address1 = new Address("Varna", "Primorski", "Bulgaria");
        Address address2 = new Address("Plovdiv", "Bjala", "Bulgaria");

        Main emp1 = new Main(101,"Chavdar", address1);
        Main emp2 = new Main(102,"Pesho", address2);

        emp1.display();
        emp2.display();
    }
}