package auntanut.zhz.cn.auntaunt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import cn.zhz.auntaunt.fragment.Aboutme_Fragment;
import cn.zhz.auntaunt.fragment.Main_Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_top_bar,tv_shouye,tv_order,tv_me;
    FrameLayout ll;
    private Main_Fragment fg1,fg2,fg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bind();
        tv_shouye.performClick();
    }
    public void bind() {
        tv_top_bar = (TextView) findViewById(R.id.tv_top_bar);
        tv_shouye = (TextView) findViewById(R.id.tv_shouye);
        tv_order = (TextView) findViewById(R.id.tv_order);
        tv_me = (TextView) findViewById(R.id.tv_me);
        ll = (FrameLayout) findViewById(R.id.fl_content);
        tv_shouye.setOnClickListener(this);
        tv_order.setOnClickListener(this);
        tv_me.setOnClickListener(this);
    }
    //重置所有文本的选中状态
    private void setSelected(){
        tv_shouye.setSelected(false);
        tv_order.setSelected(false);
        tv_me.setSelected(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_shouye:
                setSelected();
                tv_shouye.setSelected(true);
                fg1 = new Main_Fragment("第一个Fragment");
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_content, fg1).commit();
                break;
            case R.id.tv_order:
                setSelected();
                tv_order.setSelected(true);
                fg2 = new Main_Fragment("第二个Fragment");
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_content, fg2).commit();
                break;
            case R.id.tv_me:
                setSelected();
                tv_me.setSelected(true);
                fg3 = new Main_Fragment("第三个Fragment");
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_content,fg3).commit();
                break;
        }

    }
}
