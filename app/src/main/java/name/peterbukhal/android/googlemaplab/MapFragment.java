package name.peterbukhal.android.googlemaplab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.taxik.client.R;

/**
 * Created by
 *      petronic on 18.05.16.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback,
        GoogleMap.OnMapLoadedCallback {

    public static final String FRAGMENT_TAG_MAP = "fragment_tag_map";

    public static Fragment newInstance() {
        return new MapFragment();
    }

    private MapView mMapView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mMapView = (MapView) inflater.inflate(R.layout.f_map, container, false);
        mMapView.onCreate(savedInstanceState);

        return mMapView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mMapView.getMapAsync(this);
    }

    private GoogleMap mGoogleMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mGoogleMap.setIndoorEnabled(false);
        mGoogleMap.setTrafficEnabled(false);
        mGoogleMap.setBuildingsEnabled(false);
    }

    @Override
    public void onMapLoaded() {

    }

    @Override
    public void onResume() {
        super.onResume();

        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();

        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

        mMapView.onLowMemory();
    }

}
