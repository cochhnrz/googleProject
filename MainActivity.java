package ggl.firstapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void click1(View v) {
        ImageView cat_1=(ImageView)findViewById(R.id.kitten1);
        cat_1.setVisibility(VISIBLE);
        ImageView cat_2=(ImageView)findViewById(R.id.kitten2);
        cat_2.setVisibility(GONE);
        ImageView cat_3=(ImageView)findViewById(R.id.kitten3);
        cat_3.setVisibility(GONE);
        ImageView cat_4=(ImageView)findViewById(R.id.kitten4);
        cat_4.setVisibility(GONE);
        ImageView cat_5=(ImageView)findViewById(R.id.kitten5);
        cat_5.setVisibility(GONE);
    }

    public void click2(View v) {
        ImageView cat_1=(ImageView)findViewById(R.id.kitten1);
        cat_1.setVisibility(GONE);
        ImageView cat_2=(ImageView)findViewById(R.id.kitten2);
        cat_2.setVisibility(VISIBLE);
        ImageView cat_3=(ImageView)findViewById(R.id.kitten3);
        cat_3.setVisibility(GONE);
        ImageView cat_4=(ImageView)findViewById(R.id.kitten4);
        cat_4.setVisibility(GONE);
        ImageView cat_5=(ImageView)findViewById(R.id.kitten5);
        cat_5.setVisibility(GONE);
    }

    public void click3(View v) {
        ImageView cat_1=(ImageView)findViewById(R.id.kitten1);
        cat_1.setVisibility(GONE);
        ImageView cat_2=(ImageView)findViewById(R.id.kitten2);
        cat_2.setVisibility(GONE);
        ImageView cat_3=(ImageView)findViewById(R.id.kitten3);
        cat_3.setVisibility(VISIBLE);
        ImageView cat_4=(ImageView)findViewById(R.id.kitten4);
        cat_4.setVisibility(GONE);
        ImageView cat_5=(ImageView)findViewById(R.id.kitten5);
        cat_5.setVisibility(GONE);
    }

    public void click4(View v) {
        ImageView cat_1=(ImageView)findViewById(R.id.kitten1);
        cat_1.setVisibility(GONE);
        ImageView cat_2=(ImageView)findViewById(R.id.kitten2);
        cat_2.setVisibility(GONE);
        ImageView cat_3=(ImageView)findViewById(R.id.kitten3);
        cat_3.setVisibility(GONE);
        ImageView cat_4=(ImageView)findViewById(R.id.kitten4);
        cat_4.setVisibility(VISIBLE);
        ImageView cat_5=(ImageView)findViewById(R.id.kitten5);
        cat_5.setVisibility(GONE);
    }

    public void click5(View v) {
        ImageView cat_1=(ImageView)findViewById(R.id.kitten1);
        cat_1.setVisibility(GONE);
        ImageView cat_2=(ImageView)findViewById(R.id.kitten2);
        cat_2.setVisibility(GONE);
        ImageView cat_3=(ImageView)findViewById(R.id.kitten3);
        cat_3.setVisibility(GONE);
        ImageView cat_4=(ImageView)findViewById(R.id.kitten4);
        cat_4.setVisibility(GONE);
        ImageView cat_5=(ImageView)findViewById(R.id.kitten5);
        cat_5.setVisibility(VISIBLE);
    }

    public void close(View v) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
