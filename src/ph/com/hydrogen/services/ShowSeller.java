package ph.com.hydrogen.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ph.com.hydrogen.model.Seller;

public class ShowSeller {
	
	public static void main(String []args)
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Seller seller = (Seller) context.getBean("seller");
		seller.showSeller();
		((AbstractApplicationContext)context).close();
		
		

		
		
	}

}
