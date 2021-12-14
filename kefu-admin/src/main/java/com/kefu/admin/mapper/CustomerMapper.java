package com.kefu.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kefu.admin.dto.CustomerPageDto;
import com.kefu.admin.dto.UserPageDto;
import com.kefu.admin.entity.Customer;
import com.kefu.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

    /**
     * 查询用户分页列表
     * 结果集带用户团队信息
     *
     * @param customerPageDto 用户分页查询条件
     * @return
     */
    IPage<Customer> selectPageList(CustomerPageDto customerPageDto);


}
