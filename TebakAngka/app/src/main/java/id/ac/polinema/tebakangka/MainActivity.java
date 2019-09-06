package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	private EditText Angka;
	private Button submit,reset;
	private int angkaacak;
	private int max = 100;
	private int min = 1;
	//  TODO: deklarasikan variabel di sini

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Angka = findViewById(R.id.number_input);
		submit = findViewById(R.id.guess_button);
		reset = findViewById(R.id.reset_button);
		initRandomNumber();
		// TODO: bind layout di sini
	}


	// TODO: generate angka random di sini
	private void initRandomNumber() {
		angkaacak = new Random().nextInt( 100 - 1) + 1;
	}



	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int check = Integer.parseInt(Angka.getText().toString());
		if (check > angkaacak) {
			Toast.makeText(this, "Tebakkan Anda Kebesaran", Toast.LENGTH_SHORT).show();
		}else if (check < angkaacak ) {
			Toast.makeText(this, "Tebakkan Kekecilan", Toast.LENGTH_SHORT).show();
		}
		else {
			Toast.makeText(this, "Tebakkan Benar Brooo", Toast.LENGTH_SHORT).show();
			submit.setEnabled(false);
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		Angka.setText("");
		submit.setEnabled(true);
		initRandomNumber();
	}
}
