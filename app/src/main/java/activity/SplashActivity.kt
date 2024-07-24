package activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.internshala.foodorderingapp.R

class SplashActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_splash)



        Handler().postDelayed({
            val mainIntent =
                Intent(this@SplashActivity, LoginRegisterActivity::class.java)
            finish()
            startActivity(mainIntent)
        }, 2000)
    }
}
