package androidmvp.vinzdez.com.androidmvp.activity;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;

import androidmvp.vinzdez.com.androidmvp.R;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Vicente on 4/16/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder unbinder;

    /**
     * @return A layout resource id used by the subclass.
     */
    @LayoutRes
    protected abstract int getLayoutResId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutResId() != 0) {
            setContentView(getLayoutResId());
        }
        this.unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
