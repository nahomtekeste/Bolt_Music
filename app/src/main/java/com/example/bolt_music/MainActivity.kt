package com.example.bolt_music

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.url_address
import kotlinx.android.synthetic.main.webview_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val context = this


        // this button allow the user to go
        btn_go.setOnClickListener({
            webview.loadUrl ("https:" +url_address.text.toString())
        })
        // this button allow ths user to get back to the pervour section
        btnGoBack.setOnClickListener({
            if(webview.canGoBack())
                webview.goBack()
            else
                Toast.makeText(context , "No history avalible " , Toast.LENGTH_SHORT).show()
        })
        // this button allow the user to get forward
        btnGoForward.setOnClickListener({
            if(webview.canGoForward())
                webview.goForward()
            else
                Toast.makeText(context , "No history avalible " , Toast.LENGTH_SHORT).show()
        })
        // this button allow ths user to cancle to the perevouse section
        btn_cancel.setOnClickListener({
            if(webview.canGoBack())
                webview.goBack()
            else
                Toast.makeText(context , "No history avalible " , Toast.LENGTH_SHORT).show()
        })

        // this button allow the user to get intouch with the social media face book
        btn_tube.setOnClickListener{
            var intentfacebook = Intent( Intent.ACTION_VIEW, Uri.parse("Youtube.com"))
            startActivity(intentfacebook)
        }
        // thia button allow the user to connect with tiwter.com
        btn_tiwtter.setOnClickListener{
            var intenttiwiter = Intent(Intent.ACTION_VIEW, Uri.parse("http://tiwter.com"))
            startActivity(intenttiwiter)
        }
        // this button allow the user to go directly to the facebook acount
        btn_facebook.setOnClickListener{
            var intentFacebook = Intent(Intent.ACTION_VIEW , Uri.parse("www.facebook.com"))
            startActivity(intentFacebook)
        }
        // this is the button allow the user directly to instegram
        btn_instegram.setOnClickListener{
            var intent = Intent (Intent.ACTION_VIEW , Uri.parse("www.instergram.com"))
            startActivity(intent)
        }

        // this button allow the user to go directly of coub
        btn_cuob.setOnClickListener{
            var intentcoube = Intent(Intent.ACTION_VIEW , Uri.parse("www.coub.com"))
            startActivity(intent)
        }
    }
}
