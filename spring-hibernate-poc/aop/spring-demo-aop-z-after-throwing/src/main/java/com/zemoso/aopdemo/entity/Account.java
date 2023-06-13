package com.zemoso.aopdemo.entity;

import lombok.Data;


@Data
public class Account {
    private String name;
    private String level;

    public Account() {
    }

    public Account(String name, String level) {
        this.name = name;
        this.level = level;
    }


}
