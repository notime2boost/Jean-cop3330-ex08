package ex08;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "How many people?" );
        String Speople = input.nextLine();
        System.out.println("How many pizza do you have?");
        String Spizza = input.nextLine();
        System.out.println("How many slices per pizza?");
        String Sslices = input.nextLine();

        int people = Integer.parseInt(Speople);
        int pizza = Integer.parseInt(Spizza);
        int slices = Integer.parseInt(Sslices);

        int perperson = (pizza * slices)/people;
        int Tslices = pizza * slices;
        System.out.println(Speople +" people with "+ Spizza +" pizzas ("+Tslices +" slices)" );
        System.out.println("Each person gets "+perperson+" pieces of pizza.");

        int leftover = Tslices % people;
        System.out.println("There are "+leftover+" leftover pieces");
    }
}
