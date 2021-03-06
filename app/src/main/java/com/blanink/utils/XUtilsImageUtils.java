package com.blanink.utils;
import android.widget.ImageView;

import com.blanink.R;

import org.xutils.common.util.DensityUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;
/**
 * Created by Administrator on 2016/9/29.
 * xutils 图片显示的工具类
 */
public class XUtilsImageUtils {
    public static void display(ImageView imageView, String iconUrl) {
        ImageOptions imageOptions = new ImageOptions.Builder()
                .setIgnoreGif(false)//是否忽略gif图。false表示不忽略。不写这句，默认是true
                .setImageScaleType(ImageView.ScaleType.FIT_XY)
                .setFailureDrawableId(R.drawable.empty)
                .setLoadingDrawableId(R.drawable.loading)
                .setUseMemCache(true)
                .build();
        x.image().bind(imageView, iconUrl, imageOptions);

    }

    public static void displayLoading(ImageView imageView, String iconUrl) {
        ImageOptions imageOptions = new ImageOptions.Builder()
                .setIgnoreGif(false)//是否忽略gif图。false表示不忽略。不写这句，默认是true
                .setImageScaleType(ImageView.ScaleType.FIT_XY)
                .setFailureDrawableId(R.drawable.empty)
                .setLoadingDrawableId(R.drawable.loading)
                .setUseMemCache(true)
                .build();
        x.image().bind(imageView, iconUrl, imageOptions);

    }

    /**
     * 显示圆角图片
     *
     * @param imageView 图像控件
     * @param iconUrl   图片地址
     * @param radius    圆角半径，
     */
    public static void display(ImageView imageView, String iconUrl, int radius) {
        ImageOptions imageOptions = new ImageOptions.Builder()
                .setImageScaleType(ImageView.ScaleType.FIT_XY)
                .setRadius(DensityUtil.dip2px(radius))
                .setIgnoreGif(false)
                .setCrop(true)//是否对图片进行裁剪
                .setUseMemCache(true)
                .setFailureDrawableId(R.drawable.empty)
                .setLoadingDrawableId(R.drawable.loading)
                .build();
        x.image().bind(imageView, iconUrl, imageOptions);
    }

    /**
     * 显示圆形头像，第三个参数为true
     *
     * @param imageView  图像控件
     * @param iconUrl    图片地址
     * @param isCircluar 是否显示圆形
     */
    public static void display(ImageView imageView, String iconUrl, boolean isCircluar) {
        ImageOptions imageOptions = new ImageOptions.Builder()
                .setImageScaleType(ImageView.ScaleType.FIT_XY)
                .setCircular(isCircluar)
                .setCrop(true)
                .setUseMemCache(true)
                .setLoadingDrawableId(R.drawable.loading)
                .setFailureDrawableId(R.drawable.empty)
                .build();
        x.image().bind(imageView, iconUrl, imageOptions);


    }


}