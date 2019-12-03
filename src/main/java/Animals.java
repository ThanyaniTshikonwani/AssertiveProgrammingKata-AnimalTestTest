public class Animals {

    private String name;

    public  Animals(){
        // This a default constructor.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String sounds(){
        System.out.println("Sounds...");
        return "Sounds...";
    }

    public String eats(){
        System.out.println("Food");
        return "Food";
    }
}
