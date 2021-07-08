package com.ives.gmall.service.impl;

import com.ives.gmall.bean.UserAddress;
import com.ives.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....old...");
        // TODO Auto-generated method stub
        UserAddress address1 = new UserAddress(1, "台北市羅斯福路四段5號1樓", "1", "李小姐", "0912123456", "Y");
        UserAddress address2 = new UserAddress(2, "新北市永和區成功路91號1樓", "1", "王小姐", "0988168168", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        return Arrays.asList(address1,address2);
    }

}