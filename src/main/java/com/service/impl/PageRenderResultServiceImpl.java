package com.service.impl;

import com.dao.PageRenderResultDao;
import com.model.PageRenderResult;
import com.service.PageRenderResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2018/1/24 11:22
 * UpdateTime 2018/1/24 11:22
 */
@Service
public class PageRenderResultServiceImpl implements PageRenderResultService {

    @Autowired
    private PageRenderResultDao pageRenderResultDao;

    @Override
    public Optional<PageRenderResult> getOne(Map<String, Object> map) {
        return Optional.ofNullable(pageRenderResultDao.getOne(map));
    }
}
