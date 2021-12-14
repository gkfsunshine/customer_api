package com.kefu.admin.controller.system;


import com.alibaba.fastjson.JSON;
import com.kefu.admin.dto.CustomerPageDto;
import com.kefu.admin.dto.UserPageDto;
import com.kefu.admin.service.CustomerService;
import com.kefu.admin.service.UserService;
import com.kefu.common.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 *
 * @author feng
 * @date 2019-05-19
 */
@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public String addCustomerUser()
    {


        return "a";
    }

    /**
     * 获取用户分页数据
     *
     * @param customerPageDto 分页查询条件
     * @return
     */
    @PostMapping("/list")
    public ResultVo getCustomerUserList(@RequestBody CustomerPageDto customerPageDto) {
        log.info("获取用户分页数据,{}", JSON.toJSONString(customerPageDto));
        return ResultVo.success(customerService.findUserPageList(customerPageDto));
    }


}
