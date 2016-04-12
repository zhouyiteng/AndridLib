import android.app.Application;
import android.content.Context;

/**
 * Created by neil.zhou on 2016/4/12.
 */
public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //第三方控件初始化
        initImageLoader(this);
    }

    private void initImageLoader(Context context) {

    }
}
