public abstract class Animal {

    String name;

    public String getName() {
        return name;
    }

    public Animal(String name){
        this.name=name;
    }


    public void start(){
        System.out.println(getType()+" starts!");
    }

    public void stop(){
        System.out.println(getType()+" stops!");
    }



    abstract String getType();
}
