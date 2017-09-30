package com.maple.model;

import org.apache.ibatis.type.Alias;

@Alias("role")
public class Role {
    private Long roleId;
    private String roleName;

    public Long getRoleIdId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
