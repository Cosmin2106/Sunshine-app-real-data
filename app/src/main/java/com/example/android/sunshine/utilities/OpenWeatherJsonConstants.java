package com.example.android.sunshine.utilities;

import android.net.Uri;

public abstract class OpenWeatherJsonConstants {

    public final String OWM_CITY = "city";
    public final String OWM_COORD = "coord";

    public final String OWM_LATITUDE = "lat";
    public final String OWM_LONGITUDE = "lon";

    public final String OWM_LIST = "list";
    public final String OWM_MAIN = "main";

    public final String OWM_PRESSURE = "pressure";
    public final String OWM_HUMIDITY = "humidity";
    public final String OWM_MAX;
    public final String OWM_MIN;

    public final String OWM_WIND = "wind";
    public final String OWM_WIND_SPEED = "speed";
    public final String OWM_WIND_DIRECTION = "deg";

    public final String OWM_TEMPERATURE = "temp";

    public final String OWM_WEATHER = "weather";
    public final String OWM_WEATHER_ID = "id";

    public final String OWM_MESSAGE_CODE = "cod";

    public boolean useTestServer;

    public OpenWeatherJsonConstants() {
        Uri serverUri = Uri.parse(NetworkUtils.FORECAST_BASE_URL);
        String serverName = serverUri.getHost();

        this.useTestServer = serverName.contains("udacity");

        if (useTestServer) {
            OWM_MAX = "max";
            OWM_MIN = "min";
        }
        else {
            OWM_MAX = "temp_max";
            OWM_MIN = "temp_min";
        }
    }
}
