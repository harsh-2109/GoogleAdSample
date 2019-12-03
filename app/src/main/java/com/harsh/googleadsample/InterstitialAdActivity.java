package com.harsh.googleadsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class InterstitialAdActivity extends AppCompatActivity {

    private ConstraintLayout ad_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial_ad);

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");

//        InterstitialAd interstitialAd=new InterstitialAd(this);
//        interstitialAd.setAdUnitId(String.valueOf(R.string.ad_unit_id));
//        interstitialAd.loadAd(new AdRequest.Builder().build());
//        if(interstitialAd.isLoaded()){
//            interstitialAd.show();
//        }
    }
}
