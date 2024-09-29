// Generated by view binder compiler. Do not edit!
package com.example.usedmart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.usedmart.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final DotsIndicator dotIndicator;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView41;

  @NonNull
  public final ImageView imageView42;

  @NonNull
  public final ImageView imageView43;

  @NonNull
  public final ImageView imageView44;

  @NonNull
  public final ImageView imageView45;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBarAd;

  @NonNull
  public final ProgressBar progressBarBrand;

  @NonNull
  public final ProgressBar progressBarPopular;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView81;

  @NonNull
  public final TextView textView82;

  @NonNull
  public final TextView textView83;

  @NonNull
  public final TextView textView84;

  @NonNull
  public final TextView textView85;

  @NonNull
  public final RecyclerView viewBrand;

  @NonNull
  public final ViewPager2 viewPageSlider;

  @NonNull
  public final RecyclerView viewPopular;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull DotsIndicator dotIndicator, @NonNull ImageView imageView,
      @NonNull ImageView imageView2, @NonNull ImageView imageView41, @NonNull ImageView imageView42,
      @NonNull ImageView imageView43, @NonNull ImageView imageView44,
      @NonNull ImageView imageView45, @NonNull ConstraintLayout main,
      @NonNull ProgressBar progressBarAd, @NonNull ProgressBar progressBarBrand,
      @NonNull ProgressBar progressBarPopular, @NonNull ScrollView scrollView2,
      @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextView textView81, @NonNull TextView textView82, @NonNull TextView textView83,
      @NonNull TextView textView84, @NonNull TextView textView85, @NonNull RecyclerView viewBrand,
      @NonNull ViewPager2 viewPageSlider, @NonNull RecyclerView viewPopular) {
    this.rootView = rootView;
    this.dotIndicator = dotIndicator;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.imageView41 = imageView41;
    this.imageView42 = imageView42;
    this.imageView43 = imageView43;
    this.imageView44 = imageView44;
    this.imageView45 = imageView45;
    this.main = main;
    this.progressBarAd = progressBarAd;
    this.progressBarBrand = progressBarBrand;
    this.progressBarPopular = progressBarPopular;
    this.scrollView2 = scrollView2;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView81 = textView81;
    this.textView82 = textView82;
    this.textView83 = textView83;
    this.textView84 = textView84;
    this.textView85 = textView85;
    this.viewBrand = viewBrand;
    this.viewPageSlider = viewPageSlider;
    this.viewPopular = viewPopular;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dotIndicator;
      DotsIndicator dotIndicator = ViewBindings.findChildViewById(rootView, id);
      if (dotIndicator == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView41;
      ImageView imageView41 = ViewBindings.findChildViewById(rootView, id);
      if (imageView41 == null) {
        break missingId;
      }

      id = R.id.imageView42;
      ImageView imageView42 = ViewBindings.findChildViewById(rootView, id);
      if (imageView42 == null) {
        break missingId;
      }

      id = R.id.imageView43;
      ImageView imageView43 = ViewBindings.findChildViewById(rootView, id);
      if (imageView43 == null) {
        break missingId;
      }

      id = R.id.imageView44;
      ImageView imageView44 = ViewBindings.findChildViewById(rootView, id);
      if (imageView44 == null) {
        break missingId;
      }

      id = R.id.imageView45;
      ImageView imageView45 = ViewBindings.findChildViewById(rootView, id);
      if (imageView45 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.progressBarAd;
      ProgressBar progressBarAd = ViewBindings.findChildViewById(rootView, id);
      if (progressBarAd == null) {
        break missingId;
      }

      id = R.id.progressBarBrand;
      ProgressBar progressBarBrand = ViewBindings.findChildViewById(rootView, id);
      if (progressBarBrand == null) {
        break missingId;
      }

      id = R.id.progressBarPopular;
      ProgressBar progressBarPopular = ViewBindings.findChildViewById(rootView, id);
      if (progressBarPopular == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView81;
      TextView textView81 = ViewBindings.findChildViewById(rootView, id);
      if (textView81 == null) {
        break missingId;
      }

      id = R.id.textView82;
      TextView textView82 = ViewBindings.findChildViewById(rootView, id);
      if (textView82 == null) {
        break missingId;
      }

      id = R.id.textView83;
      TextView textView83 = ViewBindings.findChildViewById(rootView, id);
      if (textView83 == null) {
        break missingId;
      }

      id = R.id.textView84;
      TextView textView84 = ViewBindings.findChildViewById(rootView, id);
      if (textView84 == null) {
        break missingId;
      }

      id = R.id.textView85;
      TextView textView85 = ViewBindings.findChildViewById(rootView, id);
      if (textView85 == null) {
        break missingId;
      }

      id = R.id.viewBrand;
      RecyclerView viewBrand = ViewBindings.findChildViewById(rootView, id);
      if (viewBrand == null) {
        break missingId;
      }

      id = R.id.viewPageSlider;
      ViewPager2 viewPageSlider = ViewBindings.findChildViewById(rootView, id);
      if (viewPageSlider == null) {
        break missingId;
      }

      id = R.id.viewPopular;
      RecyclerView viewPopular = ViewBindings.findChildViewById(rootView, id);
      if (viewPopular == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, dotIndicator, imageView,
          imageView2, imageView41, imageView42, imageView43, imageView44, imageView45, main,
          progressBarAd, progressBarBrand, progressBarPopular, scrollView2, textView, textView2,
          textView3, textView4, textView5, textView6, textView81, textView82, textView83,
          textView84, textView85, viewBrand, viewPageSlider, viewPopular);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
