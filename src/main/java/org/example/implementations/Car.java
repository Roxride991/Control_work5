package org.example.implementations;

public class Car {

    private class Engine implements CarInterface {
        private boolean isRunning;

        @Override
        public void startEngine() {
            isRunning = true;
            System.out.println("Engine started.");
        }

        @Override
        public void stopEngine() {
            isRunning = false;
            System.out.println("Engine stopped.");
        }

        @Override
        public String getEngineStatus() {
            return isRunning ? "Running" : "Stopped";
        }
    }

    public CarInterface getEngineInstance() {
        return new Engine();
    }
}
