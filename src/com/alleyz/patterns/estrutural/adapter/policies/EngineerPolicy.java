package com.alleyz.patterns.estrutural.adapter.policies;

public class EngineerPolicy implements Policy {

    @Override
    public int accessLevel() {
        return 5;
    }

}
