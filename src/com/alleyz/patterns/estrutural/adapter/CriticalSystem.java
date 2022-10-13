package com.alleyz.patterns.estrutural.adapter;

import com.alleyz.patterns.estrutural.adapter.roles.Role;

public class CriticalSystem {

    void verifySystemAccess(Role role) {
        if(role.access()) {
            System.out.println("Acessou");
            return;
        }

        System.out.println("Impossivel acessar");
    }

}
