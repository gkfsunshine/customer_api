package com.kefu.admin.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kefu.admin.common.jwt.JwtTokenUtils;
import com.kefu.admin.common.jwt.JwtUser;
import com.kefu.admin.common.jwt.JwtUserServiceImpl;
import com.kefu.admin.dto.CustomerDto;
import com.kefu.admin.dto.CustomerPageDto;
import com.kefu.admin.dto.UserDto;
import com.kefu.admin.dto.UserPageDto;
import com.kefu.admin.entity.Customer;
import com.kefu.admin.entity.Permission;
import com.kefu.admin.entity.Role;
import com.kefu.admin.entity.User;
import com.kefu.admin.entity.enums.PermissionTypeEnum;
import com.kefu.admin.mapper.CustomerMapper;
import com.kefu.admin.mapper.UserMapper;
import com.kefu.admin.service.*;
import com.kefu.admin.vo.ButtonVo;
import com.kefu.admin.vo.MenuVo;
import com.kefu.admin.vo.UserVo;
import com.kefu.common.db.util.PageUtils;
import com.kefu.common.exception.user.UserExistsException;
import com.kefu.common.exception.user.UserNotExistsException;
import com.kefu.common.util.tree.TreeUtils;
import com.kefu.common.vo.PageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户服务接口实现
 *
 * @author feng
 * @date 2019-05-18
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    /**
     * 新增客服
     *
     * @param customerDto
     */
    public void addCustomer(CustomerDto customerDto) {

    }

    /**
     * 分页查询所有用户详细信息
     *
     * @param customerPageDto 查询条件
     * @return
     */
    @Override
    public PageVo<Customer> findUserPageList(CustomerPageDto customerPageDto) {
        IPage<Customer> page = baseMapper.selectPageList(customerPageDto);
        return PageUtils.getPageVo(page);
    }
}
