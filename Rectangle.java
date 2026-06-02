// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor:
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // third constructor:
  public Rectangle() {
    width = 1;
    height = 1;
    originX = 0.0;
    originY = 0.0;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  // methods: scale the width and height of the rectangle
  public void scale(double scaleX, double scaleY) {
    originX *= scaleX;
    originY *= scaleY;
  }

  public void scale(double scaleAll) {
    originX *= scaleAll;
    originY *= scaleAll;
  }

  // method: check whether rectangles overlap

  public boolean isOverlappedWith(Rectangle r) {
    private ArrayList<Integer> firstCoords = new ArrayList<>();
    private ArrayList<Integer> secondCoords = new ArrayList<>();
    for (i=0,j=0; i < this.width, j < this.height; i++, j++) {
      firstCoords.add(i,j);
    }
    for (i=0,j=0; i < r.width, j < r.height; i++, j++) {
      secondCoords.add(i,j);
    }
    
  }
  
}
