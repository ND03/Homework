<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.namig.volley.MainActivity">


    <FrameLayout
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginEnd="1dp"
        android:layout_marginLeft="1dp"
        android:layout_marginRight="1dp"
        android:layout_marginStart="1dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        tools:layout_constraintBottom_creator="1"
        tools:layout_constraintLeft_creator="1"
        tools:layout_constraintRight_creator="1"
        tools:layout_constraintTop_creator="1">

        <view
            android:id="@+id/view2"
            class="android.support.v4.view.ViewPager"
            id="@+id/view4"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:background="@android:color/holo_blue_bright"
            android:layout_gravity="right"
            />

        <view
            android:id="@+id/view3"
            class="android.support.v4.view.ViewPager"
            id="@+id/view5"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:layout_gravity="center|top"

            android:background="@android:color/holo_green_dark"
             />

        <view
            android:id="@+id/view"
            class="android.support.v4.view.ViewPager"
            id="@+id/view6"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:background="@android:color/holo_red_dark"
            android:layout_gravity="left"

             />
    </FrameLayout>


</android.support.constraint.ConstraintLayout>
