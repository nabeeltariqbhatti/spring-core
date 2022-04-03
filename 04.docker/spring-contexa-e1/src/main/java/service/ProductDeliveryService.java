package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ProductRepository;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/3/2022
 * @Time at 6:05 PM
 */

@Service
public class ProductDeliveryService {


    @Autowired
   private ProductRepository productRepository;
   public  void addProducts(){
       productRepository.add();
       productRepository.add();
   }
}
