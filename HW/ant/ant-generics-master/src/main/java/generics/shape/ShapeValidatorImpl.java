package generics.shape;

import generics.Validator;

public class ShapeValidatorImpl implements Validator<Shape> {
    public static final int BOUNDARY_SQUARE = 100;

    @Override
    public boolean isValid(Shape shape) {
        return !(shape.getSquare() <= 0 || shape.getSquare() > BOUNDARY_SQUARE);
    }
}
