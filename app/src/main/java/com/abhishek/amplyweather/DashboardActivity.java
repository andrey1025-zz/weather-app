package com.abhishek.amplyweather;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.abhishek.amplyweather.httpModule.RequestBuilder;
import com.abhishek.amplyweather.httpModule.ResponseElement;
import com.abhishek.amplyweather.httpModule.RunanbleCallback;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    private static final String TAG = DashboardActivity.class.getSimpleName();
    ArrayList<MData> arrayList = new ArrayList<>();
    DataListAdapter listAdapter;
    ListView listView;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //To Hide the title bar
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();

        setContentView(R.layout.activity_dashboard);
        listView = (ListView)findViewById(R.id.listView);
//        listAdapter = new DataListAdapter(this, array);
        getAPIData();

    }

    private void getAPIData() {
//        btn_signin.setEnabled(false);
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("reading data...");
        progressDialog.show();
        RequestBuilder requestBuilder = new RequestBuilder("https://j9l4zglte4.execute-api.us-east-1.amazonaws.com/api/ctl/weather");
        requestBuilder
                .addParam("zipcode", "62704")
                .sendRequest(getAPICallback);
    }
    RunanbleCallback getAPICallback = new RunanbleCallback() {
        @Override
        public void finish(ResponseElement element) {

            progressDialog.hide();
        }

    };
}