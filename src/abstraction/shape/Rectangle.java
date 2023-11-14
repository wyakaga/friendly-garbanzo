package abstraction.shape;

import abstraction.TwoDFigure;

public class Rectangle implements TwoDFigure {
  private Float length, width;

  public Rectangle(float length, float width) throws Exception {
    if (width >= length) {
      throw new Exception("Width must be smaller than length");
    }

    this.length = length;
    this.width = width;
  }

  public Rectangle() {}

  public Float getLength() {
    return this.length;
  }

  public void seLength(Float length) throws Exception {
    if (length < 0) {
      throw new Exception("Length must be positive integer");
    }

    this.length = length;
  }

  public Float getWidth() {
    return this.width;
  }

  public void setWidth(Float width) throws Exception {
    if (width < 0) {
      throw new Exception("Width must be positive integer");
    }

    this.width = width;
  }

  @Override
  public void drawShape() {
    for (int i = 0; i < this.length; i++) {
      for (int j = 0; j < this.width; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  @Override
  public float calcPerimeter() {
    return 2 * (this.length * this.width);
  }

  @Override
  public float calcArea() {
    return this.length * this.width;
  }
}
