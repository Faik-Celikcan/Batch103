package atmproject;

import java.util.Scanner;

public class Options extends Account{

    Scanner input= new Scanner(System.in);

    //Checking hesap islemleri
    public void checkingOperations(){

        System.out.println("opsiyon seciniz");
        System.out.println("1: View Balance");// bakiyenizi kontrol ediniz
        System.out.println("2: Withdraw"); // para cekme
        System.out.println("3: Deposit"); // para yatirma
        System.out.println("4: Exit"); // islemi sonlandir


        while (true){

        int option= input.nextInt();

        if(option==1){

            displayCurrentAmount(getCheckingBalance());
        }
        else if(option==2){

            getCheckingWithdraw();
        }else if(option==3){

            getCheckingDeposit();
        }else if(option==4) {
            System.out.println("Tesekkurler");
            break;
        }else {
            System.out.println("Hatali rakam girisi");
            checkingOperations();
        }
        }

    }
}
