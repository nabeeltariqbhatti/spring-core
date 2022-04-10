package service;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTenProducts(){
        for(int i=0;i<10;i++){
            productRepository.addProduct(new Product().setName("Product"+i).setPrice(i));
            if(i==5) {
                throw new RuntimeException(":(");
            }
        }
    }
}
