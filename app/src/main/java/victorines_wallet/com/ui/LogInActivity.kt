package victorines_wallet.com.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LogInActivity : AppCompatActivity() {
  lateinit var enter:Button
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      enter=findViewById(R.id.btnEnter)
      enter.setOnClickListener {
    startActivity(Intent(baseContext,LogInActivity::class.java))
}

    }
}
