## Activity Transition
An android project presenting some transitions you can use between activities.
##
Project source reference can be taken from https://github.com/ophilbert/ActivityTransition

#####
<a href="https://imgflip.com/gif/2vs6fw"><img src="https://i.imgflip.com/2vs6fw.gif" title="made at imgflip.com"/></a>
######
This is a light bulb transition that was given in the project catalog . When the user press the switch button the bulb seems to light up which actually is the transition that should be put though the java code.
###
Animations
##
Off state
###
<a href="https://imgflip.com/gif/2vssm1"><img src="https://i.imgflip.com/2vssm1.gif" title="made at imgflip.com"/></a>
######
<transition xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/sim1"/>
    <item android:drawable="@drawable/sim"/>
</transition>
##

##
On state
##
<transition xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/sim"/>
    <item android:drawable="@drawable/sim1"/>
</transition>
##
<a href="https://imgflip.com/gif/2vssxf"><img src="https://i.imgflip.com/2vssxf.gif" title="made at imgflip.com"/></a>
