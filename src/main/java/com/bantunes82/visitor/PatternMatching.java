package com.bantunes82.visitor;

public class PatternMatching {
    public int run(CreditCard card){
        return switch (card){
           case Visa v -> 1;
           case MasterCard m -> 2;
        };
    }

    public static void main(String[] args) {
        System.out.println(new PatternMatching().run(new Visa()));

        System.out.println(new PatternMatching().run(new MasterCard()));
    }
}

class OtherPatternMatching {
    public String run(CreditCard card){
        return switch (card){
            case Visa v -> "abc";
            case MasterCard m -> "cde";
        };
    }

    public static void main(String[] args) {
        System.out.println(new OtherPatternMatching().run(new Visa()));

        System.out.println(new OtherPatternMatching().run(new MasterCard()));
    }
}

