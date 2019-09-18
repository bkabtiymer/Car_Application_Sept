package com.company;



import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        // write your code here

        String carClass;
        int carYear;
        Scanner input = new Scanner(System.in);
        ArrayList<Car> carArray = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Car car = new Car();//Create an instance of car inside the for-loop
            System.out.println("Enter a Car Make");
            carClass = input.nextLine();
            car.setMake(carClass);


            System.out.println("Enter a Car Model");
            carClass = input.nextLine();
            car.setModel(carClass);

            System.out.println("Enter a Car Year");
            carYear = input.nextInt();
            car.setYear(carYear);
            input.nextLine();

//            String result = car.getDisplay();
//            System.out.println("Added car is: " + result);
            carArray.add(car);
        }
        for (Car c : carArray) {
            System.out.println("Call the cars: " +c.getDisplay());//Call all values in the arrayList
        }
    }
}
