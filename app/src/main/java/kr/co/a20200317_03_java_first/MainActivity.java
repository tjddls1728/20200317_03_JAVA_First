package kr.co.a20200317_03_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

                Log.d(tag.버튼클릭,msg.입력버튼눌림);

                String input =binding.inputEdt.getText().toString();
                binding.resulttext.setText(input);
                binding.inputEdt.setText("");
            }
        });

    }
}
