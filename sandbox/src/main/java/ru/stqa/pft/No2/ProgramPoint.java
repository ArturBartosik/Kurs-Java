package ru.stqa.pft.No2;

public class ProgramPoint {

  public static void main(String args[]) {
    Point firstPoint = new Point(5,3);
    Point secondPoint = new Point(3,3);
    double result = firstPoint.distance(secondPoint);
    double secondResult = distance(firstPoint, secondPoint);
    System.out.println("Pierwszy wynik: " + result);
    System.out.println("Drugi wynik: " + secondResult);
  }

  public static double distance(Point firstPoint,Point secondPoint) {
     double result = Math.sqrt((firstPoint.x - secondPoint.x) * (firstPoint.x - secondPoint.x)) + Math.sqrt((firstPoint.y - secondPoint.y) * (firstPoint.y - secondPoint.y));
    return result;
  }
}