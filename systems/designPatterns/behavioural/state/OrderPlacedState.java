package designPatterns.behavioural.state;

public class OrderPlacedState implements OrderState {
    @Override
    public void next(OrderContext context) {

    }

    @Override
    public void cancel(OrderContext context) {

    }

    @Override
    public String getStateName() {
        return "ORDER_PLACED";
    }
}
