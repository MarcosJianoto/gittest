package com.example.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Order;
import com.example.demo.entities.User;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Marcos", "marcos@gmail.com", "151521125", "123456");
        User u2 = new User(null, "Pedro", "pedro@gmail.com", "452523523", "12345");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-06-20T19:02:07Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-06-20T19:21:07Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
