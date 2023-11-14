package abstraction.shape;

import abstraction.TwoDFigure;

public class Triangle implements TwoDFigure {
  private Float side1, side2, side3;

  public Triangle(float side1, float side2, float side3) throws Exception {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public Triangle() {}

  public Float getSide1() {
    return this.side1;
  }

  public void setSide1(Float side1) throws Exception {
    if (side1 < 0) {
      throw new Exception("Side must be positive integer");
    }

    this.side1 = side1;
  }

  public Float getSide2() {
    return this.side2;
  }

  public void setSide2(Float side2) throws Exception {
    if (side2 < 0) {
      throw new Exception("Side must be positive integer");
    }

    this.side2 = side2;
  }

  public Float getSide3() {
    return this.side3;
  }

  public void setSide3(Float side3) throws Exception {
    if (side3 < 0) {
      throw new Exception("Side must be positive integer");
    }

    this.side3 = side3;
  }

  @Override
  public void drawShape() {
    float maxSide = Math.max(Math.max(side1, side2), side3);

    for (int i = 1; i <= maxSide; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  @Override
  public float calcPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  @Override
  public float calcArea() {
    // Heron's formula [https://en.wikipedia.org/wiki/Heron%27s_formula]
    float s = (this.side1 + this.side2 + this.side3) / 2;
    return (float) Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
  }
}
