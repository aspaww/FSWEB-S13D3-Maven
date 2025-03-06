package org.example;

public class Wall {
    double width;
    double height;

    public Wall(){

    }
    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double number){
        if(number<0){
            width = 0;
        }else{
            width=number;
        }

    }

    public void setHeight(double number){
        if(number<0){
            height=0;
        }else{
            height=number;
        }
    }

    public double getArea(){
        return width * height;
    }


}
