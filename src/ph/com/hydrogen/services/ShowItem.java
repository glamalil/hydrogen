package ph.com.hydrogen.services;

import ph.com.hydrogen.model.Item;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowItem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Item item = (Item) context.getBean("seller");
		item.showItem();

		((AbstractApplicationContext) context).close();

	}
}
