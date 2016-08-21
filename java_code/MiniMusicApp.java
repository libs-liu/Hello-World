import javax.sound.midi.*;
public class MiniMusicApp {
	public static void main(String [] args) {
	System.out.println("enter main");
	MiniMusicApp mini = new MiniMusicApp();
	
	System.out.println("new MiniMusicApp");
	mini.play();  
	}
	public void play(){
		try{
			System.out.println("enter try");
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			System.out.println("open");
			Sequence seq = new Sequence(Sequence.PPQ,4);

			Track track = seq.createTrack();

			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,44,100);
			MidiEvent noteon = new MidiEvent(a,1);
			track.add(noteon);
			

			ShortMessage b = new ShortMessage();
			a.setMessage(128,1,44,100);
			MidiEvent noteoff = new MidiEvent(b,16);
			track.add(noteoff);
			
			player.setSequence(seq);
			player.start();
			
			System.out.println("end start");
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
