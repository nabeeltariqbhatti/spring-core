package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/6/2022
 * @Time at 10:59 PM
 */

@Aspect
@Component
public class HelloServiceAspect {
    @Before("execution(* service.HelloService.hello(..))")
    public void before(){
        System.out.println("I am before");
    }

    @After("execution(* service.HelloService.hello(..))")
    public void after(){
        System.out.println("I am after");
    }
}
