package com.alpha.posapp.address_pkg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.alpha.posapp.R;
import com.alpha.posapp.bean.HistoryData;
import com.alpha.posapp.cart_pkg.AddToCart_Activity;
import com.alpha.posapp.chat_pkg.Chat_Adapter;
import com.alpha.posapp.notification_pkg.Notification_Activity;

import java.util.ArrayList;

public class EditAddress_Activity extends AppCompatActivity implements View.OnClickListener, Chat_Adapter.MyOrderAppOnclickListener {
    public ArrayList<HistoryData> chatList;
    ImageView iv_back;
    View toolbar;
    AppCompatTextView tv_title;
    RelativeLayout rl_cat,rl_search,rl_notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_address);

        toolbar = findViewById(R.id.toolbar);
        tv_title = toolbar.findViewById(R.id.tv_tittle);
        rl_cat = toolbar.findViewById(R.id.rl_cat);
        rl_search = toolbar.findViewById(R.id.rl_search);
        rl_notification = toolbar.findViewById(R.id.rl_notification);
        iv_back = toolbar.findViewById(R.id.id_back);

        iv_back.setOnClickListener(this);
        rl_notification.setOnClickListener(this);
        rl_cat.setOnClickListener(this);

        tv_title.setText(R.string.editaddress);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.id_back:
                finish();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                break;

            case R.id.rl_cat:
                startActivity(new Intent(EditAddress_Activity.this, AddToCart_Activity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                break;

            case R.id.rl_notification:
                startActivity(new Intent(EditAddress_Activity.this, Notification_Activity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                break;
        }
    }

    @Override
    public void MyOrderAppOnclickListener(View view, int position, HistoryData orderList) {

    }
}
