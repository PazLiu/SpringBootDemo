package com.ss.service.impl;

import com.github.pagehelper.PageHelper;
import com.ss.dao.TtfPinyinsMapper;
import com.ss.domain.TtfPinyins;
import com.ss.service.PinYinServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinYinServiceImpl implements PinYinServiceI{

    @Autowired
    TtfPinyinsMapper ttfPinyinsMapper;

    @Override
    public List<TtfPinyins> getAll(int num,   int size) {
        PageHelper.startPage(num, size);
        return ttfPinyinsMapper.getAll();
    }
}