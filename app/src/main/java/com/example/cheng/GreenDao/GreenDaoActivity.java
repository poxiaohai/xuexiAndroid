package com.example.cheng.GreenDao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.App;
import com.example.cheng.android.R;
import com.socks.library.KLog;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GreenDaoActivity extends AppCompatActivity {

    @BindView(R.id.save)
    TextView save;
    @BindView(R.id.delete)
    TextView delete;
    @BindView(R.id.update)
    TextView update;
    @BindView(R.id.select)
    TextView select;
    private UserDao mUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_dao);
        ButterKnife.bind(this);
        mUserDao = App.getInstances().getDaoSession().getUserDao();
        //mUserDao.load(1l);
        //mUserDao.updateKeyAfterInsert();
       // mUserDao.deleteAll();
     //   mUserDao.deleteByKey();
    }

    @OnClick({R.id.save, R.id.delete, R.id.update, R.id.select})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.save:
                User mUser = new User();
                mUser.setId(1l);
                mUser.setAge(18+"");
                mUser.setSex("男");
                mUser.setName("cfr");
                mUser.setSalary("haha");
                mUserDao.insert(mUser);//添加一个
                break;
            case R.id.delete:
                mUserDao.deleteByKey(1l);
                break;
            case R.id.update:
                User mUser1 = new User();
                mUser1.setId(1l);
                mUser1.setAge(18+"");
                mUser1.setSex("男");
                mUser1.setName("cfr");
                mUser1.setSalary("haha2");
                mUserDao.update(mUser1);
                break;
            case R.id.select:
                List<User> list=mUserDao.loadAll();
                for (User u:list) {
                    KLog.e(u.toString());
                }
                break;
        }
    }
}
