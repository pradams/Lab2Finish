package patrickadams.sumapp.tests;

import android.support.annotation.MainThread;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import patrickadams.sumapp.MainActivity;
import patrickadams.sumapp.R;

/**
 * Created by Patrick on 4/18/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;

    public JUnit_test(){

        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        int num1 = 50;
        int num2 = 25;

        int result = mainActivity.sum(num1, num2);

        assertEquals(75, result);

    }


}
