package com.joe.user.service.impl;

import com.joe.user.entity.Account;
import com.joe.user.mapper.AccountMapper;
import com.joe.user.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
@DubboService
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

    @Override
    public Account findById(Long id) {

        return this.baseMapper.selectById(id);
    }

    @Override
    public int reduceMoney(Long id, double money) {
        int result = this.baseMapper.reduceMoney(money, id);
        return result;
    }
}
