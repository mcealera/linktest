package com.company;

import com.company.model.Device;
import com.company.model.Point;
import com.company.model.Station;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int x;
        int y;

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect arguments. Correct usage example: java -jar LinkStation.jar 5 5");
            return;
        }

        Device device = new Device(new Point(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
        Station bestStation = null;
        double maxPower = 0;

        ArrayList<Station> stationList = LinkUtils.initStations();


        System.out.println("Received device at ("+device.getPoint().getX()+","+device.getPoint().getY()+")");
        System.out.println("Looking for the best link station ..");

        for(Station station : stationList){
            device.setPower(LinkUtils.calculatePower(device,station));
            if(device.getPower()>maxPower){
                maxPower = device.getPower();
                bestStation = station;
            }
        }

        if(maxPower>0){
            System.out.println("Best link station is at (" + bestStation.getPoint().getX()+","+bestStation.getPoint().getY()+"), power is "+maxPower);
        }
        else
        {
            System.out.println("No link station in range for device at "+device.getPoint().getX()+","+device.getPoint().getY());
        }

    }
}
