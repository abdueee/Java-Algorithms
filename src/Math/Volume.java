package Math;

public class Volume {

    /**
     * Calculate the volume of a cube.
     *
     * @param sideLength length of the given cube's sides
     * @return volume of the given cube
     */
    public static double volumeCube(double sideLength) {
        return sideLength * sideLength * sideLength;
    }


    /**
     * Calculate the volume of a sphere.
     *
     * @param radius radius of given sphere
     * @return volume of given sphere
     */
    public static double volumeSphere(double radius) {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }

    /**
     * Calculate the volume of a pyramid.
     *
     * @param baseArea   of the given pyramid's base
     * @param height of given pyramid
     * @return volume of given pyramid
     */
    public static double volumePyramid(double baseArea, double height) {
        return (baseArea * height) / 3;
    }
    
}

