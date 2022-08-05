package day40_FinalKeyword;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    //getter:
    public Circle getCircle(){
        return circle;
    }


    //setter: reassigns data: need para - data type need to match with private var

    public void setCircle(Circle circle){

        if (circle.getRadius() < 5){
            return;
        }

        this.circle=circle;

    }

    public Square getSquare(){
        return square;}

    public void setSquare(Square square){
        this.square = square;
    }


}



