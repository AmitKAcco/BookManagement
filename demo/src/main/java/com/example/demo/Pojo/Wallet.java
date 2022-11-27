package com.example.demo.Pojo;

import javax.persistence.*;


@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "walletIdd", nullable = false)
    private Long walletId;

    @Column(name = "Money")
    private Long Money;


    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public Long getMoney() {
        return Money;
    }

    public void setMoney(Long money) {
        if(money % 500 != 0){
            throw new RuntimeException("Denomination should be in %500");
        } else {
            Money = money;
        }
    }

}
