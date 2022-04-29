package com.antonbondoc.AnoUlam.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Restaurant {

    @Id
    @SequenceGenerator(
            name = "restaurant_sequence",
            sequenceName = "restaurant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "restaurant_sequence"
    )
    private Long restaurantId;
    private String name;
    private String priceRange;

    private String imagePath;

    @Column(
            columnDefinition = "LONGTEXT"
    )
    private String description;

    @ElementCollection
    @CollectionTable(
            name = "keypoint",
            joinColumns = @JoinColumn(
                    name="keypoint_id"
            )
    )
    @Column(
            name = "keypoint",
            columnDefinition = "LONGTEXT"
    )
    private List<String> keypoints;
}
