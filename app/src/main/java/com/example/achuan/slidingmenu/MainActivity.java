package com.example.achuan.slidingmenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.achuan.slidingmenu.view.SlidingMenu;

public class MainActivity extends AppCompatActivity {
    private SlidingMenu mLeftMenu;//获取总的滑动界面
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeftMenu= (SlidingMenu) findViewById(R.id.id_menu);//加载资源
    }
    /*切换菜单的方法*/
    public void toggleMenu(View view)
    {
         mLeftMenu.toggle();
    }
}
