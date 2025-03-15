package com.carrypigeon.server.mapper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserMapper {

    @TableId(type = IdType.AUTO)
    private long id;

    private String username;
    private String password;
    private String email;
    private String phoneNumber;
}
