package org.snacks.java.oop;

import java.math.BigDecimal;

public class ContoBancario {
    private String conto;
    private BigDecimal saldo;

    public ContoBancario (String conto, BigDecimal saldo){
        this.conto = conto;
        this.saldo = saldo;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo (BigDecimal saldo){
        this.saldo=saldo;
    }

    public String getConto(){
        return this.conto;
    }
    //private void setSaldo (String conto){
    //    this.conto=conto;
   // }

    public void deposito (BigDecimal sommaDeposito){
        if(sommaDeposito.compareTo(new BigDecimal(0))==1)
        this.saldo = this.saldo.add(sommaDeposito);
    }

    public boolean prelievo (BigDecimal sommaPrelievo){
        if(sommaPrelievo.compareTo(new BigDecimal(0)) == 1 && this.saldo.compareTo(sommaPrelievo)==1){
        this.saldo = this.saldo.subtract(sommaPrelievo);
        return true;
    } 
        return false;
    }

    
 
}
