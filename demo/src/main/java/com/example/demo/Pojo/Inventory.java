package com.example.demo.Pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.ClientInfoStatus;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId;

    @Column(name = "bookInventory")
    String name;

    @Column(name = "count")
    int count;
}
