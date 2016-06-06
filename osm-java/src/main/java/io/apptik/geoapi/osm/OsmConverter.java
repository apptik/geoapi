package io.apptik.geoapi.osm;


import java.io.IOException;

import io.apptik.comm.jus.Converter;
import io.apptik.comm.jus.NetworkRequest;
import io.apptik.comm.jus.NetworkResponse;
import io.apptik.json.JsonObject;

public class OsmConverter {

    public static class JsonToRequest implements Converter<JsonObject, NetworkRequest> {

        @Override
        public NetworkRequest convert(JsonObject value) throws IOException {
            return null;
        }
    }

    public static class ResponseToJson  implements Converter<NetworkResponse, JsonObject> {

        @Override
        public JsonObject convert(NetworkResponse value) throws IOException {
            return null;
        }
    }
}
