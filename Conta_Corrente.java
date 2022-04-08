package Banco;
public class Conta_Corrente {
String nome;
int num_conta;
float saldo;
//sacar
void sacar(float valor){
float resultado= this.saldo - valor;
        this.saldo = resultado;
}//depositar
void depositar(float valor){
float resultado= this.saldo + valor;
        this.saldo = resultado;
}


}
