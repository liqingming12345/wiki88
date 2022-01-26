package com.jiawa.wiki88.service;

import com.jiawa.wiki88.domain.Test;
import com.jiawa.wiki88.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
