package io.shj.shop.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = -2350304004897277253L;
    private Long id;
    private String proName;
    private BigDecimal proPrice;
    private Integer proStock;

}
