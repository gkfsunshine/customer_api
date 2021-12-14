package com.kefu.admin.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kefu.admin.entity.enums.GenderEnum;
import com.kefu.admin.entity.enums.UserStatusEnum;
import com.kefu.common.db.entity.BaseEntity;
import com.kefu.common.util.EnumValueDeserializer;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ToString(callSuper = true)
@TableName(value = "tb_customer")
public class Customer extends BaseEntity implements Serializable {

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 状态 [0.禁用 1.正常 2.已删除]
     */
    @TableField(value = "status")
    @JSONField(serializeUsing = EnumValueDeserializer.class, deserializeUsing = EnumValueDeserializer.class)
    private UserStatusEnum status;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    private static final long serialVersionUID = 1L;

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_STATUS = "status";

    public static final String COL_USERNAME = "username";
}
