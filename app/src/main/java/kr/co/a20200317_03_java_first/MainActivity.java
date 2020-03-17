package kr.co.a20200317_03_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import kr.co.a20200317_03_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);





//        Edittext에 타이핑 => 입력버튼 => 텍스트항에 출력
//        입력버튼 누르면 기존 입력내용삭제

        binding.EditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Log.d("버튼클릭","입력버튼눌림");

                String input =binding.inputEdt.getText().toString();

                Log.d("입력값확인", input );

                binding.resulttext.setText(input);
                binding.inputEdt.setText("");
            }
        });

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                입력한값을 변수로 저장
                String pw= binding.pwEdt.getText().toString();

//                1234냐 아니냐
                if (pw == "1234"){


                }

            }
        });

    }
}
