package com.jumayev.market_project.ROLES;

import java.util.List;



public enum Role {
    ADMIN(List.of(Permission.CREATE,Permission.READ,Permission.UPDATE,Permission.DELETE)),
    USER(List.of(Permission.READ));
    private List<Permission> permissions;

    Role(List<Permission> permissions){
        this.permissions = permissions;
    }

    public List<Permission> getPermissions(){
        return permissions;
    }
}
