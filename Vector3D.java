import static java.lang.Math.round;

public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double newX, double newY, double newZ) {
        this.x = newX;
        this.y = newY;
        this.z = newZ;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    @Override
    public String toString() {
        String x = String.format("%.2f", this.x);
        String y = String.format("%.2f", this.y);
        String z = String.format("%.2f", this.z);
        return "( " + x + ", " + y + ", " + z + " )";
    }

    public double getMagnitude() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    public static void main(String[] args) {
        Vector3D myVector = new Vector3D(3.13923, 4.420942, 5.2099);
        System.out.println("This is x: " + myVector.getX());
        System.out.println("This is y: " + myVector.getY());
        System.out.println("This is z: " + myVector.getZ());
        System.out.println("This is the toString method in action: " + myVector);
        System.out.println("This is the vector's magnitude: " + myVector.getMagnitude());
    }


}
