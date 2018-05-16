package com.example.cheng.android.google.utils;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by cheng on 2018/5/12.
 */

public  class GoogleUutil {
    /**
     * 通过起点终点，组合成url
     *
     * @param origin
     * @param dest
     * @return
     */
    public static String getDirectionsUrl(LatLng origin,LatLng waypoints ,LatLng dest) {
        //31.923951, 117.124891
        //31.9283382,117.1202566,
        //31.9283044,117.1202666



        // Origin of route
        String str_origin = "origin=" + origin.latitude + ","
                + origin.longitude;

        // Destination of route
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;

        // Sensor enabled
        String sensor = "sensor=false";

        // Travelling Mode
        String mode = "mode=driving";

        //waypoints,116.32885,40.036675
        String waypointLatLng = "waypoints="+waypoints.latitude+","+waypoints.longitude;

        // Building the parameters to the web service
        String parameters = str_origin + "&" + str_dest + "&" + sensor + "&"
                + mode+"&"+waypointLatLng;

        // Output format
        String output = "json";

        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/"
                + output + "?" + parameters;
        System.out.println("getDerectionsURL--->: " + url);
        return url;
    }
}
