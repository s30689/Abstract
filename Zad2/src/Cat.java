public class Cat extends Animal implements Moveable{

    public Cat (String name){
        super(name);
    }
@Override
    public void start(){
        System.out.println(getType()+" starts!");
    }
@Override
    public void stop(){
        System.out.println(getType()+" stops!");
    }
@Override
    String getType(){
        return getClass().getSimpleName();
}


}
