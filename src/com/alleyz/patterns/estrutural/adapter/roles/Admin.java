package com.alleyz.patterns.estrutural.adapter.roles;

public class Admin implements Role {

    @Override
    public boolean access() {
        return true;
    }

    @Override
    public int level() {
        return 0;
    }

}
