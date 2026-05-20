package com.xiang.ai.xiangAIAgent.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiang.ai.xiangAIAgent.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.ai.xiangAIAgent.model.dto.user.UserQueryRequest;
import com.xiang.ai.xiangAIAgent.model.vo.user.LoginUserVO;
import com.xiang.ai.xiangAIAgent.model.vo.user.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
* @author 19643
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2026-04-02 15:31:56
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 将用户信息转换为用户视图信息
     *
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 将用户列表转换为用户视图列表
     *
     * @param userList
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     *
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 获取加密后的密码
     *
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);

}
