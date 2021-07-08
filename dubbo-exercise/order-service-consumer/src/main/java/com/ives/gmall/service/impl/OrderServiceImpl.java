package com.ives.gmall.service.impl;

import com.ives.gmall.bean.UserAddress;
import com.ives.gmall.service.OrderService;
import com.ives.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.將服務提供者註冊到註冊中心(暴露服務)
 *      - 導入dubbo依賴
 *      - 配置服務提供者
 * 2.讓服務消費者去註冊中心訂閱服務提供者的服務地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId){
        System.out.println("用戶id： "+userId);
        // 查詢用戶的收貨地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        //System.out.println(addressList);
        for(UserAddress userAddress:addressList){
            System.out.println(userAddress.getUserAddress());
        }
    }

}
