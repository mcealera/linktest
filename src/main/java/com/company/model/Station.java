package com.company.model;

public class Station {

    private Point point;
    private int reach;

    public Station(Point point, int reach) {
        this.point = point;
        this.reach = reach;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

}
