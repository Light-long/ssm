package com.it.service;

import com.it.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有
    List<Account> findAll();

    //保存账户
    void saveAccount(Account account);
}
