package com.example.sobreposicao;

import com.example.sobreposicao.entities.Account;
import com.example.sobreposicao.entities.BusinessAccount;
import com.example.sobreposicao.entities.SavingsAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Exercicio: Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretando, se a conta for do tipo
    poupança, esta taxa não deve ser cobrada.
    Resposta: Sobrescrevendo o método withdraw na subclasse SavingsAccount*/

@SpringBootApplication
public class SobreposicaoApplication {

    public static void main(String[] args) {

        //sobrepossição
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0,0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        //palavra super
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }

}
