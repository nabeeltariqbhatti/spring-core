package service;

import org.springframework.stereotype.Service;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/6/2022
 * @Time at 10:53 PM
 */

@Service
public class HelloService {

    public String hello(String name) {
        String message = "Hello, " + name + "!";
        System.out.println( message );
        return message;
    }
}
