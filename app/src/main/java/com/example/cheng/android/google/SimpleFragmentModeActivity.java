package com.example.cheng.android.google;

import android.Manifest;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.cheng.android.R;
import com.example.cheng.android.google.utils.GoogleModel;
import com.example.cheng.android.google.utils.GoogleUutil;
import com.example.cheng.android.google.utils.LoadResponse;
import com.example.cheng.android.google.utils.RouteInfos;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.places.PlaceLikelihood;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.maps.android.PolyUtil;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.socks.library.KLog;

import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

public class SimpleFragmentModeActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleApiClient.OnConnectionFailedListener {
    GoogleMap mGoogleMap;
    GoogleApiClient mGoogleApiClient;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_mode);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mGoogleApiClient = new GoogleApiClient
                .Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .build();
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng sydney = new LatLng(-33.852, 151.211);
//        googleMap.addMarker(new MarkerOptions().position(sydney)
//                .title("Marker in Sydney"));
        //31.923951, 117.124891
       //31.9342032,117.1377968,
        //31.9283044,117.1202666
        LatLng origin=new LatLng(31.923951,117.124891);
        LatLng waypoints=new LatLng(31.9342032,117.1377968);
        LatLng dest=new LatLng(31.9283044,117.1202666);
       String url= GoogleUutil.getDirectionsUrl(origin,waypoints,dest);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(origin));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(15));
        googleMap.addMarker(new MarkerOptions()
                .position(origin)
                .title("商家")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        requestData(url,googleMap);
    }

    private void requestData(String url, final GoogleMap googleMap) {
        OkGo.post(url).tag(this).execute(new StringCallback() {
            @Override
            public void onSuccess(String s, Call call, Response response) {
                Gson gson=new Gson();
                GoogleModel model=gson.fromJson(s,GoogleModel.class);
                if (model.getStatus().equals("OK")) {
                    GoogleModel.RoutesBean.OverviewPolylineBean polyline = model.getRoutes().get(0).getOverview_polyline();
                    List<LatLng> decodedPath = PolyUtil.decode(polyline.getPoints());
                    googleMap.addPolyline(new PolylineOptions().addAll(decodedPath).color(Color.BLUE));
                }
            }
        });
    }


    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(SimpleFragmentModeActivity.this,"链接失败",Toast.LENGTH_LONG).show();
    }
}
