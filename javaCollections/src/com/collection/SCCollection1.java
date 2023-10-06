package com.collection;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class AccountProgram implements Serializable {
    String accno;
    String name;
    double balance;

    AccountProgram(){}

    AccountProgram(String a,String n,double b){
        accno = a;
        name = n;
        balance = b;
    }

    public String toString(){
        return "Account No : " + accno + "\nName : " + name + "\nBalance" + balance+"\n";
    }
}

public class SCCollection1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        AccountProgram acc = null;
        HashMap<String,AccountProgram> hm = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for(int i=0; i<count; i++){
                acc=(AccountProgram)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accno,acc);
            }
            fis.close();
            ois.close();
        }
        catch (Exception e){

        }

        FileOutputStream fos = new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu ");

        int choice;
        String accno, name;
        double balance;

        do{
            System.out.println("1. create account");
            System.out.println("2. delete account");
            System.out.println("3. view account");
            System.out.println("4. view all account");
            System.out.println("5. save accounts");
            System.out.println("6. exit");
            choice = in.nextInt();

            in.skip("(\r\n|[n\r\u2028\u2029\u0085])?");

            switch (choice){
                case 1 :
                    System.out.println("Enter the accountno, name, balance");
                    accno = in.nextLine();
                    name = in.nextLine();
                    balance = in.nextDouble();

                    acc = new AccountProgram(accno,name,balance);
                    System.out.println("Account created for :" + name);
                case 2:
                    System.out.println("Enter Account no ");
                    in.nextLine();
                    accno = in.nextLine();
                    hm.remove(accno);
                    break;
                case 3:
                    System.out.println("Enter Accno");
                    accno=in.nextLine();
                    acc = hm.get(accno);
                    System.out.println(acc);
                    break;
                case 4:
                    for(AccountProgram a:hm.values())
                        System.out.println(a);
                    break;
                case 5:
                case 6:
                    oos.writeInt(hm.size());
                    for(AccountProgram a:hm.values())
                        oos.writeObject(a);
            }
        }while (choice!=5);
        oos.flush();
        oos.close();
        fos.close();
    }
}
