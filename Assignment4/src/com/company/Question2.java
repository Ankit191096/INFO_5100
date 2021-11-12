package com.company;

public class Question2 {
    class TrafficLight {
        private boolean isAGreen = true;
        public TrafficLight() {

        }

        public void carArrived(
                int carId,
                int roadId,
                int direction,
                Runnable turnGreen,
                Runnable crossCar
        ) {
            synchronized(this) {
                if ((roadId == 1 && !isAGreen) ||
                        (roadId == 2 && isAGreen)) {
                    isAGreen = !isAGreen;
                    turnGreen.run();
                }
                crossCar.run();
            }
        }
    }
}
