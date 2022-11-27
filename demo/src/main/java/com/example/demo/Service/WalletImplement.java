package com.example.demo.Service;

import com.example.demo.Pojo.Author;
import com.example.demo.Pojo.Wallet;
import com.example.demo.Repositry.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WalletImplement implements WalletInterface {

    @Autowired
    private WalletRepo walletRepo;
    @Override
    public Wallet createWallet(Wallet user) {
        return this.walletRepo.save(user);
    }

    @Override
    public Wallet updateWallet(Wallet wallet) {
        Optional<Wallet> walletObj = this.walletRepo.findById(wallet.getWalletId());
        if(walletObj.isPresent()){
            Wallet updatedWallet = walletObj.get();
            updatedWallet.setMoney(wallet.getMoney());
            return this.walletRepo.save(updatedWallet);
        } else {
            throw new RuntimeException("Wallet does not exist");
        }
    }

    @Override
    public List<Wallet> getAllWallet() {
        return this.walletRepo.findAll();
    }

    @Override
    public Wallet getWalletById(long id) {
        Optional<Wallet> wall = this.walletRepo.findById(id);
        if(wall.isPresent()){
            return wall.get();
        } else{
            throw new RuntimeException("Wallet does not exist");
        }
    }

    @Override
    public void deleteWallet(long id) {

    }
}
