# Activity Transition
An android project presenting some transitions you can use between activities.
##
Project source reference can be taken from https://github.com/ophilbert/ActivityTransition

## 1) Introduction: What you picked and What is it ?
I Choose to build an app called activityTransition, it is a modern style of application that helps us to convert one state to another state in the form of animations. I incorporated various effects in this app , which can be performed on the main app. Today, various developments in the field of application is carried out , so I decided to have this project for our knowledge development about the various forms of animations, that an app can perform.

## 2) What does it do?

It is an application , which features currently basic animation styles , such as on/off style.It allows the users with a much more fun and animated way to enjoy their images. This basically provides some sort of feelings to the user about using the switch ON and OFF of flashlight that he/she normally do at in their PC and mobile screen.

## 3) Steps to make it work or to use it in my project

The basic steps that were involved in making the project is as follows:
<p> i) Firstly I created a xml layout of the app , that finds appealing to the user, with the help of android studio.</p>
<p> ii) Then I had upload the images at drawable to fit to its size and perform such ON and OFF animations.(few of the codes of the animation are mentioned bellow)</p>

<a href="https://imgflip.com/gif/2vs6fw"><img src="https://i.imgflip.com/2vs6fw.gif" title="made at imgflip.com"/></a>
######
This is a light bulb transition that was given in the project catalog . When the user press the switch button the bulb seems to light up which actually is the transition that should be put though the java code.

Android main java code:
```java

package com.example.a1794821.rezaproject;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    boolean turnedOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                if(!turnedOn) {
                    imageView.setImageResource(R.drawable.trans);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnedOn = true;
                } else
                {imageView.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnedOn = false;

                }
            }


        });
    }
}

```

Main xml Activity code:
```java
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    android:paddingBottom="16dp"
    android:paddingLeft="16dp"
    android:paddingRight="16dp"
    android:paddingTop="16dp"
    tools:context=".MainActivity">


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        app:srcCompat="@drawable/sim" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="27dp"
        android:text="SWITCH" />
</RelativeLayout>
```

Android manifest.Xml code
```java
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.a1794821.rezaproject">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```

###
#Animations

Off state
trans.xml code
```java
<?xml version="1.0" encoding="utf-8"?>
<transition xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/sim1"/>
    <item android:drawable="@drawable/sim"/>
</transition>
```
###
<a href="https://imgflip.com/gif/2vssm1"><img src="https://i.imgflip.com/2vssm1.gif" title="made at imgflip.com"/></a>

On state
trans1.xml.code
```java
<?xml version="1.0" encoding="utf-8"?>
<transition xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/sim"/>
    <item android:drawable="@drawable/sim1"/>
</transition>
```

##
<a href="https://imgflip.com/gif/2vssxf"><img src="https://i.imgflip.com/2vssxf.gif" title="made at imgflip.com"/></a>

## 4) Limitations if any 

I does not faced any hard limitation regarding this ,but i had tried to provide text animation in the app , but it has some limitiations regarding the number of time it performs to kill the animation.

# 5) Submitted by:
Simranjeet Kaur(1794821) 
