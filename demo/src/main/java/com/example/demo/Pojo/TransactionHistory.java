package com.example.demo.Pojo;

import javax.persistence.*;

@Entity
public class TransactionHistory {

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transactionId", nullable = false)
    private Long transactionId;

    public Long getAmountMoved() {
        return amountMoved;
    }

    public void setAmountMoved(Long amountMoved) {
        this.amountMoved = amountMoved;
    }

    @Column(name = "amountMoved")
    private Long amountMoved;

}
