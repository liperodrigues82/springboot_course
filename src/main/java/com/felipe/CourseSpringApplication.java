package com.felipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseSpringApplication {
	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private OrderRepository orderRepository;
//	
//	@Autowired
//	private CategoryRepository categoryRepository;
//	
//	@Autowired
//	private ProductRepository productRepository;
//	
//	@Autowired
//	private OrderItemRepository orderItemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CourseSpringApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Category cat1 = new Category(null, "Electronics");
//		Category cat2 = new Category(null, "Books");
//		Category cat3 = new Category(null, "Computers");
//		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
//		
//		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
//		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
//		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
//		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
//		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
//		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
//		
//		p1.getCategories().add(cat2);
//		p2.getCategories().add(cat1);
//		p2.getCategories().add(cat3);
//		p3.getCategories().add(cat3);
//		p4.getCategories().add(cat3);
//		p5.getCategories().add(cat2);
//		
//		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
//		
//		User u1 = new User(null, "Maria Brown", "maria@email.com", "988887777", "12345678");
//		User u2 = new User(null, "Alex Brown", "alex@email.com", "988885555", "12345678");
//		userRepository.saveAll(Arrays.asList(u1, u2));
//		
//		Order o1 = new Order(null, Instant.parse("2022-02-01T23:54:12Z"), OrderStatus.PAID, u1);
//		Order o2 = new Order(null, Instant.parse("2022-02-03T12:33:59Z"), OrderStatus.WAITING_PAYMENT, u2);
//		Order o3 = new Order(null, Instant.parse("2022-02-03T14:02:02Z"), OrderStatus.WAITING_PAYMENT, u1);
//		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
//		
//		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice()); 
//		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice()); 
//		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice()); 
//		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
//		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
//		
//		Payment pay1 = new Payment(null, Instant.parse("2022-02-02T02:54:12Z"), o1);
//		o1.setPayment(pay1);
//		orderRepository.save(o1);
//	}

}
