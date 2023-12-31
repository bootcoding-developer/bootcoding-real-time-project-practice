package com.bootcoding.user.command.impl;

import com.bootcoding.user.command.Command;
import com.bootcoding.user.model.Result;
import com.bootcoding.user.utils.Application;

public class ExitCommand implements Command {
    @Override
    public Result execute(String[] attributes) {
        System.out.println("Exiting Command App!");
        return null;
    }

}
