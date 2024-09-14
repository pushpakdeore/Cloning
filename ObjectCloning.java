package pushpak26Coning;

import org.w3c.dom.ls.LSOutput;

class C implements Cloneable{
    int age;
    String name;

    @Override
    public String toString(){
        return "A name :"+name+ " age"+age+" ";

    }
    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();//shallow copy
    }
}
public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        C obj1 =new C();//shallow copy
        obj1.name ="pushpak";
        obj1.age=23;
        System.out.println(obj1);
        C obj2 = (C) obj1.clone();
        obj2.name ="kuanal";
        System.out.println(obj2);
    }

}
