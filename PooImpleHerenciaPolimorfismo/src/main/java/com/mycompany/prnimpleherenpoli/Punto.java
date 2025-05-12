package com.mycompany.prnimpleherenpoli;


public class Punto /*extends Figura*/extends Object implements InteFigura{
    protected  int x,y;
    public Punto(){
        setPunto(0, 0);
    }  
    public Punto(int x,int y){
        setX(x);
        setY(y);
    }  
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setPunto(int x, int y){
        setX(x);
        setY(y);
    }
    @Override
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
    @Override
    public String getNombre(){
        return "Punto";
    }
    @Override
    public double calcularArea(){
        return 0.0;
    }
    @Override
    public double calcularVolumen(){
        return 0.0;
    }
}
