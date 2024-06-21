package net.java.banking.service;

import net.java.banking.dto.AccountDto;

import java.util.List;
public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    //going to get all the accounts exist so list is used
    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}