package top.wanzc.spring.boot.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import top.wanzc.spring.boot.jpa.model.UserDetail;
import top.wanzc.spring.boot.jpa.param.UserDetailParam;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
