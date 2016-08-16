package cn.zhz.auntaunt.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import auntanut.zhz.cn.auntaunt.R;

public class Main_Fragment extends Fragment {
    private String content;
    public Main_Fragment(String content) {
        this.content = content;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fg_content, container, false);
        TextView txt_content=(TextView)view.findViewById(R.id.txt_content);
        txt_content.setText(content);
        return view;
    }

}
