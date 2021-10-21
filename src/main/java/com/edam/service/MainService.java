package com.edam.service;

import com.edam.mapper.MainMapper;
import com.edam.vo.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainMapper MainMapper;

    public List<GoodsEntity> newProduct() { return MainMapper.newProduct(); }
    public List<GoodsEntity> bestProduct() { return MainMapper.bestProduct(); }
    public List<GoodsEntity> mdsPick() { return MainMapper.mdsPick(); }
    public List<GoodsEntity> steadySeller() { return MainMapper.steadySeller(); }
}
