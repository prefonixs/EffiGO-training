package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService{
    private TradeAccountRepository tradeAccountRepository;

    public MarginAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount marginAccount=(MarginAccount)tradeAccountRepository.retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().add(amount));
        updateTradeAccount(marginAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount marginAccount=(MarginAccount)tradeAccountRepository.retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
        updateTradeAccount(marginAccount);
    }

    public void createTradeAccount(TradeAccount tradeAccount){
        tradeAccountRepository.createTradeAccount(tradeAccount);
    }

    public MarginAccount retrieveTradeAccount(String id){
        return (MarginAccount)tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(TradeAccount tradeAccount){
        tradeAccountRepository.updateTradeAccount(tradeAccount);
    }

    public void deleteTradeAccount(String id){
        tradeAccountRepository.deleteTradeAccount(id);
    }
}