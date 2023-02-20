package com.example.EcommerceKaran.Entities;

import javax.persistence.*;
import java.util.Arrays;
@Entity
@Table(name="images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long image_id;

    private byte[] image;

    public Long getImage_id() {
        return image_id;
    }

    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Images(Long image_id, byte[] image) {
        this.image_id = image_id;
        this.image = image;
    }

    public Images() {
    }

    @Override
    public String toString() {
        return "images{" +
                "image_id=" + image_id +
                ", image=" + Arrays.toString(image) +
                '}';
    }

}
