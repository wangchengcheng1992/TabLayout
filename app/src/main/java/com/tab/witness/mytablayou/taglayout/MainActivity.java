package com.tab.witness.mytablayou.taglayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dl7.tag.TagLayout;
import com.dl7.tag.TagView;

public class MainActivity extends AppCompatActivity {

    private final String[] mTagWords = new String[]{
            "不同边框形状的标签", "单选和多选标签", "可编辑的标签", "动画效果的换一换标签",
            "TagView的一些其它用途", "水平反向排列(RTL)"
    };
    private TagLayout mTagLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTagLayout = (TagLayout) findViewById(R.id.tag_layout);
        mTagLayout.setTags(mTagWords);
        mTagLayout.setTagClickListener(new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(int position, String text, @TagView.TagMode int tagMode) {
                if (mTagWords[0].equals(text)) {
                    startActivity(new Intent(MainActivity.this, TagShapeActivity.class));
                } else if (mTagWords[1].equals(text)) {
                    startActivity(new Intent(MainActivity.this, TagChoiceActivity.class));
                } else if (mTagWords[2].equals(text)) {
                    startActivity(new Intent(MainActivity.this, TagEditActivity.class));
                } else if (mTagWords[3].equals(text)) {
                    startActivity(new Intent(MainActivity.this, TagChangeActivity.class));
                } else if (mTagWords[4].equals(text)) {
                    startActivity(new Intent(MainActivity.this, TagViewActivity.class));
                } else if (mTagWords[5].equals(text)) {
                    startActivity(new Intent(MainActivity.this, TagReverseActivity.class));
                }
            }
        });
    }
}
