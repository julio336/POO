package Java;

class Driver extends Account {
    String email;
    String password;

    public Driver(String name, String document, String email, String password){
        super(name, document);
        this.email = email;
        this.password = password;
    }

    void printDatadriver(){
        System.out.println("Document driver: " + document +
        " Name: " + name + " Email: " + email + " Password: "
        + password);
    }

}
