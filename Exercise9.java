class Car {
    public void m1() {
        System.out.println("car 1");
    }
    public void m2() {
        System.out.println("car 2");
    }
    public String toString() {
        return "vroom";
    }
}
class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
}

class sportUtilityVehicle extends Car
{



    public static void main(String[] args) {
        sportUtilityVehicle car = new sportUtilityVehicle();

        car.m1();
        car.m2();
        System.out.println(car.toString());
    }
    @Override
    public void m1()
    {
        System.out.println("SUV 1");
    }

    @Override
    public void m2()
    {
        super.m1();
    }

    @Override
    public String toString()
    {
        return "Suv " + super.toString();
    }


}