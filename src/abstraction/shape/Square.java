package abstraction.shape;

import abstraction.TwoDFigure;

public class Square implements TwoDFigure {
  private Float sides;

  public Square(Float sides) throws Exception {
    this.sides = sides;
  }

  public Square() {
  }

  public Float getSides() {
    return this.sides;
  }

  public void setSides(Float sides) throws Exception {
    if (sides < 0) {
      throw new Exception("Sides must be positive integer");
    }

    this.sides = sides;
  }

  @Override
  public void drawShape() {
    for (int i = 0; i < this.sides; i++) {
      for (int j = 0; j < this.sides; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  @Override
  public float calcPerimeter() {
    return 4 * this.sides;
  }

  @Override
  public float calcArea() {
    return this.sides * this.sides;
  }
}
