package com.edam.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GoodsEntity {
    private String nm;
    private String price;
    private String src;
    private String sort;
    private int sort_id;
    private int amount;
    private int sales;
    private String regd;
}
