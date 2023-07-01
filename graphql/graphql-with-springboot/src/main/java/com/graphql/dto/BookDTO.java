package com.graphql.dto;


import lombok.Data;

@Data
public class BookDTO {
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
