package br.edu.unifei.ecot12.lab09.car;

public class Manufacturer {
    private Segment segment;

    public Car build() {
        Car c = new Car();
        segment.buildEngine(c);
        return c;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }
}
