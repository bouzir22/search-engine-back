package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products")

public class Product {
    @Id
    private String id;
    private String name;
    private String description;

    public String getId()
    {return id;}
}
