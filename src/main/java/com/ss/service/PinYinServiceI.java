package com.ss.service;

import com.ss.domain.TtfPinyins;

import java.util.List;

public interface PinYinServiceI {

    List<TtfPinyins> getAll(int num,  int size);
}
