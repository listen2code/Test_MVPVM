<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools">
    <data>
        <variable name="data" type="${packageName}.model.viewmodel.I${activityClass}ViewModel"/>
        <variable name="presenter" type="${packageName}.presenter.I${activityClass}Presenter"/>
    </data>

    <LinearLayout 
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

        <TextView
            android:id="@+id/tv_test"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="@{data.text}"/>

        <Button
            android:id="@+id/btn_test"
            android:layout_below="@id/tv_test"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="@{presenter.onClickAction}"
            android:text="@{data.buttonText}"/>

    </LinearLayout>

</layout>
