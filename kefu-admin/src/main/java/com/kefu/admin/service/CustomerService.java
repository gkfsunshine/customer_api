package com.kefu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kefu.admin.dto.CustomerPageDto;
import com.kefu.admin.entity.Customer;
import com.kefu.admin.entity.User;
import com.kefu.common.vo.PageVo;



/**
 * 用户服务接口
 *
 * @author feng
 * @date 2019-05-18
 */
public interface CustomerService extends IService<Customer> {


    /**
     * 分页查询所有用户详细信息
     *
     * @param customerPageDto 查询条件
     * @return
     */
    PageVo<Customer> findUserPageList(CustomerPageDto customerPageDto);

}
