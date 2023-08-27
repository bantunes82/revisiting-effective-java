package com.bantunes82.visitor;

public abstract sealed class CreditCard permits Visa, MasterCard {

    public abstract <T> T something(CardVisitor<T> visitor);


    public static void main(String[] args) {
        CardVisitor<Integer> visitor = new CardVisitor<>() {
            @Override
            public Integer visit(Visa visa) {
                return 1;
            }

            @Override
            public Integer visit(MasterCard masterCard) {
                return 2;
            }
        };

        System.out.println(visitor.visit(new Visa()));
        System.out.println(visitor.visit(new MasterCard()));
    }
}

final class Visa extends CreditCard{

    @Override
    public <T> T something(CardVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

final class MasterCard extends CreditCard{
    @Override
    public <T> T something(CardVisitor<T> visitor) {
        return visitor.visit(this);
    }

}