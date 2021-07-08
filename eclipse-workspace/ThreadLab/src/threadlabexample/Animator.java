package threadlabexample;

public class Animator implements Runnable {

	boolean flag = true;
	int count = 0;
	CanvasPanel cp;
	public Animator(CanvasPanel newCanvas)
	{
		cp = newCanvas;
	}
	public void run() {
		
		do{
			cp.moveCircle();
			try{
				Thread.sleep(1000/24);
			}catch(InterruptedException ex)
			{
				
			}
		}while(count < 1000);
		
	}

}
