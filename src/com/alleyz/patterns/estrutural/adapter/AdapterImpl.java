package com.alleyz.patterns.estrutural.adapter;

import com.alleyz.patterns.Pattern;
import com.alleyz.patterns.estrutural.adapter.policies.DirectorPolicy;
import com.alleyz.patterns.estrutural.adapter.policies.EngineerPolicy;
import com.alleyz.patterns.estrutural.adapter.policies.Policy;
import com.alleyz.patterns.estrutural.adapter.roles.Role;

public class AdapterImpl implements Pattern {

    @Override
    public void execute() {
        this.printStartMessage();

        CriticalSystem system = new CriticalSystem();
        Policy policy = new EngineerPolicy();
        Role role = new RoleAdapter(policy);

        system.verifySystemAccess(role);

        policy = new DirectorPolicy();
        role = new RoleAdapter(policy);

        system.verifySystemAccess(role);
    }

    @Override
    public String getPatternName() {
        return "ADAPTER";
    }

}
