package platform.codingnomads.co.corespring.lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyCoreLabApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                MyCoreLabConfig.class);

        Office office = context.getBean(Office.class);
        System.out.println("Property Owner = " + office.getOwnerName());
        System.out.println("Number of Lease Holders = " + office.getNumLeaseHolders());
        System.out.println("Number of Stories = " + office.getStories());

        String[] houses = context.getBeanNamesForType(House.class);

        for (String house : houses) {
            System.out.println("\nOwner's Name: " + context.getBean(house, House.class).getOwnerName());
            System.out.println("Number of Bedrooms: " + context.getBean(house, House.class).getNumBedrooms());
            System.out.println("Number of Bathrooms: " + context.getBean(house, House.class).getNumBathrooms());
        }
    }
}
