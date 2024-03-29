package com.winerte.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.winerte.dto.RolePageQueryParam;
import com.winerte.model.Menu;
import com.winerte.model.Resource;
import com.winerte.model.Role;
import com.winerte.vo.RoleVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 服务类
 * </p>
 *
 * @author 石磊
 * @since 2022-03-03
 */
public interface IRoleService extends IService<Role> {

   

    /**
     * 根据管理员ID获取对应菜单
     */
    List<Menu> getMenuList(Long userId);

    /**
     * 获取角色相关菜单
     */
    List<Menu> listMenu(Long roleId);

    /**
     * 获取角色相关资源
     */
    List<Resource> listResource(Long roleId);

    /**
     * 给角色分配菜单
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * 给角色分配资源
     */
    @Transactional
    int allocResource(Long roleId, List<Long> resourceIds);

    /**
     * 自定义分页查询
     *
     */
    IPage<RoleVo> findByPage(RolePageQueryParam param);

    boolean batchRemove(List<Long> roleIds);
  
}
