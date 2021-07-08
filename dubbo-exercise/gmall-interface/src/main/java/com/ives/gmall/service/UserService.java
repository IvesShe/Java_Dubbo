package com.ives.gmall.service;

import com.ives.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {

    // 按照用戶id返回所有的收貨地址
    public List<UserAddress> getUserAddressList(String userId);

}
