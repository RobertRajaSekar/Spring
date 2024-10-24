package dependancyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("dependancy.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Laptop laptop=(Laptop )beanFactory.getBean("laptop");
	Charger charger=(Charger)beanFactory.getBean("c");
	System.out.println(laptop);
	System.out.println(charger);
	
//	get the entire 2 objects
	Laptop laptop2=beanFactory.getBean("laptop",Laptop.class);
	System.out.println(laptop2);
}
}
