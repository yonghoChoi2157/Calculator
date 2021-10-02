package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    var n1 : String ="0"
    var n2 : String ="0"
    var count : Int = 0 // 계산 상태 0: 계산 안함, 1: 계산 함
    var n2State : Int = 0 // n2 상태 0: 한자리, 1: 두자리 이상

    /*
    * arithmeticOperatorState : 산술연산자 상태
    * 0 : 아무것도 없음.
    * 1 : + (더하기)
    * 2 : - (빼기)
    * 3 : * (곱하기)
    * */
    var arithmeticOperatorState : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btn10.setOnClickListener(this)
        binding.btn11.setOnClickListener(this)
        binding.btn12.setOnClickListener(this)
        binding.btn13.setOnClickListener(this)
        binding.btn14.setOnClickListener(this)
        binding.btn15.setOnClickListener(this)
        binding.btn16.setOnClickListener(this)
        binding.btn17.setOnClickListener(this)

    }

    @SuppressLint("SetTextI18n")
    override fun onClick(p0: View?) {

        /*binding.btn14.setText("C").toString()*/

        when (p0) {
            binding.btn2 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("7").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("7").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "7").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "7").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn3 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("8").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("8").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                    resetColor()
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "8").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "8").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn4 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("9").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("9").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "9").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "9").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn5 -> {
                arithmeticOperatorState = 3
                changeColor(arithmeticOperatorState)
            }
            binding.btn6 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("4").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding. btn1.setText("4").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "4").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "4").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn7 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("5").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("5").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "5").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "5").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn8 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("6").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("6").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "6").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "6").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn9 -> {
                arithmeticOperatorState = 1
                changeColor(arithmeticOperatorState)
            }
            binding.btn10 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("1").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("1").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "1").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "1").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn11 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("2").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("2").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "2").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "2").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn12 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("3").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("3").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "3").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "3").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn13 -> {
                arithmeticOperatorState = 2
                changeColor(arithmeticOperatorState)
            }
            binding.btn14 -> {
                // TODO : n2에 값이 있을 때 C를 누르면 btn1.text 가 0이 됨, n2에 값이 없으면 arithmeticOperatorState 상태가 0 이 되고 resetColor() 실행
                binding.btn1.setText("0").toString()
                n1 = binding.btn1.text.toString()
                arithmeticOperatorState = 0
                resetColor()

                /*if (n1 == "0") {
                     binding.btn14.setText("AC").toString()
                } else if (arithmeticOperatorState != 0 && n2 == "0") {
                    arithmeticOperatorState = 0
                    resetColor()
                    binding.btn1.setText(n1).toString()
                } else if (arithmeticOperatorState == 0 && n1 != "0"){
                    binding.btn14.setText("AC").toString()
                    binding.btn1.setText("0").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2 != "0") {
                    binding.btn1.setText("0").toString()
                    n2 = "0"
                    arithmeticOperatorState = arithmeticOperatorState
                }*/
            }
            binding.btn15 -> {
                valueReset()
                if (arithmeticOperatorState == 0 && binding.btn1.text.toString() == "0") {
                    binding.btn1.setText("0").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 0) {
                    binding.btn1.setText("0").toString()
                    n2 = binding.btn1.text.toString()
                    n2State = 1
                } else if (arithmeticOperatorState == 0 && binding.btn1.text.toString() != "0"){
                    binding.btn1.setText(binding.btn1.text.toString() + "0").toString()
                    n1 = binding.btn1.text.toString()
                } else if (arithmeticOperatorState != 0 && n2State == 1) {
                    binding.btn1.setText(binding.btn1.text.toString() + "0").toString()
                    n2 = binding.btn1.text.toString()
                }
            }
            binding.btn16 -> {
                if (n1 != "0" || n2 != "0") {
                    binding.btn1.setText(binding.btn1.text.toString() + ".").toString()
                }
            }
            binding.btn17 -> {
                count = 1
                resetColor()

                when (arithmeticOperatorState) {
                    1 -> {
                        if (binding.btn1.text.toString().contains(".")) {
                            val a : Double = plus(n1.toDouble().toInt(), n2.toDouble().toInt()).toDouble()
                            binding.btn1.setText(a.toString()).toString()
                        } else {
                            val a : Int = plus(Integer.valueOf(n1), Integer.valueOf(n2))
                            binding.btn1.setText(a.toString()).toString()
                        }
                    }
                    2 -> {
                        if (binding.btn1.text.toString().contains(".")) {
                            val b : Double = sub(n1.toDouble().toInt(), n2.toDouble().toInt()).toDouble()
                            binding.btn1.setText(b.toString()).toString()
                        } else {
                            val b : Int = sub(Integer.valueOf(n1), Integer.valueOf(n2))
                            binding.btn1.setText(b.toString()).toString()
                        }
                    }
                    3 -> {
                        if (binding.btn1.text.toString().contains(".")) {
                            val c : Double = mul(n1.toDouble().toInt(), n2.toDouble().toInt()).toDouble()
                            binding.btn1.setText(c.toString()).toString()
                        } else {
                            val C : Int = mul(Integer.valueOf(n1), Integer.valueOf(n2))
                            binding.btn1.setText(C.toString()).toString()
                        }
                    }
                }

                arithmeticOperatorState = 0
                n1 = "0"
                n2 = "0"
                n2State = 0
            }
        }

    }

    // 더하기
    private fun plus(a : Int, b : Int) : Int {
        return a + b
    }

    // 빼기
    private fun sub(a : Int, b : Int) : Int {
        return a - b
    }

    // 곱하기
    private fun mul(a : Int, b : Int) : Int {
        return a * b
    }

    // 결과 값 초기화
    private fun valueReset() {
        if (count == 1) {
            binding.btn1.setText("0").toString()
            count = 0
        }
    }

    // 산술 연산자 배경 및 글자 색 바꾸기
    private fun changeColor(a : Int) {
        when (a) {
            1 -> {
                resetColor()
                binding.btn9.background = ContextCompat.getDrawable(this, R.drawable.circle2)
                binding.btn9.setTextColor(ContextCompat.getColor(this, R.color.orange))
            }
            2 -> {
                resetColor()
                binding.btn13.background = ContextCompat.getDrawable(this, R.drawable.circle2)
                binding.btn13.setTextColor(ContextCompat.getColor(this, R.color.orange))
            }
            3 -> {
                resetColor()
                binding.btn5.background = ContextCompat.getDrawable(this, R.drawable.circle2)
                binding.btn5.setTextColor(ContextCompat.getColor(this, R.color.orange))
            }
        }
    }

    // 버튼 배경색 되돌리기
    private fun resetColor() {
        binding.btn5.background = ContextCompat.getDrawable(this, R.drawable.circle1)
        binding.btn9.background = ContextCompat.getDrawable(this, R.drawable.circle1)
        binding.btn13.background = ContextCompat.getDrawable(this, R.drawable.circle1)

        resetTextColor()
    }

    // 글자 색 되돌리기
    private fun resetTextColor() {
        binding.btn5.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.btn9.setTextColor(ContextCompat.getColor(this, R.color.white))
        binding.btn13.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    @SuppressLint("SetTextI18n")
    private fun changeBtn14Text() {
        binding.btn1.setText("0").toString()
        n2 = "0"
        n2 = binding.btn1.text.toString()
        binding.btn14.setText("AC").toString()
    }

}