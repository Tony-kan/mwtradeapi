package com.example.mwtrade_web_api.Entities;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@ToString
@Entity
@Table
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;

    private String brandName;
    private String brandImage;
    private String brandDescription;

    @OneToMany(mappedBy ="brand")
    private List<Product> products;

    public Brand(Long brandId,
                 String brandName,
                 String brandImage,
                 String brandDescription
                 ) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandImage = brandImage;
        this.brandDescription = brandDescription;
    }

}
