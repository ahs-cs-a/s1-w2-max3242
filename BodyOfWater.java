public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;
    public BodyOfWater(String n, int d, int a, boolean sw){
        name=n;
        largestDiameter=d;
        avgDepth=a;
        isSaltWater=sw;
    }

    public BodyOfWater(String n, int a){
        name = n;
        avgDepth = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setdepth(int a){
        avgDepth=a;
    }
    public void setLargestDiamter(int d){
        largestDiameter = d;
    }
    public void setSaltWater(boolean s){
        isSaltWater=s;
    }
    public String name(){
        return name;
    }
    public int avgDepth(){
        return avgDepth;
    }
    public boolean isSaltWater(){
        return isSaltWater;
    }
    public int largestDiameter(){
        return largestDiameter;
    }
}
