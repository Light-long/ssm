package com.it.service.impl;

import com.it.dao.AccountDao;
import com.it.domain.Account;
import com.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有、、、");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("保存账户。。。");
        accountDao.saveAccount(account);
    }
}
