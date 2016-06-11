package main.java.controllers;

import main.java.models.MP3ModelInterface;
import main.java.views.DJView;

public class MP3Controller2 implements ControllerInterface {
	MP3ModelInterface model;
	MP3View view;

	public MP3Controller2(MP3ModelInterface model, MP3View view){
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void start() {
		model.play();
		
	}

	@Override
	public void stop() {
		model.stop();
		
	}

	@Override
	public void increaseBPM() {
		model.nextSong();
		
	}

	@Override
	public void decreaseBPM() {
		model.previousSong();
		
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		
	}
	
	public void setVolumen(double volumen){
		model.setVolumen(volumen);
	}
	
	public void increaseVolumen(){
		double volumen_actual = model.getVolumen();
		model.setVolumen(volumen_actual+0.1);
	}
	
	public void decreaseVolumen(){
		double volumen_actual = model.getVolumen();
		model.setVolumen(volumen_actual-0.1);
	}
	
	public void pause(){
		model.pause();
	}

}