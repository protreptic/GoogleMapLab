package name.peterbukhal.android.googlemaplab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.taxik.client.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_content, MapFragment.newInstance(), MapFragment.FRAGMENT_TAG_MAP)
                    .commit();
        }
    }
}
