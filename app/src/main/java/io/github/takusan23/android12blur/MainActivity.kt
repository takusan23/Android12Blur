package io.github.takusan23.android12blur

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import io.github.takusan23.android12blur.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                applyBlurImageView(p1.toFloat())
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

    }

    /**
     * set ImageView blur
     *
     * @param progress 1以上
     * */
    private fun applyBlurImageView(progress: Float) {
        viewBinding.imageView.post {
            viewBinding.imageView.setRenderEffect(RenderEffect.createBlurEffect(progress, progress, Shader.TileMode.CLAMP))
        }
    }

}