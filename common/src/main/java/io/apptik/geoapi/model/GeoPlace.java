package io.apptik.geoapi.model;

import io.apptik.json.JsonObject;

public interface GeoPlace {

    String id();
    String type();
    String title();
    String summary();
    String[] links();
    GeoPoint midPoint();
    String adderss();
    JsonObject geometry();
    JsonObject properties();
}
