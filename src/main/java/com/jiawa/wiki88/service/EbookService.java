package com.jiawa.wiki88.service;

import com.jiawa.wiki88.domain.Ebook;
import com.jiawa.wiki88.domain.EbookExample;
import com.jiawa.wiki88.mapper.EbookMapper;
import com.jiawa.wiki88.req.EbookReq;
import com.jiawa.wiki88.resp.EbookResp;
import com.jiawa.wiki88.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req ){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

       /* List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
           // EbookResp ebookResp = new EbookResp();
           // BeanUtils.copyProperties(ebook,ebookResp);
           //对象复制
            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
            respList.add(ebookResp);
        }*/

        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);

        return list;
    }
}
