package com.RealExample;

public class Integrate<T extends  Traiangle>  {

    T obj;

    public Integrate(T obj) {
        this.obj = obj;
    }

    public  void showArea(){
        //System.out.println("Radius are:"+obj);
        System.out.println(obj.getClass().getName());
        obj.Area();

    }


}
