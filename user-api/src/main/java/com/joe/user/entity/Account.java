package com.joe.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.joe.seata.common.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Builder;



/**
 * <p>
 * 
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("t_account")
@Schema(description = "Account对象")
public class Account extends BaseEntity {

private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
  /**
   * 主键
   */
        @TableId(value = "id", type = IdType.AUTO)
        private Long id;

    @Schema(description = "用户名")
  /**
   * 用户名
   */
    @TableField("user_name")
    private String userName;

    @Schema(description = "账户余额")
  /**
   * 账户余额
   */
    @TableField("account_money")
    private Double accountMoney;


}
