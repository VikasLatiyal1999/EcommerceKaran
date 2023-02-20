package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Dao.ProductDao;
import com.example.EcommerceKaran.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductDao productDao;

//    private Product pr;

    @Override
    public String addProduct(Product product) {

        if(product!=null)
        {
            List<Product> list= productDao.findAll();
            for(Product n:list){
                if(n.getProduct_name().equals(product.getProduct_name())){
                    return "Product already exist";
                }
            }
            Product pr = new Product();
            pr.setProduct_name(product.getProduct_name());
            pr.setPrice(product.getPrice());
            pr.setDescription(product.getDescription());
            pr.setStatus("Active");
            Date date = new Date();
            Timestamp ts=new Timestamp(date.getTime());
            pr.setCreated_at(ts);
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String username = authentication.getName();
            pr.setCreated_by(username);

            productDao.save(pr);
            return "Product added successfully";



        }

        return null;
    }

    @Override
    public String removeProduct(Long id) {
        Product pr = new Product();
       if(productDao.findById(id).get()==null) {
           return "No such product exist";
       }
       else{
           pr= productDao.findById(id).get();
           pr.setStatus("Inactive");
           return "deleted sucessfully";

       }

    }

    @Override
    public List<Product> showProduct() {
      List<Product> list=  productDao.findAll();
      return list;
    }

    @Override
    public String updateProduct(Product product) {
        Product pr = new Product();
        Long id=product.getId();
       if(productDao.findById(id).get()==null){
           return "no such product exist";
       }
       else{
           pr=productDao.findById(id).get();
           if(product.getProduct_name()!=null){
               pr.setProduct_name(product.getProduct_name());
           }
           if(product.getDescription()!=null)
           {
               pr.setDescription(product.getDescription());
           }
           if(product.getPrice()!=null){
               pr.setPrice(product.getPrice());
           }
           Date date = new Date();
           Timestamp ts=new Timestamp(date.getTime());
           pr.setModified_at(ts);
           Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
           String username = authentication.getName();
           pr.setModified_by(username);
           productDao.save(pr);
           return"updated successfully";

       }
    }
}
