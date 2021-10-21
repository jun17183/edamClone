package com.edam.controller;

import com.edam.service.MainService;
import com.edam.vo.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService MainService;

    @RequestMapping("/main")
    public String main(Model model) {
        List<GoodsEntity> newList = MainService.newProduct();
        model.addAttribute("newList", newList);

        List<GoodsEntity> bestList = MainService.bestProduct();
        model.addAttribute("bestList", bestList);

        List<GoodsEntity> mdsList = MainService.mdsPick();
        model.addAttribute("mdsList", mdsList);

        List<GoodsEntity> steadyList = MainService.steadySeller();
        model.addAttribute("steadyList", steadyList);

        return "main/main";
    }
}
