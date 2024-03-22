package com.example.traffic;

/**
 * Defines a traffic light contract where the light can change from RED to
 * GREEN to ORANGE and back to RED.
 */
public interface TrafficLight {

    /**
     * Returns the current {@link Color} of the Traffic Light.
     *
     * @return the current {@link Color} of the Traffic Light, never null
     */
    Color getStatus();

    /**
     * Sets the traffic light to the next logical state.
     */
    void toNextState();

    /**
     * Attempts to set the traffic light to a certain color.
     *
     * @param color a color to set the traffic light to, cannot be null
     * @throws IllegalStateException if the given color would violate the contract
     * @throws IllegalArgumentException if the given color is not a valid traffic light color
     */
    void setStatus(Color color);
}
