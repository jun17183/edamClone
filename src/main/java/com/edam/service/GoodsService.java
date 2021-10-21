package com.edam.service;

import com.edam.mapper.GoodsMapper;
import com.edam.vo.GoodsEntity;
import com.edam.vo.GoodsSortEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper GoodsMapper;

    // 굿즈 시리즈(메뉴) 종류
    public List<GoodsSortEntity> getGoodsSortList() { return GoodsMapper.getGoodsSortList(); }
    // 선택한 굿즈 시리즈
    public GoodsSortEntity getChoiceSort(GoodsEntity param) { return GoodsMapper.getChoiceSort(param); }
    // 선택한 시리즈 상품 종류 갯수
    public int allGoodsCount(GoodsEntity param) { return GoodsMapper.allGoodsCount(param); }

    // 판매 인기순 리스트
    public List<GoodsEntity> popularList(GoodsEntity param) { return GoodsMapper.popularList(param); }
    public List<GoodsEntity> popularListSoldOut(GoodsEntity param) { return GoodsMapper.popularListSoldOut(param); }

    // 높은 가격순 리스트
    public List<GoodsEntity> highPriceList(GoodsEntity param) { return GoodsMapper.highPriceList(param); }
    public List<GoodsEntity> highPriceListSoldOut(GoodsEntity param) { return GoodsMapper.highPriceListSoldOut(param); }

    // 낮은 가격순 리스트
    public List<GoodsEntity> lowPriceList(GoodsEntity param) { return GoodsMapper.lowPriceList(param); }
    public List<GoodsEntity> lowPriceListSoldOut(GoodsEntity param) { return GoodsMapper.lowPriceListSoldOut(param); }
}
