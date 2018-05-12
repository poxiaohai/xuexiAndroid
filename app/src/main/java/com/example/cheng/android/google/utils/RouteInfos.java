package com.example.cheng.android.google.utils;

import android.location.Location;


import java.util.List;

/**
 * Created by wangyujie
 * Date 2017/7/13.
 * TODO
 */

public class RouteInfos {
    public BoundInfos bounds;
    public List<LegsInfos> legs;
    public String copyrights;
    public Polyline overview_polyline;
    public String summary;
    public List<String> waypoint_order;
    public List<String> warnings;

    public class BoundInfos {
        public Location northeast;
        public Location southwest;
    }

    public class LegsInfos {
        public Distance distance;
        public Distance duration;
        public String end_address;
        public Location end_location;
        public String start_address;
        public Location start_location;
        public List<StepInfos> steps;

        public class StepInfos {
            public Distance distance;
            public Distance duration;
            public String html_instructions;
            public Location end_location;
            public Location start_location;
            public Polyline polyline;
            public String travel_mode;
        }
        public class Distance {
            public String text;
            public String value;
        }
    }

    public class Polyline {
        public String points;
    }

}