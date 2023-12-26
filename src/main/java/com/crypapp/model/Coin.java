package com.crypapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "id")
public class Coin {
    private Integer id;
    private String name;
    private LocalDateTime datatime;
    private int quantity;
    private BigDecimal price;
}
