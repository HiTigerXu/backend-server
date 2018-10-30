package com.mike.server.server;

import com.mike.server.form.AccountForm;
import com.mike.server.model.AccountModel;

import java.util.List;

public interface IAccountService {

    List<AccountModel> getAccountList(AccountForm accountForm);
}
