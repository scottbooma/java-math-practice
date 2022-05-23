public class MathApp {
  public static void main(String[] args) {
    System.out.println(MathApp.getMaxSalary(jobSalary1, jobSalary2));
    System.out.println(MathApp.getMinPrice(carPrice, truckPrice));
    System.out.println(MathApp.getCircleArea(radius));
    System.out.println(MathApp.getSquareRoot(num1));
    System.out.println(MathApp.getDistanceBetweenTwoPoints(5, 10, 85, 50));
    System.out.println(MathApp.getPositiveAbsoluteValue(num2));
    System.out.println(MathApp.getRandomNumberBetween0And1());
  }

  private static int jobSalary1 = 50000;
  private static int jobSalary2 = 65000;

  private static int carPrice = 35000;
  private static int truckPrice = 28000;

  private static double radius = 7.25;

  private static double num1 = 5.0;

  private static double num2 = -3.8;

  public static int getMaxSalary(int jobSalary1, int jobSalary2){
    return Math.max(jobSalary1, jobSalary2);
  }

  public static int getMinPrice(int carPrice, int truckPrice) {
    return Math.min(carPrice, truckPrice);
  }

  public static double getCircleArea(double radius) {
    return Math.pow(radius, 2) * Math.PI;
  }

  public static double getSquareRoot(double number) {
    return Math.sqrt(number);
  }

  public static double getDistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
    return Math.hypot((y2 - y1), (x2 - x1));
  }

  public static double getPositiveAbsoluteValue(double number) {
    return Math.abs(number);
  }

  public static double getRandomNumberBetween0And1() {
    return Math.random();
  }
}
