package com.company;

import com.company.model.Device;
import com.company.model.Point;
import com.company.model.Station;

import java.util.ArrayList;
import java.util.List;

public class LinkUtils {

    public static double calculateDistance(Point a, Point b){

        double distance = Math.sqrt(Math.pow((a.getX()-b.getX()),2) + Math.pow((a.getY()-b.getY()),2));
        return distance;

    }

    public static double calculatePower(Device device, Station station){

        double dist = calculateDistance(device.getPoint(), station.getPoint());

        if(dist>0){
            if(station.getReach()>dist) {
                return Math.pow((station.getReach() - dist), 2);
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }

    }

    public static ArrayList<Station> initStations(){
        ArrayList<Station> stationList = new ArrayList();

        stationList.add(new Station(new Point(0,0),10));
        stationList.add(new Station(new Point(20,20),5));
        stationList.add(new Station(new Point(10,0),12));

        return stationList;
    }



}
