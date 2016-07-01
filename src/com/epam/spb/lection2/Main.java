package com.epam.spb.lection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //public enum NAME {ARGUMENTS_EXAMPLE};

    public Main() {

    }

    public static void main(String[] args) {
       // List<Integer> list = new ArrayList<Integer>();
        List<Object> list1 = new ArrayList<Object>();
        list1.add(new ArgumentsExample());
        list1.add(new AutoPack());
        list1.add(new BigExample());
        list1.add(new BitOperations());
        list1.add(new CharsTest());
        list1.add(new ClassExample());
        list1.add(new CoverClasses());
        list1.add(new DataTypes());
        list1.add(new Import());
        list1.add(new InstanceOf());
        list1.add(new LogicOperations());
        list1.add(new Operators());
        list1.add(new StringTransformation());
        list1.add(new UnaryOperators());
        String inputStr = "";
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello guys!");
        System.out.println("Enter number of subroutine: ");
        inputStr = scanner.nextLine();
        try {
            input = Integer.getInteger(inputStr);
        }
        catch (Exception e){
            if (inputStr.equals("quit") == false)
                System.out.println("Input error");
            return;
        }
        System.out.println(input);
        for(Object val : list1){
            if(val.getClass().equals(input)){
        //        val.main("Some arguments");
            }
        }
    }
}
