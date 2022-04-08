package Banco;
import javax.swing.JOptionPane;
public class Principal {
public static void main(String[]args){
int opcao = 0,opcao2=0,num_conta=0;
float valor = 0;
boolean loop=true;
Conta_Corrente cc = new Conta_Corrente();
Conta_Poupanca cp = new Conta_Poupanca();
do{
   opcao = Integer.parseInt( JOptionPane.showInputDialog("Escolha:\n"
          + "1-Contra Corrente\n"
          + "2-Conta Poupança\n"
          + "3-Sair"));
          switch(opcao){
             case 1:
                 cc.nome = JOptionPane.showInputDialog("Informe o nome");
                 cc.num_conta = Integer.parseInt( JOptionPane.showInputDialog("Informe o numero da conta:"));
                 cc.saldo = Float.parseFloat( JOptionPane.showInputDialog("Informe o saldo da conta:"));
                 opcao2 = Integer.parseInt( JOptionPane.showInputDialog("Escolha\n1-Sacar\n2-Depositar"));
                 if(opcao2==1){
                     if(num_conta==cp.num_conta){
                         valor = Float.parseFloat( JOptionPane.showInputDialog("Quanto você quer sacar?\n Lembrando que vc tem: R$"+cc.saldo));
                         cc.sacar(valor);
                    }else{
                      JOptionPane.showMessageDialog(null,"Algo de errado não esta certo...");
                   }
                   }else if(opcao==2){
                      if(num_conta==cp.num_conta){
                          valor = Float.parseFloat( JOptionPane.showInputDialog("Quanto você quer Depositarar?"));
                          cc.depositar(valor);
                     }else{
                          JOptionPane.showMessageDialog(null,"Algo de errado não esta certo...");
                          }
                                }
                          JOptionPane.showMessageDialog(null,"Seus Dados:\n"
                          + "Nome: "+cc.nome+"\n"
                          + "Numero da Conta: "+cc.num_conta+"\n"
                          + "Saldo: "+cc.saldo);
             break;
        
             case 2:
                  cp.nome = JOptionPane.showInputDialog("Informe o nome:");
                  cp.num_conta = Integer.parseInt( JOptionPane.showInputDialog("Informe o numero da conta:"));
                  cp.saldo = Float.parseFloat( JOptionPane.showInputDialog("Informe o saldo da conta"));
                  opcao2 = Integer.parseInt( JOptionPane.showInputDialog("Escolha:\n 1-Sacar\n 2-Depositar"));
                  if(opcao2==1){
                     num_conta = Integer.parseInt( JOptionPane.showInputDialog("Numero da conta do meliante"));
                     if(num_conta==cp.num_conta){
                        valor = Float.parseFloat( JOptionPane.showInputDialog("Quanto você quer sacar?\n Lembrando que vc tem: R$"+cp.saldo));
                        cc.sacar(valor);
                   }else{
                       JOptionPane.showMessageDialog(null,"Algo de errado não esta certo...");
                       }
                   }else if(opcao==2){
                       if(num_conta==cc.num_conta){
                          valor = Float.parseFloat( JOptionPane.showInputDialog("Quanto você quer Depositarar?"));
                          cc.depositar(valor);
                       }else{
                          JOptionPane.showMessageDialog(null,"Algo de errado não esta certo...");
                            }
                                   }
               JOptionPane.showMessageDialog(null,"Seus Dados:\n"
                       + "Nome: "+cp.nome+"\n"
                       + "Numero da Conta: "+cp.num_conta+"\n"
                       + "Saldo: "+cp.saldo);
               break;
                 
               case 3:
                   JOptionPane.showMessageDialog(null,"Até mais...");
                   loop=false;
               break;
   } } while(loop); } }
