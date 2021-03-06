package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans/Spring.xml"));
		Employee employee = (Employee) factory.getBean("emp");
  
  System.out.println(employee.getCode()+" "+employee.getName()+" "+employee.getAddr().getCity());
	}

}
