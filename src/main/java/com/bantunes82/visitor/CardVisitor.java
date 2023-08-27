package com.bantunes82.visitor;

interface CardVisitor<T> {
    T visit(Visa visa);

    T visit(MasterCard masterCard);

}
