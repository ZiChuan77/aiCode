package com.fatchuan.chuanaicodemother.service;

import com.fatchuan.chuanaicodemother.model.dto.app.AppQueryRequest;
import com.fatchuan.chuanaicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.fatchuan.chuanaicodemother.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/ZiChuan77">fatchuan</a>
 */
public interface AppService extends IService<App> {


    /**
     * 获取应用封装类
     *
     * @param app
     * @return
     */
    public AppVO getAppVO(App app);


    /**
     * 构造应用查询条件
     *
     * @param appQueryRequest
     * @return
     */
    public QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest) ;

    /**
     * 获取app封装列表
     * @param appList
     * @return
     */
    public List<AppVO> getAppVOList(List<App> appList);

}
