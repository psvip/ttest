package test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Dog> dogs=new ArrayList<>();
       Dog dog=new Dog();
       Dog dog1=new Dog();
       dog.setAge(3);
       dog.setName("Amy");
        dogs.add(dog);
        dog1.setAge(5);
        dog1.setName("bmy");
        dogs.add(dog1);
        for(Dog d :dogs){
            System.out.println(d);
        }
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        b.add(3);
        b.add(4);
        a.addAll(b);
        a.set(1,10);
        if (a.contains(3)) {
            System.out.println("true");
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
