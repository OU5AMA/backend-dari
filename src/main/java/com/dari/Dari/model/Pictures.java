package com.dari.Dari.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Pictures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] imageData;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    public Pictures(byte[] imageData, Item item) {
        this.imageData = imageData;
        this.item = item;
    }
}
