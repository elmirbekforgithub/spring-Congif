package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.model.Cat;
import peaksoft.model.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springContext.xml");
        Cat dog=context.getBean("myCat",Cat.class);
        System.out.println(dog);
        dog.animalMinus();
        dog.animalPlus();
        Person person=context.getBean("myPerson",Person.class);
        System.out.println(person);
    }
}
