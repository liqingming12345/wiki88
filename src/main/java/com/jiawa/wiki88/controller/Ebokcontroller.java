package com.jiawa.wiki88.controller;

import com.jiawa.wiki88.domain.Ebook;
import com.jiawa.wiki88.req.EbookReq;
import com.jiawa.wiki88.resp.CommonResp;
import com.jiawa.wiki88.resp.EbookResp;
import com.jiawa.wiki88.resp.PageResp;
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
    public CommonResp list(EbookReq req){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
