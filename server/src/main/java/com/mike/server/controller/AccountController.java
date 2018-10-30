package com.mike.server.controller;

import com.mike.common.Response;
import com.mike.common.utils.Service;
import com.mike.server.form.AccountForm;
import com.mike.server.model.AccountModel;
import com.mike.server.server.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account-list")
    public Response search(AccountForm accountForm) {

        List<AccountModel> result = accountService.getAccountList(accountForm);
        return new Response(new Service(result, 100, accountForm.getPage(), accountForm.getSize()));
    }
}
