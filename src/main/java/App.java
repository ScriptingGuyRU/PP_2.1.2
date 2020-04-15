import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld firstHello =  (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondHello =  (HelloWorld) applicationContext.getBean("helloworld");

        Cat firstCat = (Cat) applicationContext.getBean("cat");
        Cat secondCat = (Cat) applicationContext.getBean("cat");


        System.out.println("Hello word wth Singlton: " + (firstHello == secondHello));
        System.out.println("Hello word wth Prototype: " + (firstCat == secondCat));
    }
}