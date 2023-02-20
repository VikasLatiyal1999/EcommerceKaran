package com.example.EcommerceKaran.controller;

import com.example.EcommerceKaran.Entities.OrderTable;
import com.example.EcommerceKaran.Entities.Product;
import com.example.EcommerceKaran.Entities.Reviews;
import com.example.EcommerceKaran.Entities.UserTable;
import com.example.EcommerceKaran.Modal.JwtRequest;
import com.example.EcommerceKaran.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmo")
public class MyController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private CustomUserDetailService customUserDetailService;

    public String home(){
        return "This is Home Page";
    }



   @CrossOrigin
     @PostMapping("/addProduct")
     public String addProduct(@RequestBody Product product)
     {
        String result= this.productService.addProduct(product);
        return result;
     }

     @CrossOrigin
    @PostMapping("/removeProduct")
    public String removeProduct(@RequestParam Long id)
     {
         String result=this.productService.removeProduct(id);
         return  result;
     }

     @CrossOrigin
    @GetMapping("/showProduct")
    public List<Product> showProduct(){
        List<Product> result=this.productService.showProduct();
        return  result;
     }

     @CrossOrigin
    @PostMapping("/updateProduct")
    public String updateProduct(@RequestBody Product product){
        String result = this.productService.updateProduct(product);
        return  result;
     }

     @CrossOrigin
    @GetMapping("/showOrders")
    public List<OrderTable> showOrders(){
        List<OrderTable> result=this.orderService.showOrders();
        return result;
     }
     @CrossOrigin
    @GetMapping("/showReviews")
    public List<Reviews> showReviews(){
        List<Reviews> result = this.reviewService.showReviews();
        return result;
     }

}
