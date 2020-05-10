package com.lgr.lgruser.ServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgr.lgrcommonservicefacade.Service.UserService.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String helloDubbo() {
        return "hello dubbo";
    }
}
