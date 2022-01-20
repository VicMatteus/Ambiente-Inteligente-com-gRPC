public class Arcondicionado extends Thread
{
	private int temperatura;
	private boolean ligado;
	
	public Arcondicionado()
	{
		this.temperatura = 17;
		this.ligado = true;
		this.start();
	}
	
	@Override
	public void run()//para poder mudar a informação no sevidor
	{
		while(true)
		{
			System.out.println("Temperatura atual do ar-condicionado:" +  this.getTemperatura());
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public boolean isLigado()
	{
		return ligado;
	}
	public void setLigado(boolean ligado)
	{
		this.ligado = ligado;
	}
	
	public int getTemperatura()
	{
		return temperatura;
	}
	public boolean setTemperatura(int temperatura)
	{
		if(temperatura >= 17 && temperatura <= 27)//definindo o limite de valores do ar-condicionado
		{
			this.temperatura = temperatura;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		Arcondicionado arcondi = new Arcondicionado();
		System.out.println(arcondi.setTemperatura(15));
	}
}
