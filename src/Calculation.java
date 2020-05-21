
public abstract class Calculation {
    public int height;
    public int width;


    public void setValues(int H, int W)
    {
        height = H;
        width = W;
    }


    public int getHeight()
    {
        return height;
    }


    public int getWidth()
    {
        return width;
    }

    public abstract int getArea();
}

