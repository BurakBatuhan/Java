package Controller;

import java.util.Timer;
import java.util.TimerTask;

import Model.Cible;
import View.Dekor;



public class ControlleurCible {


	double t = 0;
	boolean b = false;
	Cible cible;
	double vitesse=0;
	
	
	public ControlleurCible(Dekor d1,Cible c,double v){
		cible =c;
		trajectoireCible(c,d1,b);
		vitesse=v;
		
	}
	
	
	public void trajectoireCible(final Cible c,final Dekor d,final boolean b){
		final Timer timer = new Timer(); 
		TimerTask timerTask = new TimerTask(){	
			@Override
			public void run()  { 
				t+=1;
				if(t>vitesse/10){
					timer.cancel();
				}
				else{ 
						c.setAngle(c.getAngle()+1);
						c.set_X(c.get_X()+1);
					d.repaint();
				}
			}
		};
		
		timer.scheduleAtFixedRate(timerTask,0,60);
	}
}
