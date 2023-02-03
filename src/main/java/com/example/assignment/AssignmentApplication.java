package com.example.assignment;

import com.example.assignment.controller.PriceController;
import com.example.assignment.entity.Price;
import com.example.assignment.entity.Product;
import com.example.assignment.entity.Track;
import com.example.assignment.repository.PriceRepository;
import com.example.assignment.repository.ProductRepository;
import com.example.assignment.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private TrackRepository trackRepository;

	@Autowired
	private PriceRepository priceRepository;

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product p1 = new Product();
		p1.setAllProducts(Arrays.asList("BOX", "BOX", "PALLET"));
		p1.setOrderNumber("109347263");

		Product p2 = new Product();
		p2.setAllProducts(Arrays.asList("(ENVELOPE,", "BOX", "(ENVELOPE,"));
		p2.setOrderNumber("987654321");

		Product p3 = new Product();
		p3.setAllProducts(Arrays.asList("BOX", "(ENVELOPE,", "(ENVELOPE,"));
		p3.setOrderNumber("123456789");


		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);


		Track t1 = new Track();
		t1.setOrderNumber("109347263");
		t1.setStatus("IN_TRANSIT");

		Track t2 = new Track();
		t2.setOrderNumber("987654321");
		t2.setStatus("COLLECTING");

		Track t3 = new Track();
		t3.setOrderNumber("123456789");
		t3.setStatus("NEW");


		trackRepository.save(t1);
		trackRepository.save(t2);
		trackRepository.save(t3);





		Price priceNl = new Price();
		priceNl.setCountryCode("NL");
		priceNl.setCurrency(14.242090605778);

		Price priceCn = new Price();
		priceCn.setCountryCode("CN");
		priceCn.setCurrency(20.503467806384);

		priceRepository.save(priceNl);
		priceRepository.save(priceCn);




	}
}
