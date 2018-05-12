package com.example.cheng.android.google.utils;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by cheng on 2018/5/12.
 */

public  class GoogleUutil {
    public static String getDirectionsUrl(LatLng origin, LatLng dest) {
        // Origin of route
        String str_origin = "origin=" + origin.latitude + ","
                + origin.longitude;

        // Destination of route
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;

        // Sensor enabled
        String sensor = "sensor=false";

        // Travelling Mode
        String mode = "mode=driving";

        // String waypointLatLng = "waypoints="+"40.036675"+","+"116.32885";

        // 如果使用途径点，需要添加此字段
        //   String waypoints = "waypoints=31.8307693875,117.2510304188";

        String parameters = null;
        // Building the parameters to the web service

        parameters = str_origin + "&" + str_dest + "&" + sensor + "&" + mode;
        // parameters = str_origin + "&" + str_dest + "&" + sensor + "&"
        // + mode+"&"+waypoints;
        // Output format
        // String output = "json";
        String output = "json";

        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/"
                + output + "?" + parameters;
        return url;
    }
}
