package example.codeclan.com.javafruitmachine;

import java.util.Scanner;

/**
 * Created by user on 08/02/2018.
 */

public class Runner {

        public void main(String args[]){
            Scanner sc=new Scanner(System.in);

//            System.out.println("Enter your rollno");
//            int rollno=sc.nextInt();
            System.out.println("Enter your name");
            String name=sc.next();
            System.out.println("Enter your fee");
            double fee=sc.nextDouble();
            System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);
            sc.close();
        }
    }

