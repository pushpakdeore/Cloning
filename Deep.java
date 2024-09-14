package pushpak26Coning;

import org.w3c.dom.ls.LSOutput;

class A{
    int age;
    String name;

    @Override
    public String toString(){
        return "A name :"+name+ " age"+age+" ";

    }
}
public class Deep {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.name ="pushpak";
        obj1.age =23;

        System.out.println(obj1);

        A obj2 =new A();
        obj2.name =obj1.name;
        obj2.age =obj1.age;
        obj2.age =20;
        System.out.println(obj2);
    }
}
