package com.example.bykj.bannerlib;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void show(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
