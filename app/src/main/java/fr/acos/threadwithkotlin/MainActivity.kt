package fr.acos.threadwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Fonction contenant le traitement long.
     */
    fun onClickTraitementLong(view: View)
    {
        Thread({
            //Execute 60 fois
            for (i in 1..60)
            {
                //Fait dormir le thread contenant le traitement long
                Thread.sleep(1000)
                //Affichage dans les logs de l'évolution de l'exécution
                Log.i("XXX","Evolution : $i / 60")
            }
        })
    }

    /**
     * Fonction permettant de voir la réactivité de l'IHM
     */
    fun onClickCoucou(view: View)
    {
        //Affichage d'un Toast
        Toast.makeText(this,"Coucou",Toast.LENGTH_LONG).show();
    }
}
