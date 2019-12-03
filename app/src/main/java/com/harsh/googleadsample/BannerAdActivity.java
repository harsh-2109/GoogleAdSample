package com.harsh.googleadsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BannerAdActivity extends AppCompatActivity {

    private AdView banner_ad_view,large_ad_banner,medium_rectangle_banner,full_size_banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_ad);
        //Ad will initialise from this page
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        //Banner List
        banner_ad_view=findViewById(R.id.banner_ad_view);
        large_ad_banner=findViewById(R.id.large_banner_ad);
        medium_rectangle_banner=findViewById(R.id.medium_rectangle_ad);
        full_size_banner=findViewById(R.id.full_size_banner);

        AdRequest adRequest = new AdRequest.Builder().build();
        banner_ad_view.loadAd(adRequest);
        large_ad_banner.loadAd(adRequest);
        medium_rectangle_banner.loadAd(adRequest);
        full_size_banner.loadAd(adRequest);
    }
}
