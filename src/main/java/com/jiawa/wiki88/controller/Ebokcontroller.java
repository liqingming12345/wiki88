package com.jiawa.wiki88.controller;

import com.jiawa.wiki88.domain.Ebook;
import com.jiawa.wiki88.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class Ebokcontroller {

    @Resource
    private EbookService ebookService;

    @GetMapping("list")
    public List<Ebook> list(){
        return ebookService.list();
    }
}
