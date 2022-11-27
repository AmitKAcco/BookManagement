package com.example.demo.Service;

import com.example.demo.Pojo.Author;
import com.example.demo.Pojo.Userr;
import com.example.demo.Pojo.Wallet;

import java.util.List;

public interface WalletInterface {

    Wallet createWallet(Wallet User);
    Wallet updateWallet(Wallet wallet);
    List<Wallet> getAllWallet();
    Wallet getWalletById(long id);

    void deleteWallet(long id);
}
