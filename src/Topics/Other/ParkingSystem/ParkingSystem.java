package Topics.Other.ParkingSystem;

public class ParkingSystem {
    int[] parking_cars;
    int[] parking_spaces_max;

    public ParkingSystem(int big, int medium, int small) {
        this.parking_cars = new int[3];
        this.parking_spaces_max = new int[3];
        this.parking_spaces_max[0] = big;
        this.parking_spaces_max[1] = medium;
        this.parking_spaces_max[2] = small;
    }

    public boolean addCar(int carType) {
        if (this.parking_cars[carType - 1] == this.parking_spaces_max[carType - 1])
            return false;

        this.parking_cars[carType - 1]++;
        return true;
    }
}
