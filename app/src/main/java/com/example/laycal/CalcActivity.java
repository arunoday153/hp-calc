package com.example.laycal;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CalcActivity extends Activity implements OnClickListener {
	EditText t1;
	ToggleButton tb;
	char c;
	String s="",s1="",msg;
	Integer i,flag=0;
	  Integer x;
	  MediaPlayer mp;
	char op;
	double f,f1,f2,f3,f4,f5;
	Double temp[]=new Double[10];
	
	
	
	Button b0,b1,b2,b3,b4,b5,b50,b6,b7,b8,b9,plus,min,div,mul,eq,dot,clear,back,sqrt,sq,sin,cos,tan,pow,cube,log,ln;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		
		t1=(EditText)findViewById(R.id.text1);
		tb=(ToggleButton)findViewById(R.id.toggleButton1);
		mp=MediaPlayer.create(this, R.raw.s);
		b0=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.button2);
		b2=(Button)findViewById(R.id.button3);
		b3=(Button)findViewById(R.id.button4);
		b4=(Button)findViewById(R.id.button5);
		b50=(Button)findViewById(R.id.button6);
		b6=(Button)findViewById(R.id.button7);
		b7=(Button)findViewById(R.id.button8);
		b8=(Button)findViewById(R.id.button9);
		b9=(Button)findViewById(R.id.button10);
		plus=(Button)findViewById(R.id.plus);
		min=(Button)findViewById(R.id.minus);
		mul=(Button)findViewById(R.id.mul);
		div=(Button)findViewById(R.id.div);
		eq=(Button)findViewById(R.id.eq);
		dot=(Button)findViewById(R.id.dot);
		clear=(Button)findViewById(R.id.clear);
		back=(Button)findViewById(R.id.back);
		sq=(Button)findViewById(R.id.sq);
		sqrt=(Button)findViewById(R.id.sqrt);
		sin=(Button)findViewById(R.id.sin);
		cos=(Button)findViewById(R.id.cos);
		pow=(Button)findViewById(R.id.pow);
		cube=(Button)findViewById(R.id.cube);
		log=(Button)findViewById(R.id.log);
		ln=(Button)findViewById(R.id.ln);

		tan=(Button)findViewById(R.id.tan);



		t1.setEnabled(false);
		b0.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b50.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		plus.setEnabled(false);
		min.setEnabled(false);
		mul.setEnabled(false);
		div.setEnabled(false);
		eq.setEnabled(false);
		dot.setEnabled(false);
		clear.setEnabled(false);
		back.setEnabled(false);
		sq.setEnabled(false);
		sqrt.setEnabled(false);
		sin.setEnabled(false);
		cos.setEnabled(false);
		tan.setEnabled(false);
		pow.setEnabled(false);
		cube.setEnabled(false);
		log.setEnabled(false);
		ln.setEnabled(false);



		
		tb.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
		
			if(tb.isChecked())
			{
				mp.start();
				b0.setEnabled(true);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b50.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				dot.setEnabled(true);
				t1.setEnabled(true);

				/*plus.setEnabled(true);
				min.setEnabled(true);
				mul.setEnabled(true);
				div.setEnabled(true);
				eq.setEnabled(true);
				clear.setEnabled(true);
				back.setEnabled(true);
				sq.setEnabled(true);
				sqrt.setEnabled(true);
				sin.setEnabled(true);
				cos.setEnabled(true);
				tan.setEnabled(true);
				*/
			}
			else
			{
				if(mp.isPlaying())
				{
				mp.stop();
				}else{mp.start();}
				
				sin.setEnabled(false);
				cos.setEnabled(false);
				tan.setEnabled(false);
				t1.setEnabled(false);
				b0.setEnabled(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b50.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				plus.setEnabled(false);
				min.setEnabled(false);
				mul.setEnabled(false);
				div.setEnabled(false);
				eq.setEnabled(false);
				dot.setEnabled(false);
				clear.setEnabled(false);
				back.setEnabled(false);
				sq.setEnabled(false);
				sqrt.setEnabled(false);
				sin.setEnabled(false);
				cos.setEnabled(false);
				tan.setEnabled(false);
				pow.setEnabled(false);
				cube.setEnabled(false);
				log.setEnabled(false);
				ln.setEnabled(false);


				s="";
				t1.setText(s);
				
			}
		}
	});

	b0.setOnClickListener(this);
	b1.setOnClickListener(this);
	b2.setOnClickListener(this);
	b3.setOnClickListener(this);
	b4.setOnClickListener(this);
	b50.setOnClickListener(this);
	b6.setOnClickListener(this);
	b7.setOnClickListener(this);
	b8.setOnClickListener(this);
	b9.setOnClickListener(this);
	plus.setOnClickListener(this);
	min.setOnClickListener(this);
	div.setOnClickListener(this);
	mul.setOnClickListener(this);
	dot.setOnClickListener(this);
	eq.setOnClickListener(this);
	sq.setOnClickListener(this);
	sqrt.setOnClickListener(this);
	back.setOnClickListener(this);
	sin.setOnClickListener(this);
	cos.setOnClickListener(this);
	tan.setOnClickListener(this);
	clear.setOnClickListener(this);
	pow.setOnClickListener(this);
	cube.setOnClickListener(this);
	log.setOnClickListener(this);
	ln.setOnClickListener(this);

	
		
		
		

		
	}
	
	

	public void onClick(View v) {

		switch(v.getId())
		{
		case R.id.button1: t1.setText("0");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		  					s=s+t1.getText().toString();
		  					t1.setText(s);
							break;
							
			
		case R.id.button2: t1.setText("1");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button3: t1.setText("2");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button4: t1.setText("3");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		clear.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button5: t1.setText("4");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		eq.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button6: t1.setText("5");
		plus.setEnabled(true);
		min.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button7: t1.setText("6");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);
				

							break;
			
			

		case R.id.button8: t1.setText("7");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button9: t1.setText("8");
		plus.setEnabled(true);
		min.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		eq.setEnabled(true);
		pow.setEnabled(true);
		cube.setEnabled(true);
		log.setEnabled(true);
		ln.setEnabled(true);
		clear.setEnabled(true);
		back.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		sin.setEnabled(true);
		cos.setEnabled(true);
		tan.setEnabled(true);
			s=s+t1.getText().toString();
				t1.setText(s);

							break;
			
			

		case R.id.button10: 
			plus.setEnabled(true);
			min.setEnabled(true);
			mul.setEnabled(true);
			div.setEnabled(true);
			eq.setEnabled(true);
			clear.setEnabled(true);
			pow.setEnabled(true);
			cube.setEnabled(true);
			log.setEnabled(true);
			ln.setEnabled(true);
			back.setEnabled(true);
			sq.setEnabled(true);
			sqrt.setEnabled(true);
			sin.setEnabled(true);
			cos.setEnabled(true);
			tan.setEnabled(true);
			t1.setText("9");
			s=s+t1.getText().toString();
			t1.setText(s);

							break;
							
							
		case R.id.sqrt:s=t1.getText().toString();
						f=Double.parseDouble(s);
						f1= Math.sqrt(f);
						t1.setText(""+f1);
						f=0;
						s="";
						f1=0;
						f2=0;
						x=0;
						break;
							
		case R.id.sq:
			s=t1.getText().toString();
			f=Double.parseDouble(s);
			s="";
			f=f*f;
			t1.setText(""+f);

			f1=0;
			f2=0;
			f=0;
			
			break;
			
							
							
		case R.id.plus:
			op='+';
			
			
			s=t1.getText().toString();
				f=Double.parseDouble(s);
			
			plus.setEnabled(false);
			dot.setEnabled(true);
			s="";
			t1.setText(s);
			
			break;
			
			
		case R.id.minus:
			op='-';
			s=t1.getText().toString();
			f=Double.parseDouble(s);
			s="";
			min.setEnabled(false);
			dot.setEnabled(true);

			t1.setText(s);
			break;
			
		case R.id.mul:
			op='*';
			s=t1.getText().toString();
			f=Double.parseDouble(s);
			s="";
			mul.setEnabled(false);
			dot.setEnabled(true);

			t1.setText(s);
			break;
			
		case R.id.div:
			op='/';
			s=t1.getText().toString();
			f=Double.parseDouble(s);
			s="";
			div.setEnabled(false);
			dot.setEnabled(true);

			t1.setText(s);
			break;
			
		case R.id.dot:  //t1.setText(s+".");
						t1.setText("."); 
						s=s+t1.getText().toString();
						dot.setEnabled(false);
				     	 break;
		case R.id.cos:	s=t1.getText().toString();
						f=Double.parseDouble(s);
						f=Math.cos(f);
						cos.setEnabled(true);
						t1.setText(""+f);
						break;
		
		case R.id.sin: 	s=t1.getText().toString();
						f=Double.parseDouble(s);
						f=Math.sin(f);
						t1.setText(""+f);
						sin.setEnabled(true);

						break;
		
		case R.id.tan: 	s=t1.getText().toString();
						f=Double.parseDouble(s);
						f=Math.tan(f);
						t1.setText(""+f);
						tan.setEnabled(true);
						break;
						
		case R.id.pow:  	
							op='^';
							s=t1.getText().toString();
							f=Double.parseDouble(s);
							div.setEnabled(false);
							dot.setEnabled(false);
							plus.setEnabled(false);
							min.setEnabled(false);
							mul.setEnabled(false);
							div.setEnabled(false);
							eq.setEnabled(false);
							pow.setEnabled(false);
							cube.setEnabled(false);
							log.setEnabled(false);
							ln.setEnabled(false);
							
							sq.setEnabled(false);
							sqrt.setEnabled(false);
							sin.setEnabled(false);
							cos.setEnabled(false);
							tan.setEnabled(false);
							s="";
							t1.setText(s);
							break;
		case R.id.cube:  	s=t1.getText().toString();
							f=Double.parseDouble(s);
							s="";
							f1=f*f*f;
							t1.setText(""+f1);

							
							break;

		case R.id.log:  	s=t1.getText().toString();
							f=Double.parseDouble(s);
							f1=Math.log10(f);
							s="";
							t1.setText(""+f1);
							
							break;
		case R.id.ln:  		s=t1.getText().toString();
							f=Double.parseDouble(s);
							f1=Math.log(f);
							s="";
									t1.setText(""+f1);

							
							break;

		
		case R.id.clear: s="";
						 t1.setText(s);
						 dot.setEnabled(true);
						 plus.setEnabled(false);
							min.setEnabled(false);
							mul.setEnabled(false);
							div.setEnabled(false);
							eq.setEnabled(false);
							clear.setEnabled(false);
							back.setEnabled(false);
							pow.setEnabled(false);
							cube.setEnabled(false);
							log.setEnabled(false);
							ln.setEnabled(false);
							sq.setEnabled(false);
							sqrt.setEnabled(false);
							sin.setEnabled(false);
							cos.setEnabled(false);
							tan.setEnabled(false);
						 break;
		
		case R.id.back: s=t1.getText().toString();
						f1=Double.parseDouble(s);
						s="";
						if(f1>=1)
						{
							i=(int) (f1/10);
							t1.setText(s);
						t1.setText(""+i);
						
						}
						
						else{
							Toast.makeText(this, "Atleast Enter something before editing",3000).show();

						}
						break;
		 
		case R.id.eq: 	dot.setEnabled(true);
				
						switch(op)
						{
							
							case '^': s=t1.getText().toString();
										f1=Double.parseDouble(s);
										s="";
									t1.setText(s);
									f2=Math.pow(f, f1);
									t1.setText(""+f2);
								
								
										break;
						
							case '+': 
										s=t1.getText().toString();
										f1=Double.parseDouble(s);
									 	 f2=f1+f;
									 	 f1=0;
									 	 f=0;
									  	t1.setText(""+f2);
										dot.setEnabled(false);

									  	f2=0;
									  	s="";
				  						x=0;

									  	break;
									  
									  
							case '-':	s=t1.getText().toString();
							f1=Double.parseDouble(s);
							  			f2=f-f1;
							  			f1=0;
									 	 f=0;
									 	
									  	t1.setText(""+f2);	
										dot.setEnabled(false);

									  	f2=0;
				  						x=0;

									  	s="";
							  			
							  			break;		  
							 
							case '*':	s=t1.getText().toString();
							f1=Double.parseDouble(s);
				  						f2=f*f1;
				  						f1=0;
									 	 f=0;
				  						t1.setText(""+f2);
										dot.setEnabled(false);

				  						
				  						f2=0;
				  						s="";
				  						x=0;
				  						break;	
				  			
				  			
							case '/':	s=t1.getText().toString();
							f1=Double.parseDouble(s);
				  						f2=f/f1;
				  						f1=0;
									 	 f=0;
				  						t1.setText(""+f2);
										dot.setEnabled(false);

				  						f2=0;
				  						s="";
				  						break;	
				  						
				  						
				  			default: t1.setText(s);
				  			break;
		
						}
						dot.setEnabled(true);
						eq.setEnabled(false);
	
		break;
		
	}}
	
	

	

}

