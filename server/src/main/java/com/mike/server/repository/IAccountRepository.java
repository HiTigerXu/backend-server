package com.mike.server.repository;

import com.mike.server.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<AccountModel, Integer> {
}
