public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 10;
        double b = 10;
        double c = 10;

        double surfaceAreaS = 2 * (a * b + a * c + b *c) ;
        double volumeV = a * b * c;

        System.out.println(surfaceAreaS);
        System.out.println(volumeV);



    }
}
