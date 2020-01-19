package com.diegotorres.conversormoneda

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner1 = findViewById(R.id.spin1) as Spinner
        val spinner2 = findViewById(R.id.spin2) as Spinner
        val paisMoneda = arrayOf("COP", "USA", "CNY", "KRW")
        val paisImagen = intArrayOf(R.drawable.cop, R.drawable.usa, R.drawable.cny, R.drawable.krw)
        val spinnerCustomAdapter = SpinnerCustomAdapter(applicationContext, paisImagen, paisMoneda)
        spinner1.adapter = spinnerCustomAdapter
        spinner2.adapter = spinnerCustomAdapter



        cambio.setOnClickListener {
            conversion(spinner1.selectedItemPosition,spinner2.selectedItemPosition)
        }

    }
    class SpinnerCustomAdapter(private var context: Context, private var flags: IntArray, private var Network: Array<String>) : BaseAdapter() { private var inflter: LayoutInflater
        init {
            inflter = LayoutInflater.from(context)
        }
        override fun getCount(): Int {
            return flags.size
        }
        override fun getItem(i: Int): Any? {
            return null
        }
        override fun getItemId(i: Int): Long {
            return 0
        }
        override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
            var view = view
            view = inflter.inflate(R.layout.flags_spinner, null)
            val icon = view.findViewById(R.id.spinner_imageView) as ImageView
            val names = view.findViewById(R.id.spinner_textView) as TextView
            icon.setImageResource(flags[i])
            names.text = Network[i]
            return view
        }
    }

    fun conversion(valor1:Int, valor2:Int){
        val aux1 = valor1
        val aux2 = valor2
        val tomarValor:String
        val mostValor:String
        val salida:String
        val op1:Double
        val res:Double
        if(aux1 == 0 && aux2 == 1){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 0.000300954*op1
            mostValor = res.toString()
            salida = tomarValor  + " Pesos " + "son " + mostValor + " Dolares"
            visual.text = salida
        }
        else if(aux1 == 0 && aux2 == 2){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 0.0021*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Pesos " + "son " + mostValor + " Yuan"
            visual.text = salida
        }
        else if(aux1 == 0 && aux2 == 3){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 0.35*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Pesos " + "son " + mostValor + " Won"
            visual.text = salida
        }
        else if(aux1 == 1 && aux2 == 0){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 3322.76*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Dolares " + "son " + mostValor + " Pesos"
            visual.text = salida
        }
        else if(aux1 == 1 && aux2 == 2){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 6.88*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Dolares " + "son " + mostValor + " Yuan"
            visual.text = salida
        }
        else if(aux1 == 1 && aux2 == 3){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 1160.73*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Dolares " + "son " + mostValor + " Won"
            visual.text = salida
        }
        else if(aux1 == 2 && aux2 == 0){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 483.06*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Yuan " + "son " + mostValor + " Pesos"
            visual.text = salida
        }
        else if(aux1 == 2 && aux2 == 1){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 0.15*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Yuan " + "son " + mostValor + " Dolares"
            visual.text = salida
        }
        else if(aux1 == 2 && aux2 == 3){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 168.74*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Yuan " + "son " + mostValor + " Won"
            visual.text = salida
        }
        else if(aux1 == 3 && aux2 == 0){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 2.86*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Won " + "son " + mostValor + " Pesos"
            visual.text = salida
        }
        else if(aux1 == 3 && aux2 == 1){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 0.00086*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Won " + "son " + mostValor + " Dolares"
            visual.text = salida
        }
        else if(aux1 == 3 && aux2 == 2){
            tomarValor = textSpin1.text.toString()
            op1 = tomarValor.toDouble()
            res = 0.0059*op1
            mostValor = res.toString()
            textSpin2.text = mostValor
            salida = tomarValor + " Won " + "son " + mostValor + " Yuan"
            visual.text = salida
        }
        else{
            Toast.makeText(this,"Cambia de divisa",Toast.LENGTH_LONG).show()
        }
    }
}
