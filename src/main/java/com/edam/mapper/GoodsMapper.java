package com.edam.mapper;

import com.edam.vo.GoodsEntity;
import com.edam.vo.GoodsSortEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    // 굿즈 시리즈(메뉴) 종류
    List<GoodsSortEntity> getGoodsSortList();
    // 선택한 굿즈 시리즈
    GoodsSortEntity getChoiceSort(GoodsEntity param);
    // 해당 시리즈 상품 종류 갯수
    int allGoodsCount(GoodsEntity param);

    // 판매 인기순 리스트
    List<GoodsEntity> popularList(GoodsEntity param);
    List<GoodsEntity> popularListSoldOut(GoodsEntity param);

    // 높은 가격순 리스트
    List<GoodsEntity> highPriceList(GoodsEntity param);
    List<GoodsEntity> highPriceListSoldOut(GoodsEntity param);

    // 낮은 가격순 리스트
    List<GoodsEntity> lowPriceList(GoodsEntity param);
    List<GoodsEntity> lowPriceListSoldOut(GoodsEntity param);

}
