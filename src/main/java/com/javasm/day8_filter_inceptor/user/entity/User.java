package com.javasm.day8_filter_inceptor.user.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2026-10-27 19:13:06
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends Model<User> {

    private Long id;

    private String username;

    private Integer age;

    private String password;

    private String image;

    private Double balance;

    private Date createTime;

    private Date updateTime;

    private Long rid;

    private Integer did;
}

