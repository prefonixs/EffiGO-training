package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService{
    private TradeAccountRepository tradeAccountRepository;

    public CashAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount cashAccount= (CashAccount)tradeAccountRepository.retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().add(amount));
        updateTradeAccount(cashAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount cashAccount= (CashAccount)tradeAccountRepository.retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().subtract(amount));
        updateTradeAccount(cashAccount);
    }

    public void createTradeAccount(TradeAccount tradeAccount){
        tradeAccountRepository.createTradeAccount(tradeAccount);
    }

    public CashAccount retrieveTradeAccount(String id){
        return (CashAccount)tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(TradeAccount tradeAccount){
        tradeAccountRepository.updateTradeAccount(tradeAccount);
    }

    public void deleteTradeAccount(String id){
        tradeAccountRepository.deleteTradeAccount(id);
    }
}
