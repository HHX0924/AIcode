package com.yupi.yuaicodemother.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.yupi.yuaicodemother.model.dto.app.AppAddRequest;
import com.yupi.yuaicodemother.model.dto.app.AppQueryRequest;
import com.yupi.yuaicodemother.model.entity.App;
import com.yupi.yuaicodemother.model.entity.User;
import com.yupi.yuaicodemother.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 *  服务层。
 *
 * @author xxx
 */
public interface AppService extends IService<App> {
    public AppVO getAppVO(App app);

    public QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    public List<AppVO> getAppVOList(List<App> appList);

    public Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    public String deployApp(Long appId, User loginUser);

    public  void generateAppScreenshotAsync(Long appId, String appUrl);

    public Long createApp(AppAddRequest appAddRequest, User loginUser);
}
