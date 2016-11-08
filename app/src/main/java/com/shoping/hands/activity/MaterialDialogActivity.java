package com.shoping.hands.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.shoping.hands.R;
import com.shoping.hands.base.BaseActivity;
import com.shoping.hands.manager.ToastUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MaterialDialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_dialog);
        ButterKnife.bind(this);
        mContext = this;
    }

    @Override
    public void initView() {
        setToolbarTitle("主标题");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toolbar_right_img:
                startActivity(MaterialDialogActivity.class);
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_img_menu, menu);
        return true;
    }

    private void checkBoxDialog() {
        new MaterialDialog.Builder(this)
                .iconRes(R.mipmap.all_icon)
                .limitIconToDefaultSize()
                .title(R.string.sure)
                .positiveText(R.string.sure)
                .negativeText(R.string.cancle)
                .onAny(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        switch (which) {
                            case POSITIVE:
                                ToastUtil.showToastShort(mContext, "Prompt checked? " + dialog.isPromptCheckBoxChecked());
                                break;
                            case NEGATIVE:
                                break;
                        }
                    }
                })
                .checkBoxPromptRes(R.string.cancle, false, null)
                .show();
    }

    private void iconDialog() {
    }

    private void dismissDialogs() {
    }

    private void basicDialog() {
        new MaterialDialog.Builder(mContext)
                .title("标题")
                .content("内容")
                .positiveText(R.string.sure)
                .negativeText(R.string.cancle)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        ToastUtil.showToastShort(mContext, R.string.sure);
                    }
                })
                .show();
    }

    @OnClick({R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                basicDialog();
                break;
            case R.id.button2:
                checkBoxDialog();
                break;
            case R.id.button3:
                iconDialog();
                break;
            case R.id.button4:
                dismissDialogs();
                break;
            case R.id.button5:
                break;
            case R.id.button6:
                break;
        }
    }
}
