package com.joe.user.service;

import com.joe.user.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
public interface IAccountService extends IService<Account> {

    Account findById(Long id);

    /**
     * 减金额
     * @param id
     * @param money
     * @return
     */
    int reduceMoney(Long id,double money);
}
