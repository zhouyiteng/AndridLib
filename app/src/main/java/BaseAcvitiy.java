import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import yiteng.com.githubtest.util.Logger;
import yiteng.com.githubtest.util.ToastUtils;

/**
 * Created by neil.zhou on 2016/4/12.
 */
public class BaseAcvitiy extends Activity{
    protected String TAG;
    BaseApplication application;
    SharedPreferences sp;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        TAG = this.getClass().getName().toString();

        //添加统一的控制方法
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        application = (BaseApplication) getApplication();
        //sp = getPreferences();
    }

    protected void intent2Activity(Class<? extends BaseAcvitiy> tarActivity){
        Intent intent = new Intent(this,tarActivity);
        startActivity(intent);
    }

    protected void showTost(String msg){
        ToastUtils.showTost(this,msg, Toast.LENGTH_SHORT);
    }

    protected void showLog(String msg){
        Logger.show(TAG,msg);
    }
}
