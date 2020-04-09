import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

public class Application {


    public static void main(String[] args) {


        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(appConfig.class);


        CustomerService service =
                applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service);

        CustomerService service2 =
                applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service2);
        //CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findall().get(0).getFirstname());
        System.out.println(service.findall().get(0).getLastname());


    }


}
