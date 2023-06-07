package com.zemoso.logger;

import lombok.Data;

// By using lombok, it will automatically create constructor,getter,setter for the class.
// Use @Data annotation

@Data
public class Student {
    private Long id;
    private String name;
    private String phone;
}
