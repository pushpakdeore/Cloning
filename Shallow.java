package pushpak26Coning;

class B{
    int age;
    String name;
    B(int age,String name){
        this.age =age;
        this.name =name;

    }
    @Override
    public String toString(){
        return "A name :"+name+ " age"+age+" ";

    }
}

public class Shallow {
    public static void main(String[] args) {
        B obj1 =new B(12,"pushpak");
        B obj2 = obj1;
        obj2.name ="kunal";
        System.out.println(obj1);
        System.out.println(obj2);
    }


}
