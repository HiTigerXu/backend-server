package com.mike.server.server;

import com.mike.common.utils.Tools;
import com.mike.server.form.AccountForm;
import com.mike.server.model.AccountModel;
import com.mike.server.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository iAccountRepository;

    @Override
    public List<AccountModel> getAccountList(AccountForm accountForm) {

        PageRequest pageRequest = new PageRequest(Tools.getOffset(accountForm.getPage(), accountForm.getSize()), accountForm.getSize());

        return iAccountRepository.findAll(pageRequest).getContent();
    }
}
