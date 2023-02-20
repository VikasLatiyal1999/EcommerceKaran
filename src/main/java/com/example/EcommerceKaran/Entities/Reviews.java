package com.example.EcommerceKaran.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long review_id;

    private Long product_id;

    private String product_name;

    private String review;

    private Integer rating;

    private String reviewer_name;

    private String created_by;

    private Timestamp created_at;

    private Timestamp modified_at;

    private String modified_by;

    public Long getReview_id() {
        return review_id;
    }

    public void setReview_id(Long review_id) {
        this.review_id = review_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewer_name() {
        return reviewer_name;
    }

    public void setReviewer_name(String reviewer_name) {
        this.reviewer_name = reviewer_name;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getModified_at() {
        return modified_at;
    }

    public void setModified_at(Timestamp modified_at) {
        this.modified_at = modified_at;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public Reviews(Long review_id, Long product_id, String product_name, String review, Integer rating, String reviewer_name, String created_by, Timestamp created_at, Timestamp modified_at, String modified_by) {
        this.review_id = review_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.review = review;
        this.rating = rating;
        this.reviewer_name = reviewer_name;
        this.created_by = created_by;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.modified_by = modified_by;
    }

    public Reviews() {
    }

    @Override
    public String toString() {
        return "reviews{" +
                "review_id=" + review_id +
                ", product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", review='" + review + '\'' +
                ", rating=" + rating +
                ", reviewer_name='" + reviewer_name + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                ", modified_by='" + modified_by + '\'' +
                '}';
    }


}
