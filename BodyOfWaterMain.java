public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("a",1,1,false);
        System.out.println(b.isSaltWater());
        System.out.println(b.name());
        System.out.println(b.avgDepth());
        System.out.println(b.largestDiameter());
        b.setName("bob");
        b.setSaltWater(true);
        b.setLargestDiamter(40);
        b.setdepth(20);
        System.out.println(b.isSaltWater());
        System.out.println(b.name());
        System.out.println(b.avgDepth());
        System.out.println(b.largestDiameter());
    }
}
