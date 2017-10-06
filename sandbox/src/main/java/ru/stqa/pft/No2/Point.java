package ru.stqa.pft.No2;

public class Point {

  double x;
  double y;
  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance(Point secondPoint){
     double result = Math.sqrt((x - secondPoint.x) * (x - secondPoint.x) + (y - secondPoint.y) * (y - secondPoint.y));
    return result;
  }
}