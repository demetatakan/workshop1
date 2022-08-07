package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String fullname, degree;
        int quiz, visa, finalExam;
        double result;

        System.out.println("Lütfen ad ve soyadınızı giriniz");
        Scanner input1 = new Scanner(System.in);
        fullname = input1.nextLine();

        System.out.println("Lütfen quiz notunuzu giriniz");
        Scanner input2 = new Scanner(System.in);
        quiz = input2.nextInt();

        System.out.println("Lütfen vize notunuzu giriniz");
        Scanner input3 = new Scanner(System.in);
        visa = input3.nextInt();

        System.out.println("Lütfen final notunuzu giriniz");
        Scanner input4 = new Scanner(System.in);
        finalExam = input4.nextInt();

        result = (quiz * 0.10) + (visa * 0.30) + (finalExam * 0.60);
        degree = Calculate(result);

        System.out.printf("Sayın %s Not Ortalamanız %s %n", fullname, degree);

        if(result > 0 && result <= 100)
        {
            if (degree == "FF")
            {
                System.out.println("Sınıfta kaldınız");
            }
            else
            {
                System.out.println("Sınıfı geçtiniz");
            }
        }
        else {
            System.out.println("Girdiğiniz değerler hatalıdır");
        }
    }

    static String Calculate(double result)
    {
        String response = "";

        if (result >= 85 && result <= 100)
        {
            response = "AA";
        }
        else if (result >= 70 && result < 85)
        {
            response = "BB";
        }
        else if (result >= 60 && result < 70)
        {
            response = "CC";
        }
        else if (result >= 45 && result < 60)
        {
            response = "DD";
        }
        else if (result < 45)
        {
            response = "FF";
        }
        else
        {
            response = "Girdiğiniz değerler hatalıdır";
        }

        return response;
    }
}
