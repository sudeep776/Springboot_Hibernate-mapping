package com.JPA.Mapping;
// [...]
import com.JPA.Mapping.entities.*;
import com.JPA.Mapping.repositories.CategoryRepo;
import com.JPA.Mapping.repositories.ProductRepo;
import com.JPA.Mapping.repositories.StudentRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;



@SpringBootApplication
public class MappingApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	@Autowired
	private StudentRepository studentRepo;

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {

		SpringApplication.run(MappingApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//One to one mapping // - whichever model has mapped by with opposite object the opposite object has to set the model object
//		Student student = new Student();
//		student.setStudentName("Sudeep");
//		student.setAbout("I am software engineer");
//		student.setStudentId(13);
//
//
//		Laptop laptop = new Laptop();
//		laptop.setModelNumber("14314");
//		laptop.setBrand("HP");
//		laptop.setLaptopId(1231);
//
//		//important
//		//setting student in laptop is more important as it contains foreign key
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//
//		studentRepo.save(student);

		//getting laptop details from student
//		Student student = studentRepo.findById(1).get();
//		logger.info("Name is {}",student.getStudentName());
//
//		Laptop laptop = student.getLaptop();
//		logger.info("Laptop {},{}",laptop.getBrand(),laptop.getModelNumber());


		//One to many mapping - if unidirectional mapping is done a new table is created with primary ids
//		Student student = new Student();
//		student.setStudentName("Rahul");
//		student.setAbout("I am Data scientist");
//		student.setStudentId(15);
//
//		Address a1 = new Address();
//		a1.setAddressId(131);
//		a1.setStreet("235/235");
//		a1.setCity("LKO");
//		a1.setCountry("IND");
//		a1.setStudent(student);
//
//		Address a2 = new Address();
//		a2.setAddressId(132);
//		a2.setStreet("421/235");
//		a2.setCity("BNG");
//		a2.setCountry("IND");
//		a2.setStudent(student);
//
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//
//		student.setAddressList(addressList);
//		studentRepo.save(student);
//		logger.info("Student created: with address");

		//Many to many mapping
//		Product product1 = new Product();
//		product1.setPId("pid1");
//		product1.setProductName("Iphone 14 max");
//
//		Product product2 = new Product();
//		product2.setPId("pid2");
//		product2.setProductName("Samsung s22 ultra");
//
//		Product product3 = new Product();
//		product3.setPId("pid3");
//		product3.setProductName("Samsung tv");
//
//		Category category1 = new Category();
//		category1.setCId("cid1");
//		category1.setTitle("Electronics");
//
//		Category category2 = new Category();
//		category2.setCId("cid2");
//		category2.setTitle("Mobile Phone");
//
//		List<Product> category1Products = category1.getProducts();
//		category1Products.add(product1);
//		category1Products.add(product2);
//		category1Products.add(product3);
//
//		List<Product> category2Products = category2.getProducts();
//		category2Products.add(product1);
//		category1Products.add(product2);
//
//		categoryRepo.save(category1);
//		categoryRepo.save(category2);
	}

	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ProductRepo productRepo;
}

