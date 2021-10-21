package com.edam.controller;

import com.edam.service.GoodsService;
import com.edam.vo.GoodsEntity;
import com.edam.vo.GoodsSortEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService GoodsService;

    @RequestMapping(value = "/{sort_id}/{orderby}")
    public String goods(@PathVariable int sort_id, @PathVariable int orderby, Model model) {

        // 굿즈 시리즈(메뉴) 종류 리스트
        List<GoodsSortEntity> sort = GoodsService.getGoodsSortList();
        model.addAttribute("sort", sort);

        // 클릭한 메뉴에 해당하는 굿즈 리스트
        GoodsEntity param = new GoodsEntity();
        param.setSort_id(sort_id);

        List<GoodsEntity> list = null;
        List<GoodsEntity> soldOut = null;

        if (orderby == 1) { // 판매 인기순
            list = GoodsService.popularList(param);
            soldOut = GoodsService.popularListSoldOut(param);
        } else if (orderby == 2) {  // 높은 가격순
            list = GoodsService.highPriceList(param);
            soldOut = GoodsService.highPriceListSoldOut(param);
        } else if (orderby == 3) {  // 낮은 가격순
            list = GoodsService.lowPriceList(param);
            soldOut = GoodsService.lowPriceListSoldOut(param);
        }

        model.addAttribute("list", list);
        model.addAttribute("soldOut", soldOut);

        // 클릭한 메뉴(시리즈)
        GoodsSortEntity nowSort = GoodsService.getChoiceSort(param);
        model.addAttribute("nowSort", nowSort);

        // 클릭한 메뉴의 배너
        String banner = GoodsService.getChoiceSort(param).getBanner();
        model.addAttribute("banner", banner);

        // 선택한 시리즈 굿즈 종류 갯수
        int count = GoodsService.allGoodsCount(param);
        model.addAttribute("count", count);

        return "goods/goods";
    }
}
