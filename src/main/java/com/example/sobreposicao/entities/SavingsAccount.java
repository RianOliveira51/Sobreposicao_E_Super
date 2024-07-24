package com.example.sobreposicao.entities;

public class SavingsAccount extends Account{

    private double interesRate;

    public SavingsAccount(){

    }

    public SavingsAccount(Integer number, String holder, double balance, double interesRate) {
        super(number, holder, balance);
        this.interesRate = interesRate;
    }

    public double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(double interesRate) {
        this.interesRate = interesRate;
    }

    public void updateBalance(){
        balance += balance * interesRate;
    }

    @Override //sobreposição de metodo, ussando essa anotação, ele irá falar se existe esse metodo na super classe
    public void withdraw(double amount){
        balance -= amount;
    }
}
