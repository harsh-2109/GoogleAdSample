package com.harsh.googleadsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MainActivity extends AppCompatActivity {

    private Button banner_ad,interstitial_ad,rewarded_ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");

        //Diffrent Size Banner ad in this activity
        banner_ad=findViewById(R.id.banner_ad_button);
        interstitial_ad=findViewById(R.id.interstitial_ad_button);
        rewarded_ad=findViewById(R.id.rewarded_ad_button);

        banner_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BannerAdActivity.class));
            }
        });

        //Interstitial ad
        final InterstitialAd interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.loadAd(new AdRequest.Builder().build());

        interstitial_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded()){
                    interstitialAd.show();
                }else{
                    Log.e("not_Loaded","not laoded");
                    Toast.makeText(MainActivity.this, "AdNot Loaded yet", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Video Ad
        final RewardedVideoAd videoAd=MobileAds.getRewardedVideoAdInstance(this);
        videoAd.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());

        rewarded_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,RewardedAdActivity.class));
                if(videoAd.isLoaded()){
                    videoAd.show();
                }else{
                    Log.e("not_Loaded","not laoded");
                    Toast.makeText(MainActivity.this, "Video ad is not Loaded yet", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
