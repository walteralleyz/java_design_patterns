package com.alleyz.patterns.estrutural.adapter;

import com.alleyz.patterns.estrutural.adapter.policies.Policy;
import com.alleyz.patterns.estrutural.adapter.roles.Role;

import java.util.Objects;

public class RoleAdapter implements Role {

    private final Policy policy;

    public RoleAdapter(Policy policy) {
        this.policy = policy;
    }

    @Override
    public boolean access() {
        return Objects.nonNull(this.policy) && this.policy.accessLevel() > 5;
    }

    @Override
    public int level() {
        if(Objects.isNull(this.policy)) {
            return 3;
        }

        if(this.policy.accessLevel() <= 5) {
            return 2;
        }

        return 1;
    }

}
