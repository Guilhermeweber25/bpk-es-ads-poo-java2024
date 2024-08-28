import java.util.Scanner;

public class ContaBancaria {
   private int numeroConta;
   private float saldo;
   private Scanner scanner;

   public ContaBancaria() {
      this.numeroConta = 0;
      this.saldo = 0.0f;
      this.scanner = new Scanner(System.in);
   }

   public void Numeroparaconta() {
      System.out.println("----NÚMERO DA CONTA----");
      System.out.print("Insira um número para a conta: ");
      this.numeroConta = scanner.nextInt();
   }

   public void depositar() {
      System.out.println("--------DEPÓSITO--------");
      System.out.print("Insira um valor para depósito: ");
      float valorDeposito = scanner.nextFloat();
      if (valorDeposito > 0) {
         this.saldo += valorDeposito;
         System.out.println("Depósito realizado com sucesso!");
      } else {
         System.out.println("Valor de depósito inválido.");
      }
   }

   public void sacar() {
      System.out.println("-------SAQUE-------");
      System.out.println("Saldo disponível na conta: " + saldo);
      System.out.print("Digite um valor para saque: ");
      float valorSaque = scanner.nextFloat();
      if (valorSaque > saldo) {
         System.out.println("Saque excede o saldo!!!");
      } else if (valorSaque > 0) {
         saldo -= valorSaque;
         System.out.println("Saque realizado com sucesso!");
      } else {
         System.out.println("Valor de saque inválido.");
      }
   }

   public void Saldodisponivel() {
      System.out.println("Saldo disponível: " + saldo);
   }
}
