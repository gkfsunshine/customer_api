package com.kefu.admin.dto;

import com.kefu.admin.entity.Customer;
import com.kefu.admin.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author feng
 * @date 2019-05-28
 */
@Data
public class CustomerDto implements Serializable {
    private static final long serialVersionUID = -6690577031713839293L;

    /**
     * 用户信息
     */
    private Customer userInfo;

}
