Android 12 以降が必要です。

`Android 12 DP2`から、ライブラリなしで好きなViewにぼかしをかけることができるようになりました。

`RenderEffect API`のサンプルコードです。

## RenderEffect API
Example:

```kotlin
viewBinding.imageView.post {
    viewBinding.imageView.setRenderEffect(RenderEffect.createBlurEffect(10f, 10f, Shader.TileMode.CLAMP))
}
```