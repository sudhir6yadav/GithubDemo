package benandbellaar.witsindia.com.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        char data=64;

        int i='A'+1;

        int j='A'+2;

        System.out.println("hello"+i);
        System.out.println("hello"+j);
    }
}
