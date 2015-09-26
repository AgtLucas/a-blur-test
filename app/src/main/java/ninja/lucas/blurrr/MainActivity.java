package ninja.lucas.blurrr;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

import com.fivehundredpx.android.blur.BlurringView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBlurringView = (BlurringView) findViewById(R.id.blurring_view);
        View blurredView = findViewById(R.id.blurring_view);

        mBlurringView.setBlurredView(blurredView);

        mImageViews[0] = (ImageView) findViewById(R.id.image0);
        mImageViews[1] = (ImageView) findViewById(R.id.image1);
        mImageViews[2] = (ImageView) findViewById(R.id.image2);
        mImageViews[3] = (ImageView) findViewById(R.id.image3);
        mImageViews[4] = (ImageView) findViewById(R.id.image4);
        mImageViews[5] = (ImageView) findViewById(R.id.image5);
        mImageViews[6] = (ImageView) findViewById(R.id.image6);
        mImageViews[7] = (ImageView) findViewById(R.id.image7);
        mImageViews[9] = (ImageView) findViewById(R.id.image8);
    }

    private BlurringView mBlurringView;

    private int[] mImageIds = {
        R.drawable.p0, R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9
    };

    private ImageView[] mImageViews = new ImageView[9];
    private int mStartIndex;

    public void shuffle(View view) {

    }

    private ValueAnimator.AnimatorUpdateListener listener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public void onAnimationUpdate(ValueAnimator animation) {
            mBlurringView.invalidate();
        }
    };

//    public void shift(View view) {
//        if (!mShifted) {
//            for (ImageView imageView : mImageViews) {
//                ObjectAnimator tx = ObjectAnimator.ofFloat()
//            }
//        }
//    }
}
