package com.example.cheng.android.google.utils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cheng on 2018/5/16.
 */

public class GoogleModel implements Serializable {

    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJ9wtN9_-czDURJtyaZhpVbTs","types":["street_address"]},{"geocoder_status":"OK","place_id":"ChIJ93XkyP6czDURVbcCG0mAQRs","types":["route"]},{"geocoder_status":"OK","place_id":"ChIJ93XkyP6czDURVbcCG0mAQRs","types":["route"]}]
     * routes : [{"bounds":{"northeast":{"lat":31.9308662,"lng":117.1261244},"southwest":{"lat":31.924292,"lng":117.1200486}},"copyrights":"地图数据 ©2018 GS(2011)6020","legs":[{"distance":{"text":"1.1 公里","value":1051},"duration":{"text":"5分钟","value":297},"end_address":"中国安徽省合肥市庐阳区三丰路","end_location":{"lat":31.9301551,"lng":117.1200426},"start_address":"中国安徽省合肥市庐阳区古城路130号","start_location":{"lat":31.924292,"lng":117.1261244},"steps":[{"distance":{"text":"0.9 公里","value":852},"duration":{"text":"4分钟","value":234},"end_location":{"lat":31.9308662,"lng":117.12191},"html_instructions":"从<b>古城路<\/b>向<b>北<\/b>行驶，到<b>杨岗路<\/b>","polyline":{"points":"yezaEge{iU_FrAEB_FvAkD~@aCv@WJaBr@cAl@a@ZMJ_AhAmA|AoD~ECB"},"start_location":{"lat":31.924292,"lng":117.1261244},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":199},"duration":{"text":"1分钟","value":63},"end_location":{"lat":31.9301551,"lng":117.1200426},"html_instructions":"向<b>左<\/b>转，进入<b>三丰路<\/b>","maneuver":"turn-left","polyline":{"points":"}n{aE}jziUt@~@`@v@Lb@DLBLVpBDjA"},"start_location":{"lat":31.9308662,"lng":117.12191},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]},{"distance":{"text":"1 米","value":1},"duration":{"text":"1分钟","value":0},"end_address":"中国安徽省合肥市庐阳区三丰路","end_location":{"lat":31.9301556,"lng":117.1200486},"start_address":"中国安徽省合肥市庐阳区三丰路","start_location":{"lat":31.9301551,"lng":117.1200426},"steps":[{"distance":{"text":"1 米","value":1},"duration":{"text":"1分钟","value":0},"end_location":{"lat":31.9301556,"lng":117.1200486},"html_instructions":"向<b>东<\/b>行驶","polyline":{"points":"oj{aEg_ziU?A"},"start_location":{"lat":31.9301551,"lng":117.1200426},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"yezaEge{iUqRnFyCbAaBr@cAl@o@f@mCfDsDbFt@~@`@v@Rp@Z~BDhA"},"summary":"古城路","warnings":[],"waypoint_order":[0]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJ9wtN9_-czDURJtyaZhpVbTs
         * types : ["street_address"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":31.9308662,"lng":117.1261244},"southwest":{"lat":31.924292,"lng":117.1200486}}
         * copyrights : 地图数据 ©2018 GS(2011)6020
         * legs : [{"distance":{"text":"1.1 公里","value":1051},"duration":{"text":"5分钟","value":297},"end_address":"中国安徽省合肥市庐阳区三丰路","end_location":{"lat":31.9301551,"lng":117.1200426},"start_address":"中国安徽省合肥市庐阳区古城路130号","start_location":{"lat":31.924292,"lng":117.1261244},"steps":[{"distance":{"text":"0.9 公里","value":852},"duration":{"text":"4分钟","value":234},"end_location":{"lat":31.9308662,"lng":117.12191},"html_instructions":"从<b>古城路<\/b>向<b>北<\/b>行驶，到<b>杨岗路<\/b>","polyline":{"points":"yezaEge{iU_FrAEB_FvAkD~@aCv@WJaBr@cAl@a@ZMJ_AhAmA|AoD~ECB"},"start_location":{"lat":31.924292,"lng":117.1261244},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":199},"duration":{"text":"1分钟","value":63},"end_location":{"lat":31.9301551,"lng":117.1200426},"html_instructions":"向<b>左<\/b>转，进入<b>三丰路<\/b>","maneuver":"turn-left","polyline":{"points":"}n{aE}jziUt@~@`@v@Lb@DLBLVpBDjA"},"start_location":{"lat":31.9308662,"lng":117.12191},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]},{"distance":{"text":"1 米","value":1},"duration":{"text":"1分钟","value":0},"end_address":"中国安徽省合肥市庐阳区三丰路","end_location":{"lat":31.9301556,"lng":117.1200486},"start_address":"中国安徽省合肥市庐阳区三丰路","start_location":{"lat":31.9301551,"lng":117.1200426},"steps":[{"distance":{"text":"1 米","value":1},"duration":{"text":"1分钟","value":0},"end_location":{"lat":31.9301556,"lng":117.1200486},"html_instructions":"向<b>东<\/b>行驶","polyline":{"points":"oj{aEg_ziU?A"},"start_location":{"lat":31.9301551,"lng":117.1200426},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"yezaEge{iUqRnFyCbAaBr@cAl@o@f@mCfDsDbFt@~@`@v@Rp@Z~BDhA"}
         * summary : 古城路
         * warnings : []
         * waypoint_order : [0]
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<?> warnings;
        private List<Integer> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<Integer> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<Integer> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":31.9308662,"lng":117.1261244}
             * southwest : {"lat":31.924292,"lng":117.1200486}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 31.9308662
                 * lng : 117.1261244
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 31.924292
                 * lng : 117.1200486
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : yezaEge{iUqRnFyCbAaBr@cAl@o@f@mCfDsDbFt@~@`@v@Rp@Z~BDhA
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * distance : {"text":"1.1 公里","value":1051}
             * duration : {"text":"5分钟","value":297}
             * end_address : 中国安徽省合肥市庐阳区三丰路
             * end_location : {"lat":31.9301551,"lng":117.1200426}
             * start_address : 中国安徽省合肥市庐阳区古城路130号
             * start_location : {"lat":31.924292,"lng":117.1261244}
             * steps : [{"distance":{"text":"0.9 公里","value":852},"duration":{"text":"4分钟","value":234},"end_location":{"lat":31.9308662,"lng":117.12191},"html_instructions":"从<b>古城路<\/b>向<b>北<\/b>行驶，到<b>杨岗路<\/b>","polyline":{"points":"yezaEge{iU_FrAEB_FvAkD~@aCv@WJaBr@cAl@a@ZMJ_AhAmA|AoD~ECB"},"start_location":{"lat":31.924292,"lng":117.1261244},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":199},"duration":{"text":"1分钟","value":63},"end_location":{"lat":31.9301551,"lng":117.1200426},"html_instructions":"向<b>左<\/b>转，进入<b>三丰路<\/b>","maneuver":"turn-left","polyline":{"points":"}n{aE}jziUt@~@`@v@Lb@DLBLVpBDjA"},"start_location":{"lat":31.9308662,"lng":117.12191},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class DistanceBean {
                /**
                 * text : 1.1 公里
                 * value : 1051
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 5分钟
                 * value : 297
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 31.9301551
                 * lng : 117.1200426
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 31.924292
                 * lng : 117.1261244
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * distance : {"text":"0.9 公里","value":852}
                 * duration : {"text":"4分钟","value":234}
                 * end_location : {"lat":31.9308662,"lng":117.12191}
                 * html_instructions : 从<b>古城路</b>向<b>北</b>行驶，到<b>杨岗路</b>
                 * polyline : {"points":"yezaEge{iU_FrAEB_FvAkD~@aCv@WJaBr@cAl@a@ZMJ_AhAmA|AoD~ECB"}
                 * start_location : {"lat":31.924292,"lng":117.1261244}
                 * travel_mode : DRIVING
                 * maneuver : turn-left
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 0.9 公里
                     * value : 852
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 4分钟
                     * value : 234
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 31.9308662
                     * lng : 117.12191
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : yezaEge{iU_FrAEB_FvAkD~@aCv@WJaBr@cAl@a@ZMJ_AhAmA|AoD~ECB
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 31.924292
                     * lng : 117.1261244
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }
}
