package com.Aakash.HibernateMapping;

import com.Aakash.HibernateMapping.entity.Customer;
import com.Aakash.HibernateMapping.entity.Item;
import com.Aakash.HibernateMapping.repository.CustomerRepo;
import com.Aakash.HibernateMapping.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingApplication implements CommandLineRunner {
		@Autowired
		private CustomerRepo customerRepo;

		@Autowired
		private ItemRepo itemRepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//			Customer a = new Customer("Aakash");
//			Item b  = new Item("Laptop");
//				a.setItem(b);
//			customerRepo.save(a);
		Customer a = new Customer("AA");
		Item b  = new Item("Laptop");
		Item c  = new Item("Phone");
		Item d  = new Item("Pc");

		a.getItems().add(b);
		a.getItems().add(c);
		a.getItems().add(d);



		customerRepo.save(a);



	}
}
