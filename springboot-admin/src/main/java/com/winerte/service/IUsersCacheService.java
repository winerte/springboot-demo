package com.winerte.service;

import com.winerte.model.Resource;
import com.winerte.model.Users;

import java.util.List;

/**
 * 用户缓存
 */
public interface IUsersCacheService {
    /**
     * 删除后台用户缓存
     */
    void delAdminUserByUserId(Long usersId);

    /**
     * 删除后台用户资源列表缓存
     */
    void delResourceListByUserId(Long usersId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     */
    void delResourceListByRoleId(Long roleId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * 当资源信息改变时，删除资源项目后台用户缓存
     */
    void delResourceListByResourceId(Long resourceId);

    /**
     * 获取缓存后台用户信息
     */
    Users getAdminUserByUsername(String username);

    /**
     * 设置缓存后台用户信息
     */
    void setAdminUser(Users users);

    /**
     * 获取缓存后台用户资源列表
     */
    List<Resource> getResourceListByUserId(Long usersId);

    /**
     * 设置后台后台用户资源列表
     */
    void setResourceList(Long adminId, List<Resource> resourceList);
}
