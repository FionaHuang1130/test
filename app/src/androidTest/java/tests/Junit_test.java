package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.fuhuang.testproject.MainActivity;
import com.example.fuhuang.testproject.R;

import junit.framework.Assert;

/**
 * Created by fuhuang on 4/19/2016.
 */
public class Junit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public Junit_test(){
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }

}
