package com.example.EcommerceKaran.Entities;

import javax.persistence.*;

@Entity
@Table(name="image_product_mapping")
public class ImageProductMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long product_id;

    private Long image_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getImage_id() {
        return image_id;
    }

    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    public ImageProductMapping(Long id, Long product_id, Long image_id) {
        this.id = id;
        this.product_id = product_id;
        this.image_id = image_id;
    }

    public ImageProductMapping() {
    }

    @Override
    public String toString() {
        return "image_product_mapping{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", image_id=" + image_id +
                '}';
    }

}
