package com.joe.user.mapper;

import com.joe.user.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    @Update("update t_account set account_money=account_money - #{money} where id = #{id}")
    int reduceMoney(@Param("money") double money,@Param("id") Long id);
}
