package com.example.EcommerceKaran.Services;

import com.example.EcommerceKaran.Dao.ReviewsDao;
import com.example.EcommerceKaran.Entities.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements  ReviewService{

    @Autowired
    private ReviewsDao reviewsDao;

    @Override
    public List<Reviews> showReviews() {
       List<Reviews> list= reviewsDao.findAll();
       return list;
    }
}
