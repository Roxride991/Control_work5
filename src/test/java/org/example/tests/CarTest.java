package org.example.tests;


import org.example.implementations.Car;
import org.example.implementations.CarInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private Car car;
    private CarInterface engine;

    @BeforeEach
    public void setUp() {
        car = new Car();
        engine = car.getEngineInstance();
    }

    @Test
    public void testEngineNotNull() {
        assertNotNull(engine);
    }

    @Test
    public void testStartEngine() {
        engine.startEngine();
        assertEquals("Running", engine.getEngineStatus());
    }

    @Test
    public void testStopEngine() {
        engine.stopEngine();
        assertEquals("Stopped", engine.getEngineStatus());
    }
}

