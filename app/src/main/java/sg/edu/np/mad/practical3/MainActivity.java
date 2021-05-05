package sg.edu.np.mad.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    User user;
    private static final String TAG = "Main Activity";
    private TextView maintext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Debug", "create");
        Intent receivedData = getIntent();

        maintext = findViewById(R.id.txtName);
        String randomno = receivedData.getStringExtra(("Random"));


        user = new User();
        user.name = "MAD " + randomno;
        user.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        user.id = 1;
        user.followed = false;

        TextView name = findViewById(R.id.txtName);
        name.setText(user.name);
        TextView description = findViewById(R.id.txtDescription);
        description.setText(user.description);
        setFollowBtn();
    }

    private void setFollowBtn() {
        Button b = findViewById(R.id.btnFollow);
        if(user.followed) {
            b.setText("Unfollow");
        }
        else {
            b.setText("Follow");
        }
    }
    public void onFollowClick(View v) {
        user.followed = !user.followed;
        setFollowBtn();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Debug", "restart");
    }
}