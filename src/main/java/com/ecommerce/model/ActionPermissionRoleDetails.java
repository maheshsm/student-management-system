package com.ecommerce.model;

public class ActionPermissionRoleDetails {
    private Integer id;
    private Integer actionId;
    private Integer roleId;

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "ActionPermissionRoleDetails [id=" + id + ", actionId=" + actionId + ", roleId=" + roleId + "]";
    }
}
