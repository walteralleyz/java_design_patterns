package com.alleyz.patterns.estrutural.adapter.roles;

public class Visitor implements Role {

    @Override
    public boolean access() {
        return false;
    }

    @Override
    public int level() {
        return 3;
    }

}
