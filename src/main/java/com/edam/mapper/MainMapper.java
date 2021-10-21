package com.edam.mapper;

import com.edam.vo.GoodsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<GoodsEntity> newProduct();
    List<GoodsEntity> bestProduct();
    List<GoodsEntity> mdsPick();
    List<GoodsEntity> steadySeller();
}
