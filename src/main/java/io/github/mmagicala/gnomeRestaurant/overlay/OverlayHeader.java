package io.github.mmagicala.gnomeRestaurant.overlay;

import io.github.mmagicala.gnomeRestaurant.order.Customer;
import io.github.mmagicala.gnomeRestaurant.recipe.Order;

public class OverlayHeader {

    public final String instruction;
    public final int stepNum;
    public final int totalSteps;
    public final Customer customer;
    public final Order order;

    public OverlayHeader(String instruction, int stepNum, int totalSteps, Customer customer, Order order) {
        this.instruction = instruction;
        this.stepNum = stepNum;
        this.totalSteps = totalSteps;
        this.customer = customer;
        this.order = order;
    }
}
