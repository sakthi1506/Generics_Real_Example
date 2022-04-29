package com.RealExample;

import sun.text.normalizer.Trie;

public class Generics {


    public static void main(String[] args) {


        Traiangle traiangle=new Traiangle(10,30);
        Traiangle traiangle1=new Traiangle(12,32);
        Traiangle traiangle2=new Traiangle(5,10);

        Circle circle=new Circle(12);
        Circle circle1=new Circle(2);
        Circle circle2=new Circle(90);

        Integrate integrate=new Integrate(traiangle);
        integrate.showArea();

//        Integrate <Circle> integrate1=new Integrate(circle);
//        integrate1.showArea();



    }
}
