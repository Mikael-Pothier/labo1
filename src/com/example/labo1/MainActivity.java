package com.example.labo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	String textes="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void envoyer9(View button){
		if(textes.length()<4){
			textes+="9";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer8(View button){
		if(textes.length()<4){
			textes+="8";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer7(View button){
		if(textes.length()<4){
			textes+="7";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer6(View button){
		if(textes.length()<4){
			textes+="6";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer5(View button){
		if(textes.length()<4){
			textes+="5";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer4(View button){
		if(textes.length()<4){
			textes+="4";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer3(View button){
		if(textes.length()<4){
			textes+="3";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer2(View button){
		if(textes.length()<4){
			textes+="2";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer1(View button){
		if(textes.length()<4){
			textes+="1";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	public void envoyer0(View button){
		if(textes.length()<4){
			textes+="0";
			TextView message = (TextView) findViewById(R.id.texte);
			message.setText(message.getText()+"*");
		}
	}
	 
	
}
