package com.TeeVibes.TeeVibe.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wishlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class WishList {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    public WishList(User user, Product product) {
        this.user = user;
        this.product = product;
        this.createdDate = new Date();
    }

}
